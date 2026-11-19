package day12.Sealed_Classes;

public final class Circle extends Shape {

    double radius = 5;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}