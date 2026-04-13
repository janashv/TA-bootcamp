package module10.activity.activity6;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike started the engine");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped the engine");
    }
}
