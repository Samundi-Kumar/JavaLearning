package day03;

public class Main {

        public static void main(String[] args) {
            Employee emp = new Employee();

            // Direct access is forbidden: emp.name = "John"; (Will cause a compile error)

            // Accessing data via public methods
            emp.setName("John Doe");
            emp.setSalary(50000.0);

            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee Salary: $" + emp.getSalary());
        }
    }

