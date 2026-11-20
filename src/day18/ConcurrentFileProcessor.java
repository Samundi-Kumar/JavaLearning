package day18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrentFileProcessor {

    record FileResult(String fileName, long lines, long words) {
    }

    public static void main(String[] args)
            throws IOException, InterruptedException,
            ExecutionException {

        Path folder = Path.of("sample_files");
        Files.createDirectories(folder);

        Files.writeString(
                folder.resolve("file1.txt"),
                "Java is powerful\nJava supports multithreading"
        );

        Files.writeString(
                folder.resolve("file2.txt"),
                "ExecutorService manages threads\nThreads execute tasks"
        );

        Files.writeString(
                folder.resolve("file3.txt"),
                "Concurrency improves task management\nPractice Java daily"
        );

        List<Path> files = List.of(
                folder.resolve("file1.txt"),
                folder.resolve("file2.txt"),
                folder.resolve("file3.txt")
        );

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        List<Future<FileResult>> futures = new ArrayList<>();

        try {
            for (Path file : files) {

                Callable<FileResult> task = () -> {

                    List<String> lines = Files.readAllLines(file);

                    long wordCount = 0;

                    for (String line : lines) {
                        String trimmed = line.trim();

                        if (!trimmed.isEmpty()) {
                            wordCount += trimmed.split("\\s+").length;
                        }
                    }

                    System.out.println(
                            "Processing " + file.getFileName()
                                    + " using "
                                    + Thread.currentThread().getName()
                    );

                    return new FileResult(
                            file.getFileName().toString(),
                            lines.size(),
                            wordCount
                    );
                };

                futures.add(executor.submit(task));
            }

            long totalLines = 0;
            long totalWords = 0;

            for (Future<FileResult> future : futures) {

                FileResult result = future.get();

                System.out.println(
                        result.fileName()
                                + " | Lines: " + result.lines()
                                + " | Words: " + result.words()
                );

                totalLines += result.lines();
                totalWords += result.words();
            }

            System.out.println("-----------------------");
            System.out.println("Total Files: " + files.size());
            System.out.println("Total Lines: " + totalLines);
            System.out.println("Total Words: " + totalWords);

        } finally {
            executor.shutdown();

            if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
                executor.shutdownNow();
            }
        }
    }
}