package cts.restaurant.builder.main;

import cts.restaurant.builder.pattern.Rezervare;
import cts.restaurant.builder.pattern.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare r1 = new RezervareBuilder("Popescu Andrei")
                .setAsezareLaGeam(true)
                .setDecorareMasa(true)
                .build();

        Rezervare r2 = new RezervareBuilder("Ionescu Maria")
                .setScauneErgonomice(true)
                .setMuzicaAmbientala(true)
                .setGenMuzica("jazz")
                .build();

        Rezervare r3 = new RezervareBuilder("Georgescu Mihai")
                .build();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}