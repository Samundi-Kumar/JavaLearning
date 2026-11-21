
package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class DirectoryCreateDemo {

    public static void main(String[] args) {

        Path path = Path.of("StudentRecords");

        try {
            Files.createDirectories(path);

            System.out.println("Directory created successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
