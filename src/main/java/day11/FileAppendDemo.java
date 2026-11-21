
package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class FileAppendDemo {

    public static void main(String[] args) {

        Path path = Path.of("student.txt");

        try {
            Files.writeString(
                    path,
                    "\nGrade: A",
                    StandardOpenOption.APPEND
            );

            System.out.println("Data appended successfully!");

            System.out.println(Files.readString(path));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
