package module10.activity.activities1and2;

public abstract class Person {
    //attributes
    private String name;
    private int age;

    //returns name
    public String getName() {
        return name;
    }

    //sets the name
    public void setName(String name) {
        this.name = name;
    }

   //gets the name
    public int getAge() {
        return age;
    }

    //sets the age of person
    public void setAge(int age) {
        this.age = age;
    }

    //person introduction
    public void introduce() {
        System.out.println("Hello! My name is " + name + " . I am " + age + " years old!");
    }
}
