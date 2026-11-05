
package day09;

import java.util.Arrays;
import java.util.List;

public class StreamDistinctDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 40, 50, 30);

        System.out.println("Original Numbers:");
        System.out.println(numbers);

        System.out.println("Numbers After Removing Duplicates:");

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}

