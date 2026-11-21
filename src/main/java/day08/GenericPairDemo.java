package day08;

class Pair<K, V> {

    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void display() {
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}

public class GenericPairDemo {

    public static void main(String[] args) {

        Pair<Integer, String> student =
                new Pair<>(101, "Sam");

        Pair<String, Double> product =
                new Pair<>("Laptop", 55000.0);

        System.out.println("Student Details:");
        student.display();

        System.out.println();

        System.out.println("Product Details:");
        product.display();
    }
}
