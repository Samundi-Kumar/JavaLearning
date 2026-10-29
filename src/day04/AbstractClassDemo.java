package day04;

abstract class Shape {

    abstract void calculateArea();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {

    int length = 10;
    int width = 5;

    @Override
    void calculateArea() {
        System.out.println("Rectangle area: " + (length * width));
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.display();
        rectangle.calculateArea();
    }
}