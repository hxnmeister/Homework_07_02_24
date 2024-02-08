package com.ua.project.task5.dto;

public class MusicalInstrumentDto {
    private String name;
    private String sound;
    private String description;
    private String historyOfCreation;

    public MusicalInstrumentDto(String name, String sound, String description, String historyOfCreation) {
        this.name = name;
        this.sound = sound;
        this.description = description;
        this.historyOfCreation = historyOfCreation;
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
}
