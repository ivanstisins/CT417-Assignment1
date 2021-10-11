import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course instance = new Course(new DateTime(2021,9,06,0,0),
            new DateTime(2025,05,10,0,0),"CS&IT");
    Student student1 = new Student("Ivans", 18, "28/02/2000", "18357623");
    Student student2 = new Student("Oscar", 20, "23/01/2001", "1187323");
    Modules module1 = new Modules("Machine Learning","CT4101");
    Modules module2 = new Modules("Information Retrieval","CT4100");
    @Test
    void getName() {
        String name = "CS&IT";
        String expectedN = instance.getName();
        assertEquals(expectedN, name);
    }

    @Test
    void getEndTime() {
        DateTime endDate = new DateTime(2025,5,10,0,0);
        DateTime exepctedED = instance.getEndTime();
        assertEquals(exepctedED, endDate);
    }

    @Test
    void getStartTime() {
        DateTime startDate = new DateTime(2021,9,6,0,0);
        DateTime expectedST = instance.getStartTime();
        assertEquals(expectedST,startDate);
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
    void addModule() {
        instance.addModule(module1);
        instance.addModule(module2);
        assertEquals(instance.getModule(1),module1);
    }

    @Test
    void getModule() {
        instance.addModule(module1);
        instance.addModule(module2);
        Modules actualModule = instance.getModule(1);
        assertEquals(actualModule, module1);
    }

    @Test
    void getStudents(){
        instance.addModule(module1);
        instance.addModule(module2);
        instance.addStudent(student1);
        instance.addStudent(student1);
        ArrayList<Modules> modules= instance.getModules();
        ArrayList<Student> students =instance.getStudents();
        assertEquals(students, instance.getStudents());
    }

    @Test
    void getModules(){
        instance.addModule(module1);
        instance.addModule(module2);
        instance.addStudent(student1);
        instance.addStudent(student1);
        ArrayList<Modules> modules= instance.getModules();
        ArrayList<Student> students =instance.getStudents();
        assertEquals(modules, instance.getModules());

    }
}