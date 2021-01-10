package com.guigu.test;

public class Mythread extends Thread {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();
        mythread.interrupt();
        //mythread.join();


    }


}
