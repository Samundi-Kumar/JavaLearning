package day02;

import java.util.Scanner;

public class ArrayEg {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int []marks= new int [5];
        for (int i= 0; i<5; i++)
        {
            marks[i]=scan. nextInt();

        }
        for (int i= 0; i<5; i++)
        {
          System.out.print(marks[i] + " ");

        }
    }

}
//got input for 5 numbers using Array and for loop