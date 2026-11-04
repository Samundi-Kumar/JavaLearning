package day08;

class Calculator<T extends Number> {

    T number;

    Calculator(T number) {
        this.number = number;
    }

    double square() {
        return number.doubleValue() * number.doubleValue();
    }
}

public class BoundedTypeDemo {

    public static void main(String[] args) {

        Calculator<Integer> obj1 = new Calculator<>(5);

        Calculator<Double> obj2 = new Calculator<>(4.5);

        System.out.println("Integer square: " + obj1.square());
        System.out.println("Double square: " + obj2.square());
    }
}