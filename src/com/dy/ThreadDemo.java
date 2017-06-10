package com.dy;

/**
 * Created by dongyan on 10/06/17.
 */
// public class ThreadDemo implements Runnable {
public class ThreadDemo extends Thread {
//    private String name;

    public ThreadDemo(String name){
        super.setName(name);
//        this.name = name;
    }

//    public String getName(){
//        return this.name;
//    }

    public void run(){
        System.out.println("thread=" + this.getName() +  " is running.");
    }

    public static void main(String args[]){
        ThreadDemo m1= new ThreadDemo("Thread1");
        ThreadDemo m2 = new ThreadDemo("Thread2");
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}
