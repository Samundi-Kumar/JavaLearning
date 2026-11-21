
package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CSVWriteDemo {

    public static void main(String[] args) {

        Path path = Path.of("students.csv");

        List<String> students = Arrays.asList(
                "ID,Name,Marks",
                "1,Sam,85",
                "2,Ravi,45",
                "3,Kavin,95"
        );

        try {
            Files.write(path, students);

            System.out.println("CSV file created successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
