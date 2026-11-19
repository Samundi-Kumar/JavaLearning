package day17;

public class EmployeeJson {

    public static void main(String[] args) {

        Employee employee = new Employee(
                101,
                "Sam",
                33000
        );

        String json = """
                {
                    "id": %d,
                    "name": "%s",
                    "salary": %.2f
                }
                """.formatted(
                employee.getId(),
                employee.getName(),
                employee.getSalary()
        );

        System.out.println(json);
    }
}