import java.util.ArrayList;

public class Modules {
    private ArrayList<Student> students= new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();
    private String name;
    private  String moduleId;

    public Modules(String name, String moduleId){
        this.name = name;
        this.moduleId = moduleId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public Course getCourse(int index) {
        return courses.get(index);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
