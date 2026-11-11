
package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class CSVReadDemo {

    public static void main(String[] args) {

        Path path = Path.of("students.csv");

        try {
            List<String> students = Files.readAllLines(path);

            System.out.println("Student Records:");

            for (String student : students) {
                System.out.println(student);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
