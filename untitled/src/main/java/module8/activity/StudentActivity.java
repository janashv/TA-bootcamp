package module8.activity;

import java.util.ArrayList;

public class StudentActivity {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        //adding students
        addStudent(students, new Student(1, "Anna", 7.5));
        addStudent(students, new Student(2, "Lanna", 8.0));
        addStudent(students, new Student(3, "Janna", 6.5));
        addStudent(students, new Student(4, "Yanna", 9.0));

        System.out.println("All Students:");
        printStudents(students);

        //remove student with id=3
        removeStudentById(students, 3);

        System.out.println("\nAfter removing student with ID 3:");
        printStudents(students);

        //seeking for highest grade student
        Student topStudent = findHighestGrade(students);
        System.out.println("\nTop Student:");
        topStudent.printStudent();
    }

    //method to add student
    public static void addStudent(ArrayList<Student> students, Student newStudent) {

        for (Student s : students) {
            if (s.getId() == newStudent.getId()) {
                System.out.println("Student with ID " + newStudent.getId() + " already exists!");
                return;
            }
        }
        students.add(newStudent);
    }
    //method to print students
    public static void printStudents(ArrayList<Student> students) {
        for (Student s : students) {
            s.printStudent();
        }
    }
    //method to remove student by ID
    public static void removeStudentById(ArrayList<Student> students, int id) {
        students.removeIf(s -> s.getId() == id);
    }
    //method to find highest grade student
    public static Student findHighestGrade(ArrayList<Student> students) {
        Student top = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > top.getGrade()) {
                top = s;
            }
        }
        return top;
    }
}