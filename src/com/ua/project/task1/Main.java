package com.ua.project.task1;

import com.ua.project.helpers.InputHelpers;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Sailor sailor = new Sailor();
        Pilot pilot = new Pilot();

        pilot.fillBio();
        pilot.fillWorkerInfo();
        pilot.addFlightHours(24);

        sailor.fillBio();
        sailor.fillWorkerInfo();
        sailor.setVessel(InputHelpers.getInputStringByLength("\n Enter vessel: ", 3));

        builder.fillBio();
        builder.fillWorkerInfo();
        builder.setCanReadDrawings(false);

        System.out.println(builder);
        System.out.println("-".repeat(100));
        System.out.println(sailor);
        System.out.println("-".repeat(100));
        System.out.println(pilot);
    }
}
