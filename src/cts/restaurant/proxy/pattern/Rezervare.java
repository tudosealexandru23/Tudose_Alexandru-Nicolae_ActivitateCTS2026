package cts.restaurant.proxyb9.pattern;

public class Rezervare implements IRezervare {

    private String numeClient;
    private int nrPersoane;

    public Rezervare(String numeClient, int nrPersoane) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void realizeazaRezervare() {
        System.out.println("Rezervarea pentru " + numeClient +
                " a fost realizata pentru " + nrPersoane + " persoane.");
    }
}