package day04;

interface ShapeType {

    double calculateArea();
}

class CircleShape implements ShapeType {

    double radius = 5;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class RectangleShape implements ShapeType {

    double length = 10;
    double width = 5;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeInterfaceDemo {

    public static void main(String[] args) {

        ShapeType circle = new CircleShape();
        ShapeType rectangle = new RectangleShape();

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}