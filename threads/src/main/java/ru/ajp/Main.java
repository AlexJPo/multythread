package ru.ajp;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Thread
        System.out.println("Create tread");

        new Thread(
                () -> {
                    var currentThread = Thread.currentThread();
                    System.out.println("Thread run with name: " + currentThread.getName());
                    System.out.println("Tread is alive: " + currentThread.isAlive());
                    System.out.println("Tread is daemon: " + currentThread.isDaemon());
                    System.out.println("Tread is interrupted: " + currentThread.isInterrupted());
                },
                "Thread created from class"
        ).start();

        // interface
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nCreate tread from interface");

        var r = new Runnable() {
            @Override
            public void run() {
                var currentThread = Thread.currentThread();
                System.out.println("Thread run with name: " + currentThread.getName());
                System.out.println("Tread is alive: " + currentThread.isAlive());
                System.out.println("Tread is daemon: " + currentThread.isDaemon());
                System.out.println("Tread is interrupted: " + currentThread.isInterrupted());
            }
        };
        r.run();

        // extends
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nCreate tread from interface");

        new MyCustomThread("Thread created throw extend Thread.class").start();
    }
}