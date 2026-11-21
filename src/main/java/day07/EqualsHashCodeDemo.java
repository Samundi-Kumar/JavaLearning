package day07;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;

        return id == other.id &&
                Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsHashCodeDemo {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Sam");
        Student s2 = new Student(101, "Sam");

        System.out.println("Are students equal? " + s1.equals(s2));

        Set<Student> students = new HashSet<>();

        students.add(s1);
        students.add(s2);

        System.out.println("Total students: " + students.size());
    }
}
