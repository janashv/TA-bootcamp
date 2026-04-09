package module3.activity;

public class CarInstance {

    public static void main(String[] args) {

        //car object
        Car car = new Car("BMW", "yellow", "2019");

        //print car name
        System.out.println("Car name: " + car.name);

        //print all attributes
        System.out.println("Car details:");
        System.out.println("Name: " + car.name);
        System.out.println("Color: " + car.color);
        System.out.println("Model number: " + car.modelNo);
    }
}