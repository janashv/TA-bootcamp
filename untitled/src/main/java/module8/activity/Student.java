package module8.activity;

public class Student {

    //attributes
    private int id;
    private String name;
    private double grade;

    //constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //print student details
    public void printStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }
}