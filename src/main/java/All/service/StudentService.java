package All.service;

import All.dao.StudentDao;
import All.model.Student;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public void add(Student student) {
        studentDao.save(student);
    }

    public void update(Student student) {
        studentDao.save(student);
    }

    public Student get(ObjectId id) {
        return studentDao.get(id);
    }

    public List<Student> getAll() {
        return studentDao.getAll();
    }

    public void remove(ObjectId id) {
        studentDao.remove(id);
    }


}
