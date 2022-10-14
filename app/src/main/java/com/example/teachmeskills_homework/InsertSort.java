package com.example.teachmeskills_homework;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] massive = new int[]{88, 39, 22, 44, 65, 1, 12, 54, 67, 20, 2, 9, 39};
        System.out.println(Arrays.toString(massive));
        for (int i = 1; i < massive.length; i++) { // начало с 2-го элемента
            int current = massive[i];
            int value = i - 1;

            while (value >= 0 && current < massive[value]) { // во внутреннем цикле при выполнении условий идет поиск индекса, в который записать текущий элемент цикла for, а также "сдвигаются" элементы, т.е. перезаписываются значения в опредленные индексы
                massive[value + 1] = massive[value];
                value--;
            }
            massive[value + 1] = current; // здесь перезаписывается по индексу текущее значение внешнего цикла
        }

        System.out.println(Arrays.toString(massive));

    }


}
