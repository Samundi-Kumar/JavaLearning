package day12;

public class TextBlocks {

    public static void main(String[] args) {

        String employeeDetails = """
                {
                    "id": 101,
                    "name": "Samundi",
                    "department": "Technology",
                    "role": "Java Developer"
                }
                """;

        System.out.println(employeeDetails);
    }
}