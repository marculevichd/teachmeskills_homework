package com.example.teachmeskills_homework;


interface Iinterface {
    void krutitKolesa (); // объявление метода крутить колеса без реализации
}


class Class implements Iinterface{ // имплементация интерефейся для последующего создания экземляра этого класса
    @Override
    public void krutitKolesa() { // реализация метода крутить колеса, полученного из интерфейса
        System.out.println("Колеса докрутились");
    }
}

public class Car_Task3  {
    Iinterface exemplyarInterface; // объявили объект exemplyarInterface типа Iinterface
    public Car_Task3(Iinterface action){ // передает в конструктор переменную action типа Iinterface
    this.exemplyarInterface = action; // иницилизируем экземпляр интерфеса(?) полученной из конструктора переменной... по сути это экземляр класса Class, да?
    }

    public void ehat(){  // заявленный в ТЗ метод Ехать, который вызывает метод КрутитьКолеса у экземляра класса Class(?)
        exemplyarInterface.krutitKolesa();
}


    public static void main(String[] args) {
        Car_Task3 car_task3 = new Car_Task3(new Class()); // создание нового экземляра класса Car_Task3 (нового экземляра класса Class, который реализует интерфейс Iinterface)
        car_task3.ehat();
    }

}
// реализация кода по цепочке происходит снизу вверх
