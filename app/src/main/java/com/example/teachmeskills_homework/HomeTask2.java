package com.example.teachmeskills_homework;

public class HomeTask2 {

    public static void main(String[] args) {



        Thread thread_anonym = new Thread() {
            @Override
            public void run() {
                System.out.println("thread_anonym");
            }
        };
        thread_anonym.start();

        Runnable runnable_anonym = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable_anonym");
            }
        };
        Thread thread = new Thread(runnable_anonym);
        thread.start();



        Thread_extends thread_extends = new Thread_extends();
        thread_extends.start();
        Runnable_implements runnable_implements = new Runnable_implements();
        Thread thread1 = new Thread(runnable_anonym);
        thread1.start();



    }
}

class Thread_extends extends Thread {
    @Override
    public void run() {
        System.out.println("Thread_extends");
    }
}

class Runnable_implements implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable_implements");
    }
}