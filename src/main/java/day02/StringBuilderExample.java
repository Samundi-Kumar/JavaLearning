package day02;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("Java");

        text.append(" Programming");

        System.out.println("After append: " + text);

        text.reverse();

        System.out.println("After reverse: " + text);
    }
}

