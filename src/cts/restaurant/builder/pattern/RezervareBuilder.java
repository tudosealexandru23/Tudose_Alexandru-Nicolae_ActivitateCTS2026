package cts.restaurant.builder.pattern;

public class RezervareBuilder implements Builder {
    private String numeClient;
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public RezervareBuilder(String numeClient) {
        this.numeClient = numeClient;
        this.asezareLaGeam = false;
        this.scauneErgonomice = false;
        this.decorareMasa = false;
        this.muzicaAmbientala = false;
        this.genMuzica = "fara preferinta";
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(numeClient, asezareLaGeam, scauneErgonomice,
                decorareMasa, muzicaAmbientala, genMuzica);
    }
}