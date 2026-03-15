package cts.nume.prenume.gNrGrupa.pattern;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

    private List<Masina> masini = new ArrayList<>();

    public void inregistreazaMasina(Masina m) {
        masini.add(m);
        System.out.println("Masina " + m.getMarca() + " a fost inregistrata.");
    }

    public void afiseazaMasini() {
        System.out.println("Lista masinilor:");
        for(Masina m : masini) {
            System.out.print(m.getMarca() + " (" + m.getTip() + ")");
            if(m.getDotari() != null) {
                System.out.print(" Dotari: ");
                for(String d : m.getDotari()) System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}