package cts.restaurant.proxyb9.pattern;

public class ProxyRezervare implements IRezervare {

    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare() {

        if (rezervare.getNrPersoane() >= 4) {
            rezervare.realizeazaRezervare();
        } else {
            System.out.println("Rezervarea nu poate fi realizata pentru mai putin de 4 persoane.");
        }
    }
}