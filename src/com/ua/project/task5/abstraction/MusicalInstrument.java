package com.ua.project.task5.abstraction;

import com.ua.project.task5.dto.MusicalInstrumentDto;

public abstract class MusicalInstrument {
    private String name;
    private String sound;
    private String description;
    private String historyOfCreation;

    public MusicalInstrument(MusicalInstrumentDto dto) {
        this.name = dto.getName();
        this.sound = dto.getSound();
        this.description = dto.getDescription();
        this.historyOfCreation = dto.getHistoryOfCreation();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHistoryOfCreation() {
        return historyOfCreation;
    }

    public void setHistoryOfCreation(String historyOfCreation) {
        this.historyOfCreation = historyOfCreation;
    }

    public abstract void sound();

    public abstract void show();

    public abstract void desc();

    public abstract void history();
}
