package day08;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

    public static void displayNumbers(List<? extends Number> numbers) {

        for (Number number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(20);

        List<Double> numbers2 = new ArrayList<>();
        numbers2.add(5.5);
        numbers2.add(8.5);

        System.out.println("Integer values:");
        displayNumbers(numbers1);

        System.out.println("Double values:");
        displayNumbers(numbers2);
    }
}