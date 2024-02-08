package com.ua.project.task3;

import com.ua.project.helpers.InputHelpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private Money price;
    private String name;
    private Date bestBeforeDate;

    public Product(Money price, String name, Date bestBeforeDate) {
        this.price = price;
        this.name = name;
        this.bestBeforeDate = bestBeforeDate;
    }
    public Product() {
        this(new Money(1, 1), "", new Date());
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBestBeforeDate() {
        return bestBeforeDate;
    }

    public void setBestBeforeDate(Date bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    public void reducePrice(Money value) {
        price.reduceCurrentValue(value);
    }

    public void fillInfo() {
        this.name = InputHelpers.getInputStringByLength("\n Enter name: ", 3);

        this.bestBeforeDate = InputHelpers.getInputDate("\n Enter best before date (yyyy-MM-dd): ");

        this.price.enterCurrentValue();
    }

    @Override
    public String toString() {
        return String.format(" Product: %s%n Price: %s%n Best before date: %s%n",
                this.getName(),
                this.getPrice(),
                new SimpleDateFormat("yyyy-MM-dd").format(this.getBestBeforeDate()));
    }
}
