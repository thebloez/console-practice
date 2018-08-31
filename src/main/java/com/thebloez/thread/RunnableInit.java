package com.thebloez.thread;

public class RunnableInit implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Inside " + Thread.currentThread().getName());

        System.out.println("creating runnable..." );
        Runnable runnable = new RunnableInit();

        Thread threadRunnable = new Thread(runnable);
        System.out.println("creating thread...");

        threadRunnable.start();
        System.out.println("start " + threadRunnable.getName());
    }
}
