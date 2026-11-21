
package day09;//calculate the total marks.

import java.util.Arrays;
import java.util.List;

public class StreamReduceDemo {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(50, 60, 70, 80, 90);

        System.out.println("Student Marks:");
        System.out.println(marks);

        int total = marks.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Total Marks: " + total);
    }
}
