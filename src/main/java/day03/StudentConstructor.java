package day03;

public class StudentConstructor {

    String name;
    int age;

    StudentConstructor(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        StudentConstructor student1 =
                new StudentConstructor("Sam", 22);

        StudentConstructor student2 =
                new StudentConstructor("kavin", 23);

        student1.displayDetails();
        student2.displayDetails();
    }
}