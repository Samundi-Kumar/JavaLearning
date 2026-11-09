package day10;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByDemo {

    public static void main(String[] args) {

        List<Integer> marks =
                Arrays.asList(85, 45, 90, 35, 75, 60);

        Map<String, List<Integer>> result = marks.stream()
                .collect(Collectors.groupingBy(
                        mark -> mark >= 50 ? "Pass" : "Fail"
                ));

        System.out.println(result);
    }
}