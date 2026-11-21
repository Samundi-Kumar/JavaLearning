package day02;

public class StringPalindrome {
        public static void main(String[] args) {

            String text = "level";
            String reversed = "";

            for (int i = text.length() - 1; i >= 0; i--) {
                reversed += text.charAt(i);
            }

            if (text.equals(reversed)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        }
    }

