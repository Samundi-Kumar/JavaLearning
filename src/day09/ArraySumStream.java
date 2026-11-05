
package day09;

import java.util.Arrays;

public class ArraySumStream {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = Arrays.stream(numbers)
                .sum();

        System.out.println("Total Sum: " + sum);
    }
}
/*
package day09;

public class ArraySumLoop {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Total Sum: " + sum);
    }
}
*/