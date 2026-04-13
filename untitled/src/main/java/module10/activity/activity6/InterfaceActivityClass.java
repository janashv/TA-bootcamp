package module10.activity.activity6;

public class InterfaceActivityClass {
    public static void main(String[] args) {

        //bike object
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println("--------------");

        //car object
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}