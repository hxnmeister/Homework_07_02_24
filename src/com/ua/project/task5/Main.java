package com.ua.project.task5;

import com.ua.project.task5.dto.MusicalInstrumentDto;

public class Main {
    public static void main(String[] args) {
        Trombone trombone = new Trombone(new MusicalInstrumentDto("Trombonchik", "VOOOOOOO-VOOO-VOOOOO", "Good one tromb!", "It was create at some place"));
        Ukulele ukulele = new Ukulele(new MusicalInstrumentDto("Ukulelchik", "Trin-Trin", "Nice small guitar =)", "At some point its guitar but its not a guitar"));
        Violin violin = new Violin(new MusicalInstrumentDto("Violinchik", "Tuuuuu-Tu-Tu-Tu", "Nice and handy!", "Create by very talented musician"));
        Cello cello = new Cello(new MusicalInstrumentDto("Cellchik", "Viiiii-vii-vii", "Very comfortable!", "Created as piece of art!"));

        cello.show();
        cello.desc();
        cello.sound();
        cello.history();

        System.out.println("-".repeat(50));

        violin.show();
        violin.desc();
        violin.sound();
        violin.history();

        System.out.println("-".repeat(50));

        ukulele.show();
        ukulele.desc();
        ukulele.sound();
        ukulele.history();

        System.out.println("-".repeat(50));

        trombone.show();
        trombone.desc();
        trombone.sound();
        trombone.history();
    }
}
