package day12;

public class PatternMatching {

    public static void main(String[] args) {

        Object value = "Java Programming";

        if (value instanceof String text) {

            System.out.println("Value: " + text);

            System.out.println(
                    "Length: " + text.length()
            );
        }

        Object number = 100;

        if (number instanceof Integer num) {

            System.out.println("Number: " + num);
        }
    }
}