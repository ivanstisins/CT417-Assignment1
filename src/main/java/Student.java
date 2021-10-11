import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String dob;
    private String id;
    private String username;
    private ArrayList<Modules> modules= new ArrayList<Modules>();
    private ArrayList<Course> course = new ArrayList<Course>();

    public Student(String name, int age, String dob, String id){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public String getDob(){
        return  dob;
    }

    public void setUsername(){
        this.username = this.name + this.age;
    }

    public String getUsername(){
        return username;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return  id;
    }

    public void addCourse(Course course1){
        course.add(course1);
    }

    public Course getCourse(int index) {
        for(index =0; index< course.size(); index++) {
            return course.get(index);
        }
        return null;
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

    public ArrayList<Course> getCourses() {
        return course;
    }
}
