package module6.activity;

public class AnimalActivity {
    public static void main(String arg[]) {

        //use interface as type
        Animal cat = new Cat();
        Animal dog = new Dog();

        //create mammal

        //cat
        Mammal catMammal = new Mammal("Barsik");
        catMammal.setAnimal(new Cat());
        catMammal.animalIsSleeping();
        catMammal.animalIsSpeaking();

        System.out.println("----------------------");

        //dog
        Mammal dogMammal = new Mammal("Sharik");
        dogMammal.setAnimal(new Dog());
        dogMammal.animalIsSleeping();
        dogMammal.animalIsSpeaking();
    }
}