package day01;

public class NumberPattern {
    public static void main(String[] args) {

        // Pattern 1: Increasing Number Triangle
        System.out.println("Pattern 1:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Pattern 2: Repeated Number Triangle
        System.out.println("\nPattern 2:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}