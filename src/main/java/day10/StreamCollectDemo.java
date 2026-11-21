package day10;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> result = numbers.stream()
                .filter(n -> n >= 30)
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Filtered List: " + result);
    }
}