package module6.activity;

public class Cat implements Animal {
    //cats behavior
    @Override
    public void animalSound() {
        System.out.println("Cat says: meow meow");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }
}
