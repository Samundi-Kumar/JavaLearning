package day12;

record EmployeeRecord(int id, String name, double salary) {
}

public class POJOToRecord {

    public static void main(String[] args) {

        EmployeeRecord employee =
                new EmployeeRecord(101, "Samundi", 33000);

        System.out.println("Employee ID: " + employee.id());
        System.out.println("Employee Name: " + employee.name());
        System.out.println("Salary: " + employee.salary());

        System.out.println(employee);
    }
}