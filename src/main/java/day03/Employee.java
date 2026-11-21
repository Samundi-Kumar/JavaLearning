package day03;

public class Employee {
    private String name;
    private double salary;

    // 2. Public Getter for name
    public String getName() {
        return name;
    }

    // 3. Public Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // 4. Public Getter for salary
    public double getSalary() {
        return salary;
    }

    // 5. Public Setter for salary with data validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary must be positive.");
        }
    }
}

