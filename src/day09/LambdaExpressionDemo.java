
package day09;

// Functional Interface
interface Greeting {
    void sayHello();
}

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        // Lambda Expression
        Greeting greeting = () -> {
            System.out.println("I am learning Java Lambda Expressions.");
        };

        // Calling the method
        greeting.sayHello();
    }
}

