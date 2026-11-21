package day07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Sam");
        names.add("Ravi");
        names.add("Kavin");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {

            String name = iterator.next();

            System.out.println(name);
        }
    }
}