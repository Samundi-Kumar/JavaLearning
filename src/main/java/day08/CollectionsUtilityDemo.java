package day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Original: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        System.out.println("Largest: " + Collections.max(numbers));

        System.out.println("Smallest: " + Collections.min(numbers));
    }
}