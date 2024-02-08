package com.ua.project.task4;

import com.ua.project.task4.abstraction.Device;

public class Kettle extends Device {
    public Kettle(String description, String sound, String name) {
        super(description, sound, name);
    }
    public Kettle() {
        this("Manufacturer", "Color", "Kettle");
    }

    @Override
    public void sound(){
        System.out.println(" Sound of Kettle: " + this.getSound());
    }

    @Override
    public void show(){
        System.out.println(" Name of Kettle: " + this.getName());
    }

    @Override
    public void desc(){
        System.out.println(" Description of Kettle: " + this.getDescription());
    }
}
