package day07;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Sam");
        deque.addLast("Ravi");
        deque.addLast("Kavin");

        System.out.println("Deque: " + deque);

        deque.removeFirst();

        System.out.println("After removing first: " + deque);

        deque.removeLast();

        System.out.println("After removing last: " + deque);
    }
}