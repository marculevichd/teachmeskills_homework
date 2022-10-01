package com.example.teachmeskills_homework;

public class Phone  {
    String number;
    String model;
    int weight;

    public Phone (String number, String model, int weight){ // конкструктор 1
        this(number, model);
        this.weight=weight;
    }
    public Phone (String number, String model){ // конкструктор 2
        this.number=number;
        this.model=model;
    }
    public Phone (){ // конкструктор 3
    }

    static void receiveCall (String name){
        System.out.println("Звонит" + name);
    }
    void receiveCall(String name, String number){
        System.out.println("Звонит "+ name);
    }

    void getNumber(){
        System.out.println(number);
    }

    void sendMessage(String ...numbers){
        for (String number:numbers){
            System.out.println("Сообщение отправлено на номер " +number);
        }
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone("111111", "PHONE1", 111);
        Phone phone2 = new Phone("222222", "Phone2");
        Phone phone3 = new Phone();

        System.out.println(" Номер телефона1 " + phone1.number + ". Модель телефона1 " + phone1.model + ". Вес телефона1 "+ phone1.weight);
        System.out.println(" Номер телефона2 " + phone2.number + ". Модель телефона2 " + phone2.model + ". Вес телефона2 "+ phone2.weight);
        System.out.println(" Номер телефона3 " + phone3.number + ". Модель телефона3 " + phone3.model + ". Вес телефона3 "+ phone3.weight);

        phone1.receiveCall("Q");
        phone1.getNumber();
        phone2.receiveCall("W");
        phone2.getNumber();
        phone3.receiveCall("E");
        phone3.getNumber();

        phone1.receiveCall("Ola", "999");
    }
}
