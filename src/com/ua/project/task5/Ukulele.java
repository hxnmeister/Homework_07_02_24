package com.ua.project.task5;

import com.ua.project.task5.abstraction.MusicalInstrument;
import com.ua.project.task5.dto.MusicalInstrumentDto;

public class Ukulele extends MusicalInstrument {
    public Ukulele(MusicalInstrumentDto musicalInstrumentDto){
        super(musicalInstrumentDto);
    }
    public Ukulele() {
        this(new MusicalInstrumentDto("Ukulele", "RE-MI-mi-do", "Not bad Ukulele", "It was somewhere created!"));
    }

    @Override
    public void sound(){
        System.out.println(" Ukulele sound: " + this.getSound());
    }

    @Override
    public void show(){
        System.out.println(" Ukulele name: " + this.getName());
    }

    @Override
    public void desc(){
        System.out.println(" Ukulele description: " + this.getDescription());
    }

    @Override
    public void history(){
        System.out.println(" Ukulele history: " + this.getHistoryOfCreation());
    }
}
