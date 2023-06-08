package ru.ajp;

public class MyCustomThread extends Thread {
    public MyCustomThread(String threadName) {
        super();
        setName(threadName);
    }
    @Override
    public void run() {
        var currentThread = Thread.currentThread();
        System.out.println("Thread run with name: " + currentThread.getName());
        System.out.println("Tread is alive: " + currentThread.isAlive());
        System.out.println("Tread is daemon: " + currentThread.isDaemon());
        System.out.println("Tread is interrupted: " + currentThread.isInterrupted());
    }
}
