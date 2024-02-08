package com.ua.project.task1.model;

import com.ua.project.task1.dto.HumanDto;
import com.ua.project.task1.dto.WorkerDto;
import com.ua.project.helpers.InputHelpers;

import java.math.BigDecimal;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Worker extends Human {
    private int experience;
    private String rank;
    private BigDecimal salary;

    public Worker(HumanDto humanDto, WorkerDto workerDto) {
        super(humanDto);
        this.experience = workerDto.getExperience();
        this.rank = workerDto.getRank();
        this.salary = workerDto.getSalary();
    }
    public Worker(){
        this(new HumanDto("First Name", "Last Name", new Date()),
                new WorkerDto(1, "", BigDecimal.ZERO));
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


    private BigDecimal getPositiveBigDecimalInput(final String inputMessage) {
        BigDecimal bigDecimalInput;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try{
                System.out.print(inputMessage);
                bigDecimalInput = scanner.nextBigDecimal();

                if(bigDecimalInput.compareTo(BigDecimal.ZERO) <= 0){
                    throw new IllegalArgumentException(" Number cannot be less than zero or equals to it!");
                }

                return bigDecimalInput;
            }
            catch(InputMismatchException inputEx) {
                System.out.println(" Incorrect input, please enter a number!");
                scanner.next();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public void fillWorkerInfo() {
        this.experience = InputHelpers.getPositiveIntegerInput("\n Enter experience: ");

        this.salary = getPositiveBigDecimalInput("\n Enter salary: ");

        this.rank = InputHelpers.getInputStringByLength("\n Enter rank: ", 4);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("  Experience: %s%n  Rank: %s%n  Salary: %s%n",
                this.getExperience(),
                this.getRank(),
                this.getSalary());
    }
}
