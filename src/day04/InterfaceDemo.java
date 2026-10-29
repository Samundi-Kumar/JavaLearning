package day04;

interface ShapeInterface {

    void calculateArea();

    default void display() {
        System.out.println("Calculating shape area.");
    }

    static void information() {
        System.out.println("Shapes have different areas.");
    }
}

class Circle implements ShapeInterface {

    double radius = 5;

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.display();
        circle.calculateArea();

        ShapeInterface.information();
    }
}
