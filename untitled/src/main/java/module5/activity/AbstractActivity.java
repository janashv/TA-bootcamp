package module5.activity;

public class AbstractActivity {

    public static void main(String args[]) {

        //rectangle values passed from here
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.setColor("purple");

        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.printf("Rectangle Area: %.3f\n", rectangle.calculateArea());
        System.out.printf("Rectangle Perimeter: %.3f\n", rectangle.calculatePerimeter());

        System.out.println("-----------------------------");

        //circle value passed from here
        Circle circle = new Circle(7);
        circle.setColor("yellow");

        System.out.println("Circle Color: " + circle.getColor());
        System.out.printf("Circle Area: %.3f\n", circle.calculateArea());
        System.out.printf("Circle Perimeter: %.3f\n", circle.calculatePerimeter());
    }
}
