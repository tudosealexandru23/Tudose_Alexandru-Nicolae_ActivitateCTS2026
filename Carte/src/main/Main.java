package cts.nume.prenume.gNrGrupa.main;

import cts.nume.prenume.gNrGrupa.pattern.*;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Carte c1 = new Carte("Ion", TipCarte.ROMAN);
        String[] genuri1 = {"Clasic", "Realist"};
        c1.setGenuri(genuri1);

        Carte c2 = new Carte("Dune", TipCarte.SF);
        String[] genuri2 = {"SF", "Aventura"};
        c2.setGenuri(genuri2);

        Carte c3 = c1.clone();
        c3.setTitlu("Ion - Editie Speciala");

        biblioteca.inregistreazaCarte(c1);
        biblioteca.inregistreazaCarte(c2);
        biblioteca.inregistreazaCarte(c3);

        biblioteca.afiseazaCarti();
    }
}