package com.example.teachmeskills_homework;

import static java.lang.Thread.sleep;

// Продавец производит 1 товар, а покупатель покупает 1 товар. Если товара нет, то покупатель ожидает.
//Производство товара занимает 300мс.
public class HomeWork14 {

    public static void main(String[] args) {
        Product product = new Product();


        Produser produser = new Produser(product);
        Consumer consumer = new Consumer(product);

        Thread thread1 = new Thread(produser);
        thread1.start();

        Thread thread2 = new Thread(consumer);
        thread2.start();


    }


}

class Product {
    private static Integer countOfProduct = 0;

    synchronized void produce() {

        while (countOfProduct != 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        countOfProduct++;
        System.out.println("Плюс 1 товар");
        notify();
    }


    synchronized void consume() {
        while (countOfProduct == 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        countOfProduct--;
        System.out.println("Минус 1 товар");
        notify();
    }


}


class Produser implements Runnable {
    Product product;


    public Produser(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(300);
                product.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}


class Consumer implements Runnable {
    Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            product.consume();
        }
    }


}
