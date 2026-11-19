package day17.Sealed_Classes;

public sealed class Shape
        permits Circle, Rectangle {

    public void display() {
        System.out.println("This is a Shape");
    }
}