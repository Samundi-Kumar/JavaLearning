
package day11;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileTypeCheckDemo {

    public static void main(String[] args) {

        Path file = Path.of("StudentRecords/moved.txt");
        Path folder = Path.of("StudentRecords");

        System.out.println("Is file? " + Files.isRegularFile(file));

        System.out.println("Is directory? " + Files.isDirectory(folder));
    }
}
