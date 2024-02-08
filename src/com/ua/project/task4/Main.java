package com.ua.project.task4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Good drifting car!", "Beep-beep", "Toyota");
        Kettle kettle = new Kettle("Good for tea", "Whistle", "Xiaomi");
        Microwave microwave = new Microwave("I blew my egg here, recommend!", "High beep", "Panasonic");
        Steamboat steamboat = new Steamboat("Very strong boat!!!", "Tooooooo-Toooooooooo", "Hope");

        car.desc();
        car.sound();
        car.show();

        System.out.println("-".repeat(50));

        kettle.desc();
        kettle.sound();
        kettle.show();

        System.out.println("-".repeat(50));

        microwave.desc();
        microwave.sound();
        microwave.show();

        System.out.println("-".repeat(50));

        steamboat.desc();
        steamboat.sound();
        steamboat.show();
    }
}
