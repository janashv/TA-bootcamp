package module10.activity.activities1and2;

//this class is to test Person, Employee and Student classes
public class AbstractActivity {
    public static void main(String[] args) {

        //employee object
        Employee employee = new Employee("Jana", 22, "Test Automation specialist", "Accenture", 1000000);
        employee.introduce();

        System.out.println("-------------");

        //student object
        Student student = new Student("Jana", 22, "Bootcamp");
        student.introduce();
    }
}