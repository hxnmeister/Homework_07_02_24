package com.ua.project.task5;

import com.ua.project.task5.abstraction.MusicalInstrument;
import com.ua.project.task5.dto.MusicalInstrumentDto;

public class Cello extends MusicalInstrument {
    public Cello(MusicalInstrumentDto musicalInstrumentDto){
        super(musicalInstrumentDto);
    }
    public Cello() {
        this(new MusicalInstrumentDto("Cello", "Fa-Sol-La-Fa", "Not bad Cello", "It was somewhere created!"));
    }

    @Override
    public void sound(){
        System.out.println(" Cello sound: " + this.getSound());
    }

    @Override
    public void show(){
        System.out.println(" Cello name: " + this.getName());
    }

    @Override
    public void desc(){
        System.out.println(" Cello description: " + this.getDescription());
    }

    @Override
    public void history(){
        System.out.println(" Cello history: " + this.getHistoryOfCreation());
    }
}
