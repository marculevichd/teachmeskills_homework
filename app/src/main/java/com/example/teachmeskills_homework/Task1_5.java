package com.example.teachmeskills_homework;

import java.util.Arrays;
import java.util.Random;

public class Task1_5 {
    public static void main(String[] args) {


        //задание 1
        int[] task1 = new int[10];
        int element1 = 0;
        for (int i = 2; i <= 20; ) {
            task1[element1] = i;
            i += 2;
            element1++;
        }

        System.out.println(Arrays.toString(task1));

        for (int i : task1) {
            System.out.println(i);
        }

        // задание 2

        int[] task2 = new int[50];
        int element2 = 0;
        for (int i = 1; i <= 99; ) {
            task2[element2] = i;
            i += 2;
            element2++;
        }
        System.out.println(Arrays.toString(task2));

        for (int i = 0; i < task2.length; i++) {
            System.out.print(task2[task2.length - 1 - i] + ", ");
        }
        System.out.println("\n");
        // задание 3
        Random random = new Random();
        int[] task3 = new int[15];
        for (int i = 0; i < task3.length; i++) {
            task3[i] = random.nextInt(99);
        }
        System.out.println(Arrays.toString(task3));

        int evenValues = 0;
        for (int i = 0; i < task3.length; i++) {
            if (task3[i] % 2 == 0) {
                evenValues++;
            }
        }
        System.out.println(evenValues);

        // задание 4
        int [] task4 = new int[20];
        for (int i = 0; i < task4.length; i++) {
            task4[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(task4));

        for (int i=0; i<task4.length;i++){
            if (i%2!=0){
                task4[i]=0;
            }
        }
        System.out.println(Arrays.toString(task4));


        // задание 5

        int [] task5 = new int [12];
        int maxValue=task5[0];
        for (int i = 0; i < task5.length; i++) {
            task5[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(task5));

        for (int i=1; i<task5.length;i++){
            maxValue=maxValue<task5[i]?task5[i]:maxValue;
        }
        System.out.println(maxValue);
        int lastInElementInMassive=0;
        for (int i=0; i<task5.length;i++){
            if (task5[i]==maxValue){
                lastInElementInMassive=i;
            }
        }
        System.out.println(lastInElementInMassive);




    }

}
