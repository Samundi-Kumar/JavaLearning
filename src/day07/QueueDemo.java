package day07;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Sam");
        queue.add("Ravi");
        queue.add("Kavin");

        System.out.println("Queue: " + queue);

        System.out.println("First person: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("Remaining queue: " + queue);
    }
}
