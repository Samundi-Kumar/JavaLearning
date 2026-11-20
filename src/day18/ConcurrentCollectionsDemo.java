package day18;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionsDemo {

    public static void main(String[] args)
            throws InterruptedException {

        ConcurrentHashMap<Integer, String> employees =
                new ConcurrentHashMap<>();

        Runnable task1 = () -> {
            employees.put(101, "Employee A");
            employees.put(102, "Employee B");
        };

        Runnable task2 = () -> {
            employees.put(103, "Employee C");
            employees.put(104, "Employee D");
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        employees.forEach((id, name) ->
                System.out.println(id + " - " + name)
        );
    }
}