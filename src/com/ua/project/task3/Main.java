package com.ua.project.task3;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Money money = new Money();

        product.fillInfo();
        System.out.println(product);
        System.out.println("-".repeat(50));

        System.out.println(" Enter value to reduce price:");
        money.enterCurrentValue();
        product.reducePrice(money);

        System.out.println("-".repeat(50));
        System.out.println(product);
    }
}
