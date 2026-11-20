package day18;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static void main(String[] args) {

        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {

                    System.out.println(
                            "Running in: "
                                    + Thread.currentThread().getName()
                    );

                    return "Employee data loaded";
                });

        CompletableFuture<String> result =
                future.thenApply(message ->
                        message.toUpperCase()
                );

        System.out.println(result.join());
    }
}
