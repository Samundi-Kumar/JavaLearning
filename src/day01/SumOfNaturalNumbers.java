package day01;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Please enter a positive number.");
        } else {
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum = sum + i;
            }

            System.out.println("Sum: " + sum);
        }

        sc.close();
    }
}