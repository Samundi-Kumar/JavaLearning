package day03;

public class AccessExample {

        public String name = "Sam";
        private int age = 22;

        public void displayName() {
            System.out.println(name);
        }

        private void displayAge() {
            System.out.println(age);
        }

        public static void main(String[] args) {

            AccessExample obj = new AccessExample();

            System.out.println(obj.name);
            System.out.println(obj.age);

            obj.displayName();
            obj.displayAge();
        }
    }

