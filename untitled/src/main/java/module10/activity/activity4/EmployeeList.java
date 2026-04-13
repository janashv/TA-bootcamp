package module10.activity.activity4;

import module10.activity.activities1and2.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jana", 22, "Test Automation specialist", "Accenture", 1000000);
        Employee employee2 = new Employee("Igor", 55, "Boss", "Riot Games", 690000);
        Employee employee3 = new Employee("Danila", 29, "Musician", "Freelance", 1000000);
        Employee employee4 = new Employee("Shakboz", 35, "Java Software developer", "Accenture", 950000);
        Employee employee5 = new Employee("Yana", 27, "Best Developer", "Apple", 7000000);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);

        System.out.println("The Employee whose salary is the highest is : "
                + Employee.getHighestPaidEmp(empList));
    }
}
