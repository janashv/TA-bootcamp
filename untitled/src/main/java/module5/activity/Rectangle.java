package module5.activity;

public class Rectangle extends Shape {

    double length = 8;
    double width = 4;

    //method for area
    @Override
    public double calculateArea() {
        return length * width;
    }

    //method for perimeter
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
