package com.example.teachmeskills_homework;

public class HomeTask1 {


    public static void main(String[] args) {

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("First thread is running");
            }
        };
        thread1.start();

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    System.out.println("Second thread is running");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread2.start();

    }
}
