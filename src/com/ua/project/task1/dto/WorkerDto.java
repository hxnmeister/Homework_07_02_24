package com.ua.project.task1.dto;

import java.math.BigDecimal;

public class WorkerDto {
    private int experience;
    private String rank;
    private BigDecimal salary;

    public WorkerDto(int experience, String rank, BigDecimal salary) {
        this.experience = experience;
        this.rank = rank;
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
