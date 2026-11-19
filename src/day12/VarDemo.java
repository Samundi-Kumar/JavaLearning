package day12;

public class VarDemo {

    public static void main(String[] args) {

        var name = "Sam";
        var age = 22;
        var salary = 33000.50;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        var numbers = new int[]{10, 20, 30, 40};

        for (var number : numbers) {
            System.out.println(number);
        }
    }
}