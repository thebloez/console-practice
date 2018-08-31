package com.thebloez.thread;

public class RunnableWithoutImplement {

    public static void main(String[] args) {
        System.out.println("inside " + Thread.currentThread().getName() + " thread");

        System.out.println("Creating runnable...");
        Runnable runnable = () -> {
            System.out.println("Inside " + Thread.currentThread().getName());
        };

        System.out.println("Creating thread...");
        Thread thread = new Thread(runnable);

        System.out.println("running new thread...");
        System.out.println(thread.getName() + " is running...");
    }
}
