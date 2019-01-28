package com.vishnu.java.threads.deadlock;

public class DeadLockWithTwoThreadsOne {

    public static void main(String[] args) {

        ResourceOne resourceOne = new ResourceOne();
        ResourceTwo resourceTwo = new ResourceTwo();

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    resourceOne.put(resourceTwo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    resourceTwo.put(resourceOne);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}




class ResourceOne
{
    public synchronized void put(ResourceTwo resourceTwo) throws InterruptedException {
        System.out.println("ResourceOne first put : " + Thread.currentThread().getName());
        Thread.sleep(1000);
        resourceTwo.take();
        System.out.println("ResourceOne second put : " + Thread.currentThread().getName());
    }

    public synchronized void take()
    {
        System.out.println("Started take : " + Thread.currentThread().getName());
    }
}

class ResourceTwo
{

    public synchronized void put(ResourceOne resourceOne) throws InterruptedException {

        System.out.println("ResourceTwo first put : " + Thread.currentThread().getName());
        Thread.sleep(1000);
        resourceOne.take();
        System.out.println("ResourceTwo second put : " + Thread.currentThread().getName());
    }

    public synchronized void take()
    {
        System.out.println("Started take : " + Thread.currentThread().getName());
    }

}