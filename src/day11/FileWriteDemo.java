
package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FileWriteDemo {

    public static void main(String[] args) {

        Path path = Path.of("student.txt");

        String data = "Name: Sam\nAge: 22\nCourse: Java";

        try {
            Files.writeString(path, data);

            System.out.println("File created successfully!");
            System.out.println("Data written into the file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
