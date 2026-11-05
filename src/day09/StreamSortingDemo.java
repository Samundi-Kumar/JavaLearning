
package day09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortingDemo {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(75, 90, 65, 95, 80);

        System.out.println("Original Marks:");
        System.out.println(marks);

        System.out.println("Marks in Ascending Order:");

        marks.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Marks in Descending Order:");

        marks.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
