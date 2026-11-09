package day10;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String name = null;

        Optional<String> result = Optional.ofNullable(name);

        System.out.println(result.orElse("Name not found"));
    }
}
