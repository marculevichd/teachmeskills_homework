package com.example.teachmeskills_homework;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeTask12 {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        //Task1
        Child childVanya = new Child(1, "vanya", 100);

        IChildToAdult<Child, Adult> iChildToAdult = (child) -> new Adult(child);

        Adult newAdult = iChildToAdult.growChild(childVanya);
        System.out.println(newAdult.getName() + " " + newAdult.getAge() + " " + newAdult.getHeight()+ " " + newAdult.isGrow);

        //Task2
        List<Adult> adultList = new ArrayList<Adult>();
        adultList.add(new Adult(9898, "Chi", 2000));
        adultList.add(new Adult(20, "Qi", 180));
        adultList.add(new Adult(19, "Ai", 150));
        adultList.add(new Adult(18, "Pi", 160));

        Adult task2 = adultList.stream().skip(1).limit(2).max(Comparator.comparing(Adult::getAge)).orElse(null);
        System.out.println(task2);


    }
}





