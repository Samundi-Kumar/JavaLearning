
package day09;

interface Addition {
    int add(int a, int b);
}

public class LambdaWithParameters {

    public static void main(String[] args) {

        Addition addition = (a, b) -> a + b;

        int result = addition.add(10, 20);

        System.out.println("First Number: 10");
        System.out.println("Second Number: 20");
        System.out.println("Sum: " + result);
    }
}
