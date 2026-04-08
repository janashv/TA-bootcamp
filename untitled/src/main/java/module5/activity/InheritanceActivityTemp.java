package module5.activity;

public class InheritanceActivityTemp {
    public static void main(String[] args) {

        //create Person object
        Person_I myPerson = new Person_I();
        myPerson.setName("Sarah Johnson");
        myPerson.setAge(21);

        System.out.println("-----------------------------");

        //create employee object
        Employee_I myEmployee = new Employee_I();
        myEmployee.setName("Shawn Cun");
        myEmployee.setAge(32);
        myEmployee.setTitle("Developer");
        myEmployee.setSalary(70000.00);

        //print employee info
        myEmployee.printEmployeeInfo();

        System.out.println("-----------------------------");

        //print person info
        myPerson.printPersonInfo();

        System.out.println("-----------------------------");
    }
}
