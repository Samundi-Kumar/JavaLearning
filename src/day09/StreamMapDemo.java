
package day09;//add 5 bonus marks to every student.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(50, 60, 70, 80, 90);

        System.out.println("Original Marks:");
        System.out.println(marks);

        List<Integer> updatedMarks = marks.stream()
                .map(mark -> mark + 5)
                .collect(Collectors.toList());

        System.out.println("Marks After Adding Bonus:");
        System.out.println(updatedMarks);
    }
}
