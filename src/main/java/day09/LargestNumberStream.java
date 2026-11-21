
package day09;

import java.util.Arrays;

public class LargestNumberStream {

    public static void main(String[] args) {

        int[] numbers = {25, 80, 45, 95, 60, 35};

        int largest = Arrays.stream(numbers)
                .max()
                .orElse(0);

        System.out.println("Largest Number: " + largest);
    }
}
/*
package day09;

public class LargestNumberLoop {

    public static void main(String[] args) {

        int[] numbers = {25, 80, 45, 95, 60, 35};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest Number: " + largest);
    }
}*/

