package All.dao;

import All.model.Student;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterStudent {
    void save(Student student);
    Student get(ObjectId id);
    List<Student> getAll();
    void remove (ObjectId id);

}
