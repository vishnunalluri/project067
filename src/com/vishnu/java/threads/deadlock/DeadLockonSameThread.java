package com.vishnu.java.threads.deadlock;

public class DeadLockonSameThread {

    public static void main(String[] args) throws InterruptedException {

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName()+" : Thread started execution");
        mainThread.join();
        System.out.println("Completted Execution");

    }
}
