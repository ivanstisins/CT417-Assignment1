import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ModulesTest {
    Modules instance = new Modules("Machine Learning", "CT4101");
    Student student1 = new Student("Ivans", 18, "28/02/2000", "18357623");
    Student student2 = new Student("Oscar", 20, "23/01/2001", "1187323");
    Course course1 = new Course(new DateTime(2021,9,06,0,0),
            new DateTime(2025,05,10,0,0),"CS&IT");
    Course course2 = new Course(new DateTime(2021,9,06,0,0),
            new DateTime(2025,05,10,0,0),"ECE");

    @Test
    void getName() {
        String name = "Machine Learning";
        String expectedName = instance.getName();
        assertEquals(expectedName,name);
    }

    @Test
    void getModuleId() {
        String moduleId = "CT4101";
        String expectedMI = instance.getModuleId();
        assertEquals(expectedMI,moduleId);
    }

    @Test
    void addStudent() {
        instance.addStudent(student1);
        instance.addStudent(student2);
        assertEquals(instance.getStudent(1),student1);
    }

    @Test
    void getStudent() {
        instance.addStudent(student1);
        instance.addStudent(student2);
        Student actualStudent = instance.getStudent(1);
        assertEquals(actualStudent, student1);
    }

    @Test
    void getStudents(){
        instance.addCourse(course1);
        instance.addCourse(course2);
        instance.addStudent(student1);
        instance.addStudent(student1);
        ArrayList<Course> courses= instance.getCourses();
        ArrayList<Student> students =instance.getStudents();
        assertEquals(students, instance.getStudents());
    }

    @Test
    void addCourse() {
        instance.addCourse(course1);
        instance.addCourse(course2);
        assertEquals(instance.getCourse(1), course1);
    }

    @Test
    void getCourse() {
        instance.addCourse(course1);
        instance.addCourse(course2);
        Course actualCourse = instance.getCourse(1);
        assertEquals(actualCourse, course1);
    }

    @Test
    void getCourses(){
        instance.addCourse(course1);
        instance.addCourse(course2);
        instance.addStudent(student1);
        instance.addStudent(student2);
        ArrayList<Course> courses= instance.getCourses();
        ArrayList<Student> students =instance.getStudents();
        assertEquals(courses, instance.getCourses());
    }
}