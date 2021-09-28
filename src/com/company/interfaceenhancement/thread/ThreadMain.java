package com.company.interfaceenhancement.thread;

public class ThreadMain {
    public static void main(String[] a){

       //Runnable runnable = new CodeToRunAsSeperateThread();

        Runnable runnable = ()-> {
            for (Integer count = 1; count <=5; count++){
                System.out.println(" child thread Counter value is :"+count);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        for (Integer count = 1; count <=5; count++){
            System.out.println(" Main thread Counter value is :"+count);
        }

    }
}
