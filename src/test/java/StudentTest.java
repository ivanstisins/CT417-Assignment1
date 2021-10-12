import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student instance = new Student("Ivans", 18, "28/02/2000", "18357623");
    Course course1 = new Course(new DateTime(2021,9,06,0,0),
            new DateTime(2025,05,10,0,0),"CS&IT");
    Course course2 = new Course(new DateTime(2021,9,06,0,0),
            new DateTime(2025,05,10,0,0),"ECE");
    Modules module1 = new Modules("Machine Learning","CT4101");
    Modules module2 = new Modules("Software Engineering","CT417");
    // @Test
    //void setName() {

    //}

    @Test
    void getName() {
        String name = "Ivans";
        String expectedName = instance.getName();
        assertEquals(expectedName, name);
    }


    @Test
    void getAge() {
        int age = 18;
        int expectedAge = instance.getAge();
        assertEquals(expectedAge, age);
    }


    @Test
    void getDob() {
        String dob = "28/02/2000";
        String expectedDob = instance.getDob();
        assertEquals(expectedDob, dob);
    }

    @Test
    void setUsername() {
        String username = "Ivans18";
        String name = instance.getName();
        int age = instance.getAge();
        instance.setUsername();
        assertEquals(instance.getUsername(), username);
    }

    @Test
    void getUsername() {
        String username= "Ivans18";
        String name = instance.getName();
        int age = instance.getAge();
        instance.setUsername();
        String expectedUN = instance.getUsername();
        assertEquals(expectedUN, username);
    }


    @Test
    void getId() {
        String id = "18357623";
        String expectedId = instance.getId();
        assertEquals(expectedId, id);
    }

    @Test
    void addCourse(){
        instance.addCourse(course1);
        instance.addCourse(course2);
        assertEquals(instance.getCourse(1), course1);
    }

    @Test
    void getCourse() {
        instance.addCourse(course1);
        instance.addCourse(course2);
        Course actualCourse = instance.getCourse(0);
        assertEquals(actualCourse, course1);
    }

    @Test
    void addModules(){
        instance.addModule(module1);
        instance.addModule(module2);
        assertEquals(instance.getModule(1),module1);
    }

    @Test
    void getModule() {
        instance.addModule(module1);
        instance.addModule(module2);
        Modules actualmModule = instance.getModule(0);
        assertEquals(actualmModule, module1);
    }

    @Test
    void getModules(){
        instance.addModule(module1);
        instance.addModule(module2);
        instance.addCourse(course1);
        instance.addCourse(course2);
        ArrayList<Modules> modules= instance.getModules();
        ArrayList<Course> courses =instance.getCourses();
        assertEquals(modules, instance.getModules());

    }

    @Test
     void getCourses(){
        instance.addModule(module1);
        instance.addModule(module2);
        instance.addCourse(course1);
        instance.addCourse(course2);
        ArrayList<Modules> modules= instance.getModules();
        ArrayList<Course> courses =instance.getCourses();
        assertEquals(courses, instance.getCourses());

    }
}

