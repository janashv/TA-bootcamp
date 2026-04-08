package module5.activity;

public class Employee_I extends Person_I {

    //employee attributes
    double salary;
    String title;

    //setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //method to print info about employee
    public void printEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Title: " + title);
        System.out.println("Salary: " + salary);
    }
}
