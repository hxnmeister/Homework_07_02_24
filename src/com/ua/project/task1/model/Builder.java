package com.ua.project.task1.model;

import com.ua.project.task1.dto.HumanDto;
import com.ua.project.task1.dto.WorkerDto;
import com.ua.project.task1.model.Worker;

public class Builder extends Worker {
    private boolean canReadDrawings;

    public Builder(HumanDto humanDto, WorkerDto workerDto, boolean canReadDrawings) {
        super(humanDto, workerDto);
        this.canReadDrawings = canReadDrawings;
    }
    public Builder() {
        this.canReadDrawings = true;
    }

    public boolean isCanReadDrawings() {
        return canReadDrawings;
    }

    public void setCanReadDrawings(boolean canReadDrawings) {
        this.canReadDrawings = canReadDrawings;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("  Can read drawings: %s%n", this.isCanReadDrawings() ? "Yes" : "No");
    }
}
