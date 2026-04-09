package module6.activity;

public class Mammal {
    private Animal myAnimal;
    private String name;

    //constructor
    public Mammal(String name) {
        this.name = name;
    }

    public void setAnimal(Animal animal) {
        myAnimal = animal;
    }

    public void animalIsSleeping() {
        System.out.println("Animal named: " + name + "...");
        myAnimal.sleep(); //interface method
    }

    public void animalIsSpeaking() {
        System.out.println("Animal named: " + name + "...");
        myAnimal.animalSound(); //interface method
    }
}
