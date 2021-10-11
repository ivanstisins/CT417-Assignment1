import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {
    private String name;
    private DateTime startTime;
    private DateTime endTime;
    private ArrayList<Student> students= new ArrayList<Student>();
    private ArrayList<Modules> modules= new ArrayList<Modules>();

    public Course(DateTime startTime, DateTime endTime, String name){
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    public DateTime getEndTime() {
        return endTime;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudent(int index) {
        for(index =0; index< students.size(); index++) {
            return students.get(index);
        }
        return null;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addModule(Modules module){
        modules.add(module);
    }

    public Modules getModule(int index) {
        for(index =0; index< modules.size(); index++) {
            return modules.get(index);
        }
        return null;
    }

    public ArrayList<Modules> getModules() {
        return modules;
    }
}
