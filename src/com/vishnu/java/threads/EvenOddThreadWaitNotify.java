package com.vishnu.java.threads;

public class EvenOddThreadWaitNotify {

    public static void main(String[] args) {

        SharedObject sharedObject = new SharedObject();

        int range =10;

        EvenThread evenThread = new EvenThread(sharedObject,range);

        OddThread oddThread = new OddThread(sharedObject,range);

        evenThread.setName("Even Thread ");
        oddThread.setName("Odd Thread");
        evenThread.start();

        oddThread.start();
    }
}


class EvenThread extends Thread
{
    int range;
    SharedObject sharedObject;
    public EvenThread(SharedObject sharedObject,int range)
    {
        this.range = range;
        this.sharedObject = sharedObject;
    }

    public void run()
    {
        for(int index=1;index<=range;index++)
        {
            if((index%2==0))
            {
                sharedObject.printEventNumber(index);
            }
        }
    }
}

class OddThread extends Thread{

    int range;
    SharedObject sharedObject;

    public OddThread(SharedObject sharedObject,int range)
    {
        this.range = range;
        this.sharedObject = sharedObject;
    }

    int counter=10;
    public void run()
    {

        for(int index=1;index<=range;index++)
        {
            if(!(index%2==0))
            {
                sharedObject.printOddNumber(index);
            }
        }
    }
}

class SharedObject
{
    private boolean even=true;

    public synchronized  void printEventNumber(int number)
    {
        while(even)
        {
          try
          {
              this.wait();
          }
          catch(InterruptedException e)
          {
              e.printStackTrace();
          }
        }
        even=true;
        System.out.println("Executed by "+Thread.currentThread().getName()+" printing :"+number);
        this.notify();


    }


    public synchronized  void printOddNumber(int number)
    {
        while(!even)
        {
            try
            {
                this.wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        even=false;
        System.out.println("Executed by "+Thread.currentThread().getName()+" printing :"+number);
        this.notify();


    }

}