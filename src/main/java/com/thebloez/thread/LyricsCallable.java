package com.thebloez.thread;

import java.util.concurrent.*;

public class LyricsCallable {

    private static final String[] LYRICS = {
            "Sempurna yang kau puja",
            "Dan ayat-ayat yang kau baca",
            "Tak kurasa berbeda, kita bebas untuk percaya",
            "...",
            "Seperti kami pun mengampuni",
            "yang bersalah kepada kami"
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> callable1st = () -> {
            Integer index = 0;
            System.out.println("--> this is from callable1st\n");
            for (int i = 0; i < LYRICS.length; i++) {
                System.out.println(LYRICS[i]);
                TimeUnit.SECONDS.sleep(2);
                if (LYRICS[i].contains("..."))break;
                index = i+1;
            }
            System.out.println("break at line " + index);
            return index;
        };

        Future<Integer> idxFuture = executorService.submit(callable1st);

        Callable<String> callable2nd = () -> {
            int nextIndex = idxFuture.get();
            System.out.println("--> comment : this is from callable 2nd\n");
            for (int i = nextIndex+1; i < LYRICS.length; i++) {
                System.out.println(LYRICS[i]);
                TimeUnit.SECONDS.sleep(2);
            }
            return "- all done -";
        };

        Future<String> allDone = executorService.submit(callable2nd);
        String result = allDone.get();
        System.out.println(result);
        executorService.shutdown();
    }
}
