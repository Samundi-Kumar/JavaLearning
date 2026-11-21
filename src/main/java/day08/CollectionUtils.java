package day08;

import java.util.List;

public class CollectionUtils {

    public static <T> void display(List<T> items) {

        for (T item : items) {
            System.out.println(item);
        }
    }

    public static <T> int count(List<T> items) {

        return items.size();
    }

    public static <T> boolean search(List<T> items, T value) {

        return items.contains(value);
    }
}