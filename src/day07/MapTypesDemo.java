package day07;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapTypesDemo {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(103, "Kavin");
        hashMap.put(101, "Sam");
        hashMap.put(102, "Ravi");

        linkedMap.put(103, "Kavin");
        linkedMap.put(101, "Sam");
        linkedMap.put(102, "Ravi");

        treeMap.put(103, "Kavin");
        treeMap.put(101, "Sam");
        treeMap.put(102, "Ravi");

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedMap);
        System.out.println("TreeMap: " + treeMap);
    }
}