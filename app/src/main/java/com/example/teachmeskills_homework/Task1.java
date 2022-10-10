package com.example.teachmeskills_homework;

public class Task1 {
    public static void main(String[] args) {
        Car bmv = new Car("bmv b100", 280, 20000);
        Car opel = new Car("opel a1", 230, 5000);
        Car audi = new Car("audi astra", 190, 1000);

        try {
            bmv.startTheCarIfRandomIntNotEven();
        } catch (EvenException e) {
            System.out.println(e.getEvenCar());
        }

        try {
            opel.startTheCarIfRandomIntNotEven();
        } catch (EvenException e) {
            System.out.println(e.getEvenCar());
        }

        try {
            audi.startTheCarIfRandomIntNotEven();
        } catch (EvenException e) {
            System.out.println(e.getEvenCar());
        }

    }

}


class Car {
    private String brand = "unknown";
    private int speed = 0;
    private int price = 0;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    void startTheCarIfRandomIntNotEven() throws EvenException {
        int random = (int) (Math.random() * 21);


        if (random % 2 == 0) {
            throw new EvenException("Auto do not start " + random);
        } else {
            System.out.println("Автомобиль " + brand + " завелся.");
        }
    }

}


class EvenException extends Exception {
    private String evenCar;

    public EvenException(String evenCar) {
        this.evenCar = evenCar;
    }

    public String getEvenCar() {
        return evenCar;
    }
}
