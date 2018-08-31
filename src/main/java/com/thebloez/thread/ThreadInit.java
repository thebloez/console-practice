package com.thebloez.thread;

public class ThreadInit extends Thread {

    @Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("ThreadPertama");
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("creating thread...");

        Thread thread = new ThreadInit();
        thread.setName("ThreadKedua");
        System.out.println("starting thread");
        thread.start();
//        System.out.println(Thread.currentThread().getName());
    }
}
