package cts.nume.prenume.gNrGrupa.main;

import cts.nume.prenume.gNrGrupa.pattern.*;

public class Main {

    public static void main(String[] args) {

        Dealer dealer = new Dealer();

        Masina m1 = new Masina("Dacia", TipMasina.SEDAN);
        String[] dotari1 = {"AC", "Radio"};
        m1.setDotari(dotari1);

        Masina m2 = new Masina("Toyota", TipMasina.SUV);
        String[] dotari2 = {"GPS", "Bluetooth"};
        m2.setDotari(dotari2);

        Masina m3 = m1.clone();
        m3.setMarca("Dacia Clona");

        dealer.inregistreazaMasina(m1);
        dealer.inregistreazaMasina(m2);
        dealer.inregistreazaMasina(m3);

        dealer.afiseazaMasini();
    }
}