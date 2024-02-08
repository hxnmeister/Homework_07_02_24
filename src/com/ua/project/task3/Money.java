package com.ua.project.task3;

import com.ua.project.helpers.InputHelpers;

public class Money {
    private int wholePart;
    private int fractionalPart;
    private final int MAX_CENTS = 99;

    public Money(int wholePart, int fractionalPart) {
        this.wholePart = wholePart;
        this.fractionalPart = fractionalPart;
    }
    public Money() {
        this.wholePart = 1;
        this.fractionalPart = 0;
    }

    public int getWholePart() {
        return wholePart;
    }

    public void setWholePart(int wholePart) {
        this.wholePart = wholePart;
    }

    public int getFractionalPart() {
        return fractionalPart;
    }

    public void setFractionalPart(int fractionalPart) {
        this.fractionalPart = fractionalPart;
    }

    public void enterCurrentValue() {
        int tempInteger;

        this.wholePart = InputHelpers.getPositiveIntegerInput("\n Enter whole part of money: ");

        while(true) {
            tempInteger = InputHelpers.getPositiveIntegerInput("\n Enter fractional part of money: ");

            if(tempInteger > MAX_CENTS){
                System.out.printf(" Fractional part cannot exceed %s!%n", MAX_CENTS);
                continue;
            }

            this.fractionalPart = tempInteger;
            break;
        }
    }

    public void reduceCurrentValue(Money value) {
        if(this.wholePart < value.getWholePart() ||
                (this.wholePart == value.getWholePart() && this.fractionalPart < value.getFractionalPart())){
            System.out.println(" Cannot reduce price to negative value!");
            return;
        }

        if (this.fractionalPart < value.getFractionalPart()) {
            this.wholePart -= (value.getWholePart() + 1);
            this.fractionalPart = 100 - (value.getFractionalPart() - this.fractionalPart);
        }
        else {
            this.wholePart -= value.getWholePart();
            this.fractionalPart -= value.getFractionalPart();
        }
    }

    @Override
    public String toString() {
        return String.format(" %s.%s",
                this.getWholePart(),
                this.getFractionalPart());
    }
}
