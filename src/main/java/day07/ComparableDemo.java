package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {

    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Sam", 25));
        employees.add(new Employee("Ravi", 22));
        employees.add(new Employee("Kavin", 28));

        Collections.sort(employees);

        System.out.println(employees);
    }
}