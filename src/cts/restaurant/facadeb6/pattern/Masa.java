package cts.restaurant.facadeb6.pattern;

public class Masa {
    private int numar;
    private boolean libera;
    private boolean debarasata;
    private boolean areServetele;

    public Masa(int numar, boolean libera, boolean debarasata, boolean areServetele) {
        this.numar = numar;
        this.libera = libera;
        this.debarasata = debarasata;
        this.areServetele = areServetele;
    }

    public int getNumar() {
        return numar;
    }

    public boolean isLibera() {
        return libera;
    }

    public boolean isDebarasata() {
        return debarasata;
    }

    public boolean isAreServetele() {
        return areServetele;
    }
}
