package com.ua.project.task5;

import com.ua.project.task5.abstraction.MusicalInstrument;
import com.ua.project.task5.dto.MusicalInstrumentDto;

public class Violin extends MusicalInstrument {
    public Violin(MusicalInstrumentDto musicalInstrumentDto){
        super(musicalInstrumentDto);
    }
    public Violin() {
        this(new MusicalInstrumentDto("Violin", "Do-Re-Mi", "GOOD VIOLIN", "Some history!"));
    }

    @Override
    public void sound(){
        System.out.println(" Violin sound: " + this.getSound());
    }

    @Override
    public void show(){
        System.out.println(" Violin name: " + this.getName());
    }

    @Override
    public void desc(){
        System.out.println(" Violin description: " + this.getDescription());
    }

    @Override
    public void history(){
        System.out.println(" Violin history: " + this.getHistoryOfCreation());
    }
}
