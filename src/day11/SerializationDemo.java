
package day11;

import java.io.*;

public class SerializationDemo {

    static class Student implements Serializable {

        private static final long serialVersionUID = 1L;

        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Student student = new Student(1, "Sam");

        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("student.ser"));

            out.writeObject(student);
            out.close();

            System.out.println("Object serialized!");

            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("student.ser"));

            Student result = (Student) in.readObject();
            in.close();

            System.out.println("ID: " + result.id);
            System.out.println("Name: " + result.name);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

