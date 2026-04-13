package module10.activity.activities1and2;

import java.util.List;

public class Employee extends Person {
    //attributes
    private String jobTitle;
    private String company;
    private double salary;

    public Employee() {
    }

    //constuctor
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    //getters and setters for job title
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //getters and setters for company
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    //getters and setters for salary
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //introduces the employee.
    @Override
    public void introduce() {
        System.out.println("Hello! My name is " + getName() + "! I am " + getAge() + " years old.");
        System.out.println("I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

    //returns name of the employee with the highest salary
    public static String getHighestPaidEmp(List<Employee> employeeList) {
        if (employeeList == null || employeeList.isEmpty()) {
            return "No employees found";
        }
        Employee highestPaidEmployee = employeeList.get(0);

        for (Employee employee : employeeList) {
            if (employee.getSalary() > highestPaidEmployee.getSalary()) {
                highestPaidEmployee = employee;
            }
        }
        return highestPaidEmployee.getName();
        }
}