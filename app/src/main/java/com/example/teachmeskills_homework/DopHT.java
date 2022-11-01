package com.example.teachmeskills_homework;

import static java.lang.Thread.sleep;

public class DopHT {
//    Продавец производит 2 товара и потребитель покупает только 1 товар.
//2-ой  товар никто не покупает, и его надо выкинуть.
//    Сделайте так чтобы на счете продавца лежала сумма за 5 товаров вместе взятых, которые купил покупатель.
//    Если товара 0 то потребитель ждет.


    public static void main(String[] args) {
        ResursProdusera resursProdusera = new ResursProdusera();

        Produsera produsera = new Produsera(resursProdusera);
        Thread threadProdusera = new Thread(produsera);
        threadProdusera.start();

        Consumera consumera = new Consumera(resursProdusera);
        Thread threadConsumera = new Thread(consumera);
        threadConsumera.start();
    }
}


class ResursProdusera {
    Integer countProduct = 0;
    Integer valueMoney = 0;
    Integer priceOneProduct = 500;

    synchronized void poizvodstvo() {
        while (countProduct >= 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        countProduct++;
        System.out.println("У производителя товара на данный момент: " + countProduct);
        notify();
    }

    synchronized void pokupka() {
        while (countProduct == 0) {
            try {
                sleep(2000);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        countProduct--;
        oplata();
        System.out.println("Куплен 1 товар. На счету производителя " + valueMoney);
        utilizaziya();
        System.out.println("У производителя испортился 1 товар. Общее количество товаров на данный момент: " + countProduct);
        notify();
    }

    void utilizaziya() {
        if (countProduct == 1) {
            countProduct--;
        } else System.out.println("Утилизировать нечего. Товаров всего: " + countProduct);

    }

    Integer oplata() {
        return valueMoney += priceOneProduct;
    }
}


class Produsera implements Runnable {
    ResursProdusera resursProdusera;

    public Produsera(ResursProdusera resursProdusera) {
        this.resursProdusera = resursProdusera;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resursProdusera.poizvodstvo();
        }
    }
}

class Consumera implements Runnable {
    ResursProdusera resursProdusera;

    public Consumera(ResursProdusera resursProdusera) {
        this.resursProdusera = resursProdusera;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resursProdusera.pokupka();
        }
    }
}



