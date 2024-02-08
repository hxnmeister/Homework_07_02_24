package com.ua.project.task2;

import com.ua.project.task2.dto.AnimalDto;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(new AnimalDto(12, 33.1, "Some TIGER", "Orange-black"));
        Kangaroo kangaroo = new Kangaroo();
        Crocodile crocodile = new Crocodile();

        kangaroo.fillInfo();
        System.out.println("-".repeat(50));
        crocodile.fillInfo();

        System.out.println(tiger);
        System.out.println("-".repeat(50));
        System.out.println(kangaroo);
        System.out.println("-".repeat(50));
        System.out.println(crocodile);
    }
}
