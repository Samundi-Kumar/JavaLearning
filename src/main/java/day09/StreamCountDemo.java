
package day09;

import java.util.Arrays;
import java.util.List;

public class StreamCountDemo {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(85, 45, 90, 35, 75, 60, 95);

        long passedStudents = marks.stream()
                .filter(mark -> mark >= 50)
                .count();

        long failedStudents = marks.stream()
                .filter(mark -> mark < 50)
                .count();

        System.out.println("Student Marks: " + marks);
        System.out.println("Passed Students: " + passedStudents);
        System.out.println("Failed Students: " + failedStudents);
    }
}
