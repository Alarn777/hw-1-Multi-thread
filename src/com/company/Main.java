package com.company;

public class Main {

    public static void main(String[] args) {
        //1st
        Thread t1 = new Thread( new SharedCounter("inc"));
        Thread t3 = new Thread( new SharedCounter("dec"));


        //second
        Thread t4 = new Thread( new SharedCounter("dec"));
        Thread t2 = new Thread( new SharedCounter("inc"));

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Value of sum:" + SharedCounter.getValue());

        System.out.println("Main thread exiting.");



    }
}
