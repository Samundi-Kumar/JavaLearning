
package day09;

import java.util.Arrays;
import java.util.List;

public class StreamLimitSkipDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        System.out.println("Original Numbers:");
        System.out.println(numbers);

        System.out.println("First Three Numbers:");

        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("After Skipping First Three Numbers:");

        numbers.stream()
                .skip(3)
                .forEach(System.out::println);
    }
}
