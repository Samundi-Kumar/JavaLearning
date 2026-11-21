
package day11;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileExistsDemo {

    public static void main(String[] args) {

        Path path = Path.of("student.txt");

        if (Files.exists(path)) {
            System.out.println("File exists!");
        } else {
            System.out.println("File does not exist!");
        }
    }
}
