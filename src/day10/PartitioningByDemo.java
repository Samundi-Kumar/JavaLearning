package day10;

import java.util.*;
import java.util.stream.Collectors;

public class PartitioningByDemo {

    public static void main(String[] args) {

        List<Integer> marks =
                Arrays.asList(85, 45, 90, 35, 75, 60);

        Map<Boolean, List<Integer>> result = marks.stream()
                .collect(Collectors.partitioningBy(mark -> mark >= 50));

        System.out.println(result);
    }
}