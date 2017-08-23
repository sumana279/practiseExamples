package com.example.JavaAlg;

public class ThreadsInJava
{
    public static void main(String[] args)
    {
        Thread t = new Thread()
        {
            public void run()
            {
                System.out.println(isInterrupted());         //Output : true
 
                try
                {
                    Thread.sleep(10000);        //Thread is going to sleep for 10 seconds
                }
                catch (InterruptedException e)
                {
                    System.out.println("Thread is interrupted");
                }
 
                System.out.println(isInterrupted());       //Output : false
            }
        };
 
        t.start();
 
        t.interrupt();         //main thread is interrupting thread t
    }
}