package day19;

import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrencyDemo {

    public static void main(String[] args) throws Exception {

        try (var scope =
                     new StructuredTaskScope.ShutdownOnFailure()) {

            StructuredTaskScope.Subtask<String> taskDetails =
                    scope.fork(() -> {
                        Thread.sleep(1000);
                        return "Task: Learn Java";
                    });

            StructuredTaskScope.Subtask<String> taskStatus =
                    scope.fork(() -> {
                        Thread.sleep(500);
                        return "Status: IN_PROGRESS";
                    });

            scope.join();
            scope.throwIfFailed();

            System.out.println(taskDetails.get());
            System.out.println(taskStatus.get());
        }
    }
}