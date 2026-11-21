package day17;

import java.util.Arrays;
import java.util.List;

public class VarDemo {

    public static void main(String[] args) {

        var name = "Sam";
        var age = 22;
        var salary = 33000.50;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        var numbers = new int[]{10, 20, 30, 40};//integer array
        List<Integer> numberList= Arrays.stream(numbers)
                        .boxed()
                                .toList();

        numberList.forEach(System.out::println);


    }
}