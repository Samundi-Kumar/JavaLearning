
package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FileReadDemo {

    public static void main(String[] args) {

        Path path = Path.of("student.txt");

        try {
            String data = Files.readString(path);

            System.out.println("Student Details:");
            System.out.println(data);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
