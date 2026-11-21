
package day09;//display only even numbers.

import java.util.Arrays;
import java.util.List;

public class StreamFilterDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        System.out.println("Original Numbers:");
        System.out.println(numbers);

        System.out.println("Even Numbers:");

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
