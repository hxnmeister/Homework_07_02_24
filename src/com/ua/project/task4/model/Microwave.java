package com.ua.project.task4.model;

import com.ua.project.task4.model.Device;

public class Microwave extends Device {
    public Microwave(String description, String sound, String name) {
        super(description, sound, name);
    }
    public Microwave() {
        this("Manufacturer1", "Color1", "Microwave");
    }

    @Override
    public void sound(){
        System.out.println(" Sound of Microwave: " + this.getSound());
    }

    @Override
    public void show(){
        System.out.println(" Name of Microwave: " + this.getName());
    }

    @Override
    public void desc(){
        System.out.println(" Description of Microwave: " + this.getDescription());
    }
}
