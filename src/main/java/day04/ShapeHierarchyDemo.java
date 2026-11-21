package day04;

abstract class ShapeBase {

    abstract double calculateArea();
}

class CircleShapeDemo extends ShapeBase {

    double radius = 5;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class RectangleShapeDemo extends ShapeBase {

    double length = 10;
    double width = 5;

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeHierarchyDemo {

    public static void main(String[] args) {

        CircleShapeDemo circle = new CircleShapeDemo();
        RectangleShapeDemo rectangle = new RectangleShapeDemo();

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}