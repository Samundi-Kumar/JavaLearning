package day12.Sealed_Classes;

public final class Rectangle extends Shape {

    double length = 10;
    double width = 5;

    public double calculateArea() {
        return length * width;
    }
}