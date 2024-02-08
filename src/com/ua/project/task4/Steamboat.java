package com.ua.project.task4;

import com.ua.project.task4.abstraction.Device;

public class Steamboat extends Device {
    public Steamboat(String description, String sound, String name) {
        super(description, sound, name);
    }
    public Steamboat() {
        this("Manufacturer2", "Color2", "Steamboat");
    }

    @Override
    public void sound(){
        System.out.println(" Sound of Steamboat: " + this.getSound());
    }

    @Override
    public void show(){
        System.out.println(" Name of Steamboat: " + this.getName());
    }

    @Override
    public void desc(){
        System.out.println(" Description of Steamboat: " + this.getDescription());
    }
}
