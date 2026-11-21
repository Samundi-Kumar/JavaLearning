package day18;

public class RunnableDemo {

    public static void main(String[] args)
            throws InterruptedException {

        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " - Task: " + i
                );
            }
        };

        Thread thread1 = new Thread(task, "Worker-1");
        Thread thread2 = new Thread(task, "Worker-2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Runnable tasks completed");
    }
}
