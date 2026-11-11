
package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FileMoveDemo {

    public static void main(String[] args) {

        Path source = Path.of("StudentRecords/copy.txt");
        Path destination = Path.of("StudentRecords/moved.txt");

        try {
            Files.move(source, destination);

            System.out.println("File moved successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
