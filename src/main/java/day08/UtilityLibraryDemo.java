package day08;

import java.util.ArrayList;
import java.util.List;

public class UtilityLibraryDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Sam");
        names.add("Ravi");
        names.add("Kavin");

        System.out.println("Student Names:");

        CollectionUtils.display(names);

        System.out.println();

        System.out.println("Total Students: "
                + CollectionUtils.count(names));

        System.out.println("Search Ravi: "
                + CollectionUtils.search(names, "Ravi"));

        System.out.println("Search Arun: "
                + CollectionUtils.search(names, "Arun"));
    }
}