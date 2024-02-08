package com.ua.project.task6;

import com.ua.project.task6.interfaces.implementation.Array;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Array array = new Array();
        final int maxArrayLength = 10;

        System.out.print("\n Array: ");
        for (int i = 0; i < maxArrayLength; i++) {
            array.push(random.nextInt(-10, 20));
            System.out.print(array.getElement(i) + " ");
        }

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.printf(" Max: %s%n", array.max());
        System.out.printf(" Min: %s%n", array.min());
        System.out.printf(" Avg: %s%n", array.avg());

        array.sortAsc();
        System.out.println(array);

        array.sortDesc();
        System.out.println(array);
    }
}
