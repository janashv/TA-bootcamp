package module9.activity;

import junit.framework.TestCase;
import module8.activity.Student;
import module8.activity.StudentActivity;

import java.util.ArrayList;

public class StudentTest extends TestCase {

    private ArrayList<Student> students;

    @Override
    protected void setUp() {
        students = new ArrayList<>();
    }

    @Override
    protected void tearDown() {
        students = null;
    }

    //1. student is added successfully
    public void testAddStudent() {
        StudentActivity.addStudent(students, new Student(1, "Anna", 7.5));

        assertEquals(1, students.size());
        assertEquals(1, students.get(0).getId());
        assertEquals("Anna", students.get(0).getName());
        assertEquals(7.5, students.get(0).getGrade());
    }

    //2. duplicate ID should not be added
    public void testAddDuplicateStudentId() {
        StudentActivity.addStudent(students, new Student(1, "Anna", 7.5));
        StudentActivity.addStudent(students, new Student(1, "Lanna", 8.0));

        assertEquals(1, students.size());
        assertEquals("Anna", students.get(0).getName());
    }

    //3. remove student by ID
    public void testRemoveStudentById() {
        StudentActivity.addStudent(students, new Student(1, "Anna", 7.5));
        StudentActivity.addStudent(students, new Student(2, "Lanna", 8.0));
        StudentActivity.addStudent(students, new Student(3, "Janna", 6.5));

        StudentActivity.removeStudentById(students, 2);

        assertEquals(2, students.size());
        assertEquals(1, students.get(0).getId());
        assertEquals(3, students.get(1).getId());
    }

    //4. Test 4: find highest grade student
    public void testFindHighestGrade() {
        StudentActivity.addStudent(students, new Student(1, "Anna", 7.5));
        StudentActivity.addStudent(students, new Student(2, "Lanna", 8.0));
        StudentActivity.addStudent(students, new Student(3, "Janna", 6.5));
        StudentActivity.addStudent(students, new Student(4, "Yanna", 9.0));

        Student topStudent = StudentActivity.findHighestGrade(students);

        assertNotNull(topStudent);
        assertEquals(4, topStudent.getId());
        assertEquals("Yanna", topStudent.getName());
        assertEquals(9.0, topStudent.getGrade());
    }

    //5. Test 5: remove non-existing ID should not change list
    public void testRemoveNonExistingStudentId() {
        StudentActivity.addStudent(students, new Student(1, "Anna", 7.5));
        StudentActivity.addStudent(students, new Student(2, "Lanna", 8.0));

        StudentActivity.removeStudentById(students, 99);

        assertEquals(2, students.size());
        assertEquals(1, students.get(0).getId());
        assertEquals(2, students.get(1).getId());
    }
}