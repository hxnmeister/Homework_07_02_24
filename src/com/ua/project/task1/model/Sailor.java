package com.ua.project.task1.model;

import com.ua.project.task1.dto.HumanDto;
import com.ua.project.task1.dto.WorkerDto;
import com.ua.project.task1.model.Worker;

public class Sailor extends Worker {
    private String vessel;

    public Sailor(HumanDto humanDto, WorkerDto workerDto, String vessel){
        super(humanDto, workerDto);
        this.vessel = vessel;
    }
    public Sailor() {
        this.vessel = "";
    }

    public String getVessel() {
        return vessel;
    }

    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("  Vessel: %s%n", this.getVessel());
    }
}
