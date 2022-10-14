package com.example.teachmeskills_homework;

import java.util.Arrays;

public class BoobleSort {


    public static void main(String[] args) {
        int[] massive = new int[]{21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};

        boolean isSorted = false;
        int temple = 0;

        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    isSorted = false;

                    temple = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = temple;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
