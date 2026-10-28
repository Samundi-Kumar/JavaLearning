package day02;

public class VowelConsonant {
        public static void main(String[] args) {

            String text = "Hello Java!!";
            text = text.toLowerCase();

            int vowels = 0;
            int consonants = 0;

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i'
                            || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }

