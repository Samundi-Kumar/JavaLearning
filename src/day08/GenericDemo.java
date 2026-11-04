package day08;

class Box<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class GenericDemo {

    public static void main(String[] args) {

        Box<String> nameBox = new Box<>();
        nameBox.setValue("Sam");

        Box<Integer> ageBox = new Box<>();
        ageBox.setValue(22);

        System.out.println("Name: " + nameBox.getValue());
        System.out.println("Age: " + ageBox.getValue());
    }
}
