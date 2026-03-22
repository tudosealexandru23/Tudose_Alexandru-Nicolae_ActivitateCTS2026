package cts.nume.prenume.gNrGrupa.pattern;

public class Carte implements Cloneable {

    private String titlu;
    private TipCarte tip;
    private String[] genuri;

    public Carte(String titlu, TipCarte tip) {
        this.titlu = titlu;
        this.tip = tip;
    }

    public void setGenuri(String[] genuri) {
        this.genuri = genuri;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public Carte clone() {
        try {
            Carte copie = (Carte) super.clone();
            if (this.genuri != null) {
                copie.genuri = this.genuri.clone();
            }
            return copie;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void afisare() {
        System.out.println("Titlu: " + titlu);
        System.out.println("Tip: " + tip);

        if (genuri != null) {
            System.out.print("Genuri: ");
            for (String g : genuri) {
                System.out.print(g + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}