package day18;

class SharedCounter {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class SynchronizationDemo {

    public static void main(String[] args)
            throws InterruptedException {

        SharedCounter counter = new SharedCounter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(
                "Final Count: " + counter.getCount()
        );
    }
}