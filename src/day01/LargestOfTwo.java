package day01;

import java.util.Scanner;

public class LargestOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println("Largest number: " + first);
        } else if (second > first) {
            System.out.println("Largest number: " + second);
        } else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}