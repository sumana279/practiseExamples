package com.example.JavaAlg.ThreadSafeQueue;

import java.io.Serializable;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by svishnu on 8/3/17.
 */
public class PriorityQueueEx  {
    public static void main(String[] args) {
        PriorityQueue<Employee> pQueue = new PriorityQueue<Employee>(7);
        pQueue.offer(new Employee("AAA", 15000));
        pQueue.offer(new Employee("BBB", 12000));
        pQueue.offer(new Employee("CCC", 7500));
        pQueue.offer(new Employee("DDD", 17500));
        pQueue.offer(new Employee("EEE", 21500));
        pQueue.offer(new Employee("FFF", 29000));
        pQueue.offer(new Employee("GGG", 14300));


        System.out.println(pQueue.poll().getName());       //Output --> CCC : 7500
        System.out.println(pQueue.poll().getName());       //Output --> CCC : 7500
        System.out.println(pQueue.poll().getName());       //Output --> CCC : 7500
        System.out.println(pQueue.poll().getName());       //Output --> CCC : 7500
        System.out.println(pQueue.poll().getName());       //Output --> CCC : 7500
        System.out.println(pQueue.poll().getName());       //Output --> CCC : 7500
        System.out.println(pQueue.poll().getName());       //Output --> CCC : 7500
       // System.out.println(pQueue.poll().getName());       //Output --> CCC : 7500

    }
}