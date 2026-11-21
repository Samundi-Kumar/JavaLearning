package day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThreadComparison {

    private static final int TASK_COUNT = 10_000;

    public static void main(String[] args) throws Exception {

        runVirtualThreads();

        runPlatformThreads();
    }

    private static void runVirtualThreads()
            throws InterruptedException {

        long start = System.nanoTime();

        try (ExecutorService executor =
                     Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < TASK_COUNT; i++) {
                executor.submit(() -> {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        }

        long end = System.nanoTime();

        System.out.println(
                "Virtual threads time: " +
                        TimeUnit.NANOSECONDS.toMillis(end - start) +
                        " ms"
        );
    }

    private static void runPlatformThreads()
            throws InterruptedException {

        long start = System.nanoTime();

        try (ExecutorService executor =
                     Executors.newFixedThreadPool(100)) {

            for (int i = 0; i < TASK_COUNT; i++) {
                executor.submit(() -> {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        }

        long end = System.nanoTime();

        System.out.println(
                "Platform threads time: " +
                        TimeUnit.NANOSECONDS.toMillis(end - start) +
                        " ms"
        );
    }
}