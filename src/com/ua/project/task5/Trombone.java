package com.ua.project.task5;

import com.ua.project.task5.abstraction.MusicalInstrument;
import com.ua.project.task5.dto.MusicalInstrumentDto;

public class Trombone extends MusicalInstrument {
    public Trombone(MusicalInstrumentDto musicalInstrumentDto){
        super(musicalInstrumentDto);
    }
    public Trombone() {
        this(new MusicalInstrumentDto("Trombone", "Do-Re-DO-do", "Nice one Trombone", "Some history of Trombone!"));
    }

    @Override
    public void sound(){
        System.out.println(" Trombone sound: " + this.getSound());
    }

    @Override
    public void show(){
        System.out.println(" Trombone name: " + this.getName());
    }

    @Override
    public void desc(){
        System.out.println(" Trombone description: " + this.getDescription());
    }

    @Override
    public void history(){
        System.out.println(" Trombone history: " + this.getHistoryOfCreation());
    }
}
