package com.ua.project.task2.model;

import com.ua.project.helpers.InputHelpers;
import com.ua.project.task2.dto.AnimalDto;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Animal {
    private int age;
    private double weight;
    private String name;
    private String color;

    public Animal(AnimalDto dto) {
        this.age = dto.getAge();
        this.weight = dto.getWeight();
        this.name = dto.getName();
        this.color = dto.getColor();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double getDoubleInput(final String inputMessage) {
        double doubleInput;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try{
                System.out.print(inputMessage);
                doubleInput = scanner.nextDouble();

                if(doubleInput <= 0.0){
                    throw new IllegalArgumentException(" Enter value greater than zero!");
                }

                return doubleInput;
            }
            catch (InputMismatchException inputEx){
                System.out.println(" Enter a number!");
                scanner.next();
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public void fillInfo() {
        this.name = InputHelpers.getInputStringByLength("\n Enter name: ", 3);
        this.color = InputHelpers.getInputStringByLength("\n Enter color: ", 3);

        this.age = InputHelpers.getPositiveIntegerInput("\n Enter age: ");

        this.weight = getDoubleInput("\n Enter weight: ");
    }

    public abstract void sleep();

    public abstract void eat();

    public  abstract void hunt();

    @Override
    public String toString() {
        return String.format(" %s%n  Age: %s%n  Weight: %s%n  Color: %s%n",
                this.getName(),
                this.getAge(),
                this.getWeight(),
                this.getColor());
    }
}
