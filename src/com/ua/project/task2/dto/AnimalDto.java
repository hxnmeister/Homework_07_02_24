package com.ua.project.task2.dto;

public class AnimalDto {
    private int age;
    private double weight;
    private String name;
    private String color;

    public AnimalDto(int age, double weight, String name, String color) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.color = color;
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
}
