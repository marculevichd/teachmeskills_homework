package com.example.teachmeskills_homework;

public abstract class Vehicle { // для Vehicle Car Bicycle
    abstract void drive();

    abstract void beep();
}

interface ITurnOnMotor { // для Vehicle Car
    void turnOnMotor();
}


class Bicycle extends Vehicle {
    @Override
    void drive() {
    }

    @Override
    void beep() {
    }
}

class Car extends Vehicle implements ITurnOnMotor {
    @Override
    void drive() {
    }

    @Override
    void beep() {
    }

    @Override
    public void turnOnMotor() {
    }
}

class Tractor extends Vehicle implements ITurnOnMotor {

    @Override
    void drive() {
    }

    @Override
    void beep() {
    }

    @Override
    public void turnOnMotor() {
    }
}

