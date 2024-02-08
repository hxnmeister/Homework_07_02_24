package com.ua.project.task2;

import com.ua.project.task2.dto.AnimalDto;
import com.ua.project.task2.model.Animal;

public class Tiger extends Animal {
    public Tiger(AnimalDto animalDto) {
        super(animalDto);
    }
    public Tiger() {
        this(new AnimalDto(10, 15.2, "Tiger", "Color"));
    }

    @Override
    public void hunt() {
        System.out.println(" Tiger " + this.getName() + " is hunting...");
    }

    @Override
    public void eat() {
        System.out.println(" Tiger eating...");
    }

    @Override
    public void sleep() {
        System.out.println(" Tiger is sleeping...");
    }
}
