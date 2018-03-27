package All.dao;

import com.mongodb.*;

import All.model.Student;
import org.apache.log4j.Logger;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class StudentDao implements InterStudent {

    MongoClient client = new MongoClient();
    DB database = client.getDB("list_student");
    DBCollection collection = database.getCollection("student");
    MongoCredential secure = MongoCredential.createScramSha1Credential("Rjeey", "list_student",
            "1011".toCharArray());
    Logger log = Logger.getLogger("org.mongodb.driver");

    public void save(Student student) {
        BasicDBObject doc = student.toDBobject();
        collection.save(doc);
    }

    public Student get(ObjectId id) {
        DBObject find = new BasicDBObject("_id", id);
        return (Student.fromDBobject(collection.findOne(find)));
    }

    public List<Student> getAll() {
        List<Student> students = new ArrayList<Student>();
        DBCursor cursor = collection.find();
        while (cursor.hasNext()) {
            BasicDBObject dbo = (BasicDBObject) cursor.next();
            students.add(Student.fromDBobject(dbo));
        }
        return students;
    }

    public void remove(ObjectId id) {
        DBObject query = new BasicDBObject("_id", id);
        collection.remove(query);
    }
}
