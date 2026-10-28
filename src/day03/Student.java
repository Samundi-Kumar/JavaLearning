package day03;

    public class Student {

        String name;
        int age;

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public static void main(String[] args) {

            Student student1 = new Student();

            student1.name = "Sam";
            student1.age = 22;

            student1.displayDetails();
            Student student2 = new Student();

            student2.name = "Ravi";
            student2.age = 25;

            student2.displayDetails();
        }
    }

