package ru.netology;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        System.out.println("сортировка без использования стримов: ");

        for (Integer s : intList) {
            if (s > 0) {
                Collections.sort(intList);
                if (s % 2 == 0) {
                    System.out.println(s);
                }
            }
        }

        System.out.println("сортировка при помощи стримов: ");

        StreamMain.AAA();


    }
}
