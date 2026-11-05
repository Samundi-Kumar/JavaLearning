
package day09;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sam", "Ravi", "Kavin", "Priya");

        System.out.println("Student Names:");

        names.forEach(System.out::println);
    }
}
