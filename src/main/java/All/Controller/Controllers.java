package All.Controller;

import All.model.Student;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import All.service.StudentService;

@Controller
public class Controllers {

    @Autowired
    private StudentService service;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showall() {
        ModelAndView modelAndView = new ModelAndView("/all");
        modelAndView.addObject("student", service.getAll());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("/addPage", "student", new Student());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") Student student) {
        if (student.getId() == null) {
            service.add(student);
        } else service.update(student);
        return "redirect:/";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView showEditForm(@RequestParam(required = true) ObjectId id) {
        return new ModelAndView("/addPage", "student", service.get(id));
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteStudent(@RequestParam(required = true) ObjectId id) {
        service.remove(id);
        return "redirect:/";
    }

}
