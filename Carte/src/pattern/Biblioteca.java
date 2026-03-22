package cts.nume.prenume.gNrGrupa.pattern;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Carte> carti = new ArrayList<>();

    public void inregistreazaCarte(Carte c) {
        carti.add(c);
    }

    public void afiseazaCarti() {
        for (Carte c : carti) {
            c.afisare();
        }
    }
}