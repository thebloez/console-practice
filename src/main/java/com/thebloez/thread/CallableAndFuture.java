package com.thebloez.thread;

import java.util.concurrent.*;

public class CallableAndFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            System.out.println("Entered Callable");
            Thread.sleep(5000);
            return "Hello There from Callable <- this is from return method Callable<String>)";
        };

        System.out.println("Submitting Callable..");
        Future<String> stringFuture = executorService.submit(callable);

        // baris ini di execute langsung
        System.out.println("do something else while callable is getting executed");

        System.out.println("retrieve the result of the future");
        // future.get() blocks until the result is available
        String result = stringFuture.get();
        System.out.println(result);

        executorService.shutdown();
    }
}
