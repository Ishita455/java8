package com.company.interfaceenhancement.thread;

public class CodeToRunAsSeperateThread implements Runnable {

    @Override
    public void run() {
        for (Integer count = 1; count <=5; count++){
            System.out.println(" child thread Counter value is :"+count);
        }
    }
}
