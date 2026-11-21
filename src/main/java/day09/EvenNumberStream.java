
package day09;

import java.util.Arrays;

public class EvenNumberStream {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30, 35};

        System.out.println("Even Numbers:");

        Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
/*package day09;

public class EvenNumberLoop {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30, 35};

        System.out.println("Even Numbers:");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}*/
