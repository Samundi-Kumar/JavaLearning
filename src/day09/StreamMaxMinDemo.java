
package day09;

import java.util.Arrays;
import java.util.List;

public class StreamMaxMinDemo {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(75, 90, 65, 95, 80);

        int highest = marks.stream()
                .max(Integer::compareTo)
                .orElse(0);

        int lowest = marks.stream()
                .min(Integer::compareTo)
                .orElse(0);

        System.out.println("Student Marks: " + marks);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}

