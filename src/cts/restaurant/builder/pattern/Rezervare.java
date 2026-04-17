package cts.restaurant.builder.pattern;

public class Rezervare {
    String numeClient;
    boolean asezareLaGeam;
    boolean scauneErgonomice;
    boolean decorareMasa;
    boolean muzicaAmbientala;
    String genMuzica;

    public Rezervare(String numeClient, boolean asezareLaGeam, boolean scauneErgonomice,
                     boolean decorareMasa, boolean muzicaAmbientala, String genMuzica) {
        this.numeClient = numeClient;
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare pentru " + numeClient +
                ", la geam=" + asezareLaGeam +
                ", scaune ergonomice=" + scauneErgonomice +
                ", decorare masa=" + decorareMasa +
                ", muzica ambientala=" + muzicaAmbientala +
                ", gen muzica=" + genMuzica;
    }
}