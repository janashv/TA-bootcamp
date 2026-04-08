package module5.activity;

public class Circle extends Shape {

    double radius = 7;

//method for area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    //method for perimeter
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}