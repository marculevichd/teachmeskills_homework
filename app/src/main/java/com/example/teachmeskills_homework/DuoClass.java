package com.example.teachmeskills_homework;

import java.util.Arrays;
import java.util.Random;

public class DuoClass {
    public static void main(String[] args) {
        //задание 1
        int[][] task1 = new int[2][2];

        for (int i = 0; i < task1.length; i++) {
            for (int j = 0; j < task1[i].length; j++) {
                System.out.println(task1[i][j]);
            }
        }

        // задание 2

        int[][][] task2 = {
                {
                        {1}
                },
                {
                        {77, 88, 99},
                        {3, 9}
                },
                {
                        {4, 5, 11},
                        {1},
                        {6, 55}
                }
        };


        for (int i = 0; i < task2.length; i++) {
            for (int j = 0; j < task2[i].length; j++) {
                for (int l = 0; l < task2[i][j].length; l++) {

                    System.out.println(task2[i][j][l]);
                }
            }
        }
        System.out.println(Arrays.deepToString(task2));


        // задание 3

        int[][] task3 = new int[][]{{1, 99, 55, 66, 77, 541, 10}, {111, 788, 54, 11, 33, 77, 61, 47}};
//        task3[0][0]
        Arrays.sort(task3[0]);


        for (int i = 1; i < task3[1].length; i++) {
            int current = task3[1][i];
            int value = i - 1;
            while (value >= 0 && current > task3[1][value]) {
                task3[1][value + 1] = task3[1][value];
                value--;

            }
            task3[1][value + 1] = current;
        }

        for (int i = 0; i < task3.length; i++) {
            for (int j = 0; j < task3[i].length; j++) {
                System.out.println(task3[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(task3));


        // задание 4
        Random random = new Random();
        int[][][] task4 = new int[3][3][3];

        for (int i = 0; i < task4.length; i++) {
            for (int j = 0; j < task4[i].length; j++) {
                for (int l = 0; l < task4[i][j].length; l++) {
                    task4[i][j][l] = random.nextInt();
                }
            }
        }
        System.out.println(Arrays.deepToString(task4));

    }
}