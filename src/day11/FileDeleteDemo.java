
package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FileDeleteDemo {

    public static void main(String[] args) {

        Path path = Path.of("student.txt");

        try {
            if (Files.deleteIfExists(path)) {
                System.out.println("File deleted successfully!");
            } else {
                System.out.println("File does not exist!");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
