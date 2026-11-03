package day07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class EmployeeRecord {

    String name;
    String department;
    double salary;

    EmployeeRecord(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " | " + department + " | " + salary;
    }
}

public class MultiFieldSortingDemo {

    public static void main(String[] args) {

        List<EmployeeRecord> employees = new ArrayList<>();

        employees.add(new EmployeeRecord("Sam", "IT", 50000));
        employees.add(new EmployeeRecord("Ravi", "HR", 30000));
        employees.add(new EmployeeRecord("Kavin", "IT", 40000));
        employees.add(new EmployeeRecord("Arun", "HR", 35000));

        employees.sort(
                Comparator.comparing((EmployeeRecord e) -> e.department)
                        .thenComparingDouble(e -> e.salary)
        );

        System.out.println("Employees after sorting:");

        for (EmployeeRecord employee : employees) {
            System.out.println(employee);
        }
    }
}