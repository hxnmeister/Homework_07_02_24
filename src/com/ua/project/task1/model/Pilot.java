package com.ua.project.task1.model;

import com.ua.project.task1.dto.HumanDto;
import com.ua.project.task1.dto.WorkerDto;
import com.ua.project.task1.model.Worker;

public class Pilot extends Worker {
    private int totalFlightHours;

    public Pilot(HumanDto humanDto, WorkerDto workerDto, int totalFlightHours) {
        super(humanDto, workerDto);
        this.totalFlightHours = totalFlightHours;
    }
    public Pilot() {
        this.totalFlightHours = 0;
    }

    public int getTotalFlightHours() {
        return totalFlightHours;
    }

    public void setTotalFlightHours(int totalFlightHours) {
        this.totalFlightHours = totalFlightHours;
    }

    public void addFlightHours(int value) {
        if(value <= 0){
            System.out.println(" Incorrect data!");
            return;
        }

        this.totalFlightHours += value;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("  Total flight hours: %s%n", this.getTotalFlightHours());
    }
}
