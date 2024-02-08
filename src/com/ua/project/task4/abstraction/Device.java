package com.ua.project.task4.abstraction;

public abstract class Device {
    private String description;
    private String sound;
    private String name;

    public Device(String description, String sound, String name) {
        this.description = description;
        this.sound = sound;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sound();

    public abstract void show();

    public abstract void desc();
}
