package day07;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Sam");
        students.put(102, "Ravi");
        students.put(103, "Kavin");

        System.out.println(students);

        System.out.println("Student 101: " + students.get(101));
    }
}