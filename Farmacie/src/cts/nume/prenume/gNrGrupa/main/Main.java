package cts.nume.prenume.gNrGrupa.main;

import cts.nume.prenume.gNrGrupa.pattern.*;

public class Main {

    public static void main(String[] args) {

        Farmacie farmacie = new Farmacie();

        Client c1 = new Client("Paul", TipClient.ADULT);
        Client c2 = new Client("Clarisa", TipClient.COPIL);
        Client c3 = new Client("Ioana", TipClient.ADULT);

        farmacie.inregistreazaClient(c1);
        farmacie.inregistreazaClient(c2);
        farmacie.inregistreazaClient(c3);

        farmacie.adaugaMedicamentInterzis("SteroidX");

        c1.adaugaMedicamentPersonal("Ibuprofen");

        farmacie.simuleazaProces();
    }
}