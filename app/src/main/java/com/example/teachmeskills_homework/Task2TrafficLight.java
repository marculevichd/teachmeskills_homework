package com.example.teachmeskills_homework;

public class Task2TrafficLight {
    public static void main(String[] args) {
        TrafficLight greenTrafficLight = new TrafficLight();
        TrafficLight orangeTrafficLight = new TrafficLight();
        TrafficLight redTrafficLight = new TrafficLight();

        try {
            greenTrafficLight.methodCrossTheStreet("green");
        } catch (CrossTheStreetIsNotPermitedException e) {
            System.out.println(e.getMessege());
        }

        try {
            orangeTrafficLight.methodCrossTheStreet("orange");
        } catch (CrossTheStreetIsNotPermitedException e) {
            System.out.println(e.getMessege());
        }

        try {
            redTrafficLight.methodCrossTheStreet("red");
        } catch (CrossTheStreetIsNotPermitedException e) {
            System.out.println(e.getMessege());
        }

    }


}

class TrafficLight {
    final String checkRed = "red";
    final String checkGreen = "green";
    final String checkOrange = "orange";

    public String getCheckRed() {
        return checkRed;
    }

    public String getCheckGreen() {
        return checkGreen;
    }

    public String getCheckOrange() {
        return checkOrange;
    }

    public void methodCrossTheStreet(String check) throws CrossTheStreetIsNotPermitedException {

        if (check.equals(checkRed)) {
            throw new CrossTheStreetIsNotPermitedException("Please wait green light " + getCheckRed());
        }
        if (check.equals(checkOrange)) {
            throw new CrossTheStreetIsNotPermitedException("Please stand  still " + getCheckOrange());
        }
        if (check.equals(checkGreen)) {
            System.out.println("You may go " + getCheckGreen());
        }
    }
}


class CrossTheStreetIsNotPermitedException extends Exception {
    private String messege;

    public CrossTheStreetIsNotPermitedException(String messenge) {
        this.messege = messenge;
    }

    public String getMessege() {
        return messege;
    }
}
