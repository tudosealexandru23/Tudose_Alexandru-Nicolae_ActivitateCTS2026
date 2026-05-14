package cts.restaurant.proxyb9.main;

import cts.restaurant.proxyb9.pattern.ProxyRezervare;
import cts.restaurant.proxyb9.pattern.Rezervare;

public class Main {

    public static void main(String[] args) {

        Rezervare r1 = new Rezervare("Ion Agapie", 5);
        Rezervare r2 = new Rezervare("Cristi Lazar", 2);

        ProxyRezervare proxy1 = new ProxyRezervare(r1);
        ProxyRezervare proxy2 = new ProxyRezervare(r2);

        proxy1.realizeazaRezervare();
        proxy2.realizeazaRezervare();
    }
}