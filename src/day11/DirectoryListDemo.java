
package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class DirectoryListDemo {

    public static void main(String[] args) {

        Path path = Path.of(".");

        try (var files = Files.list(path)) {

            System.out.println("Files and Folders:");

            files.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
