package com.thebloez.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSleep {

    public static void main(String[] args) {
        System.out.println("Inside " + Thread.currentThread().getName() + " thread");

        String[] messages = {
                "First things first.",
                "I'ma say all the words inside my head",
                "I'm fired up and tired of the way that things have been, oh-ooh",
                "The way that things have been, oh-ooh..",
                "Seconds thing second",
                "Don't you tell me what you think that I can be",
                "I'm the one at the sail, I'm the master of my sea, oh-ooh",
                "The master of my sea, oh-ooh",
                "...",
                "Singing my heartache take up my brain",
                "Take up my message from the veins",
                "Speaking my lesson from the brain",
                "Seeing the beauty, in the pain",
                "Pain!",
                "You make me a, you make me a believer, believer",
                "Pain!",
                "You take me up, you break me down, believer, believer"
        };

        final AtomicInteger index= new AtomicInteger();
        Callable<Integer> runnable = () -> {
            for (int i = 0; i < messages.length; i++) {
                System.out.println(messages[i]);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (messages[i].contains("...")) break;
                index.set(i+1);
            }
            System.out.println("break at line  " + index);
            Integer idx = index.intValue();
            return idx;
        };

        Thread thread = new Thread((Runnable) runnable);
        thread.start();
        System.out.println("that's running from thread : " + thread.getName());

        try {
            thread.join(2000*9);
//            System.out.println("last index is " + index);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runnable runnable2nd = () -> {
            for (int i = 9; i < messages.length; i++) {
                System.out.println(messages[i]);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2nd = new Thread(runnable2nd);
        thread2nd.start();
        System.out.println("2nd thread is ... ");

    }
}
