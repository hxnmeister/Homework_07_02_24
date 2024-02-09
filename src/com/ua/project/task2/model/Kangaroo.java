package com.ua.project.task2.model;

import com.ua.project.task2.dto.AnimalDto;
import com.ua.project.task2.model.Animal;

public class Kangaroo extends Animal {
    public Kangaroo(AnimalDto animalDto) {
        super(animalDto);
    }
    public Kangaroo() {
        this(new AnimalDto(4, 13.331, "Kangaroo", "Color2"));
    }

    @Override
    public void hunt() {
        System.out.println(" Kangaroo " + this.getName() + " is hunting...");
    }

    @Override
    public void eat() {
        System.out.println(" Kangaroo eating...");
    }

    @Override
    public void sleep() {
        System.out.println(" Kangaroo is sleeping...");
    }
}
