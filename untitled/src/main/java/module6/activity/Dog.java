package module6.activity;

public class Dog implements Animal {
    //dogs behavior
    @Override
    public void animalSound() {
        System.out.println("Dog says: woof woof");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }
}