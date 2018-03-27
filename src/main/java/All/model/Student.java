package All.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;


public class Student {

    public ObjectId id = new ObjectId();

    private String name;
    private String surename;
    private String date;
    private int number;
    private int course;
    private String gender;
    private boolean payskin;

    public Student(String name, String surename, String date, int number, int course, String gender, boolean payskin) {
        this.name = name;
        this.surename = surename;
        this.date = date;
        this.number = number;
        this.course = course;
        this.gender = gender;
        this.payskin = payskin;
    }

    public Student() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isPayskin() {
        return payskin;
    }

    public void setPayskin(boolean payskin) {
        this.payskin = payskin;
    }

    public BasicDBObject toDBobject() {

        BasicDBObject doc = new BasicDBObject();

        doc.put("_id", id);
        doc.put("name", name);
        doc.put("surename", surename);
        doc.put("date", date);
        doc.put("number", number);
        doc.put("course", course);
        doc.put("gender", gender);
        doc.put("Pay skin", payskin);

        return doc;
    }

    public static Student fromDBobject(DBObject document) {

        Student st = new Student();

        st.id = (ObjectId) document.get("_id");
        st.name = (String) document.get("name");
        st.surename = (String) document.get("surename");
        st.date = (String) document.get("date");
        st.number = (Integer) document.get("number");
        st.course = (Integer) document.get("course");
        st.gender = (String) document.get("gender");
        st.payskin = (Boolean) document.get("Pay skin");

        return st;
    }

}
