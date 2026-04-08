package module5.activity;

public class AbstractActivity {
    public static void main(String args[]) {

        //rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("purple");

        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        System.out.println("-----------------------------");

        //circle
        Circle circle = new Circle();
        circle.setColor("yellow");

        System.out.println("Circle color: " + circle.getColor());
        System.out.printf("Circle area: %.3f\n", circle.calculateArea());
        System.out.printf("Circle perimeter: %.3f\n", circle.calculatePerimeter());
    }
}
