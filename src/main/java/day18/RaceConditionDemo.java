package day18;

public class RaceConditionDemo {

    private static int count = 0;

    public static void main(String[] args)
            throws InterruptedException {

        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                count++;
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected Count: 200000");
        System.out.println("Actual Count: " + count);
    }
}