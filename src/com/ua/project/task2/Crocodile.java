package com.ua.project.task2;

import com.ua.project.task2.dto.AnimalDto;
import com.ua.project.task2.model.Animal;

public class Crocodile extends Animal {
    public Crocodile(AnimalDto animalDto) {
        super(animalDto);
    }
    public Crocodile() {
        this(new AnimalDto(12, 42.2, "Crocodile", "Color1"));
    }

    @Override
    public void hunt() {
        System.out.println(" Crocodile " + this.getName() + " is hunting...");
    }

    @Override
    public void eat() {
        System.out.println(" Crocodile eating...");
    }

    @Override
    public void sleep() {
        System.out.println(" Crocodile is sleeping...");
    }
}
