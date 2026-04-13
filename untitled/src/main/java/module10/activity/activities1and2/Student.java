package module10.activity.activities1and2;

public class Student extends Person {

    //attribute
    private String schoolName;

    // Default constructor
    public Student() {
    }

    //Constructor with parameters
    public Student(String name, int age, String schoolName) {
        setName(name);
        setAge(age);
        this.schoolName = schoolName;
    }
    //getters and setters
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //Override introduce method
    @Override
    public void introduce() {
        System.out.println("Hey. My name is " + getName() + " and I am " + getAge() + " years old");
        System.out.println("Currently I am studying in university of " + schoolName);
    }
}