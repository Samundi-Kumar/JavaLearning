
package day08p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort Students by Marks");
            System.out.println("7. Count Students");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addStudent(students);
                    break;

                case 2:
                    displayStudents(students);
                    break;

                case 3:
                    searchStudent(students);
                    break;

                case 4:
                    updateStudent(students);
                    break;

                case 5:
                    deleteStudent(students);
                    break;

                case 6:
                    sortStudentsByMarks(students);
                    break;

                case 7:
                    System.out.println("Total Students: " + students.size());
                    break;

                case 8:
                    System.out.println("Thank you for using Student Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 8);

        scanner.close();
    }

    // Add student
    public static void addStudent(List<Student> students) {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Marks: ");
        int marks = scanner.nextInt();

        students.add(new Student(id, name, marks));

        System.out.println("Student added successfully!");
    }

    // Display students
    public static void displayStudents(List<Student> students) {

        if (students.isEmpty()) {
            System.out.println("No students available!");
            return;
        }

        System.out.println("\n===== STUDENT DETAILS =====");

        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }
    }

    // Search student
    public static void searchStudent(List<Student> students) {

        System.out.print("Enter Student ID to search: ");
        int searchId = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == searchId) {
                System.out.println("Student Found!");
                student.displayDetails();
                return;
            }
        }

        System.out.println("Student not found!");
    }

    // Update student
    public static void updateStudent(List<Student> students) {

        System.out.print("Enter Student ID to update: ");
        int searchId = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == searchId) {

                scanner.nextLine();

                System.out.print("Enter New Name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter New Marks: ");
                int newMarks = scanner.nextInt();

                student.setName(newName);
                student.setMarks(newMarks);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    // Delete student
    public static void deleteStudent(List<Student> students) {

        System.out.print("Enter Student ID to delete: ");
        int searchId = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == searchId) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    // Sort students by marks
    public static void sortStudentsByMarks(List<Student> students) {

        students.sort(
                Comparator.comparingInt(Student::getMarks).reversed()
        );

        System.out.println("Students sorted by marks successfully!");

        displayStudents(students);
    }
}
