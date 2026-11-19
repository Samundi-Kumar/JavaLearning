package day12.Sealed_Classes;

public class SealedClassDemo {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.display();

        System.out.println(
                "Circle Area: " + circle.calculateArea()
        );

        Rectangle rectangle = new Rectangle();

        System.out.println(
                "Rectangle Area: " + rectangle.calculateArea()
        );
    }
}