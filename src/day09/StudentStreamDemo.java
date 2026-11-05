
package day09;

import java.util.Arrays;
import java.util.List;

class StudentRecord {

    private int id;
    private String name;
    private int marks;

    public StudentRecord(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class StudentStreamDemo {

    public static void main(String[] args) {

        List<StudentRecord> students = Arrays.asList(
                new StudentRecord(101, "Sam", 85),
                new StudentRecord(102, "Ravi", 70),
                new StudentRecord(103, "Kavin", 95),
                new StudentRecord(104, "Priya", 78),
                new StudentRecord(105, "Arun", 90)
        );

        System.out.println("Students scoring 80 or above:");

        students.stream()
                .filter(student -> student.getMarks() >= 80)
                .forEach(student ->
                        System.out.println(
                                student.getName() + " - " + student.getMarks()
                        )
                );
    }
}
