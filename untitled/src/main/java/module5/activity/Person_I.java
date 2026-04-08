package module5.activity;

public class Person_I {

    //person attributes
    String name;
    int age;

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //method to print an info about person
    public void printPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}