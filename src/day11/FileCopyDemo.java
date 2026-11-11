
package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class FileCopyDemo {

    public static void main(String[] args) {

        Path source = Path.of("source.txt");
        Path destination = Path.of("StudentRecords/copy.txt");

        try {
            Files.writeString(source, "Welcome to Java File Handling!");

            Files.copy(source, destination,
                    StandardCopyOption.REPLACE_EXISTING);

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
