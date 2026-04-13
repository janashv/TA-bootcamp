package module10.activity.activity6;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car engine started");
    }
    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }
}