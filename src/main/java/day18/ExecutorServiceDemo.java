package day18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

    public static void main(String[] args)
            throws InterruptedException {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        try {
            for (int i = 1; i <= 6; i++) {

                final int taskId = i;

                executor.submit(() -> {
                    System.out.println(
                            "Task " + taskId
                                    + " executed by "
                                    + Thread.currentThread().getName()
                    );
                });
            }
        } finally {
            executor.shutdown();
        }

        if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
            executor.shutdownNow();
        }

        System.out.println("Executor tasks finished");
    }
}