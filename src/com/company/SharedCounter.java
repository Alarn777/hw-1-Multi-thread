package com.company;

public class SharedCounter implements Runnable{
    private static int sum = 0;
//
//    SharedCounter(int sum){
//        SharedCounter.sum = sum;
//
//    }

    static int getValue() {
        return sum;
    }

    void increment(){
        sum++;
    }

    void decrement(){
        sum--;
    }

//    ThreadID test;


    private String name;

    SharedCounter (String thread_name){
        name = thread_name;
        Thread t = new Thread(this, name);
        System.out.println(name + " running");
        t.start();
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                if(name.equals("inc")){
                    this.increment();
                }
                else
                    this.decrement();

                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}
