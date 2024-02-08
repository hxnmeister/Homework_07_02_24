package com.ua.project.task4;

import com.ua.project.task4.abstraction.Device;

public class Car extends Device {
    public Car(String description, String sound, String name) {
        super(description, sound, name);
    }
    public Car() {
        this("Manufacturer3", "Color3", "Car");
    }

    @Override
    public void sound(){
        System.out.println(" Sound of Car: " + this.getSound());
    }

    @Override
    public void show(){
        System.out.println(" Name of Car: " + this.getName());
    }

    @Override
    public void desc(){
        System.out.println(" Description of Car: " + this.getDescription());
    }
}
