package day07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Worker {

    String name;
    int age;
    double salary;

    Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + age + " - " + salary;
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();

        workers.add(new Worker("Sam", 25, 40000));
        workers.add(new Worker("Ravi", 22, 30000));
        workers.add(new Worker("Kavin", 28, 50000));

        workers.sort(Comparator.comparingDouble(w -> w.salary));

        System.out.println("Sorted by salary:");
        workers.forEach(System.out::println);
    }
}
