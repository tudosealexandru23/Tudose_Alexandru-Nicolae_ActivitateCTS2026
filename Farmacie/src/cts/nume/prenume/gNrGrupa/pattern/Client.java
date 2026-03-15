package cts.nume.prenume.gNrGrupa.pattern;

import java.util.ArrayList;
import java.util.List;

public class Client implements Cloneable {

    private String nume;
    private TipClient tip;
    private List<String> medicamenteInterzise = new ArrayList<>();
    private List<String> listaMedicamentePersonale = new ArrayList<>();

    public Client(String nume, TipClient tip) {
        this.nume = nume;
        this.tip = tip;
        if (tip == TipClient.COPIL) {
            listaMedicamentePersonale.add("Vitamina C");
        } else if (tip == TipClient.ADULT) {
            listaMedicamentePersonale.add("Paracetamol");
        } else {
            listaMedicamentePersonale.add("Calciu");
        }
    }

    public void actualizeazaMedicamenteInterzise(String med) {
        if (!medicamenteInterzise.contains(med)) {
            medicamenteInterzise.add(med);
            System.out.println(nume + " a fost notificat pentru medicamentul interzis: " + med);
        }
    }

    public void adaugaMedicamentPersonal(String med) {
        if (!listaMedicamentePersonale.contains(med)) {
            listaMedicamentePersonale.add(med);
            System.out.println(nume + " a adaugat medicamentul personal: " + med);
        }
    }

    public Client clone() {
        Client copy = new Client(this.nume, this.tip);
        copy.medicamenteInterzise = new ArrayList<>(this.medicamenteInterzise);
        copy.listaMedicamentePersonale = new ArrayList<>(this.listaMedicamentePersonale);
        return copy;
    }

    public String getNume() {
        return nume;
    }

    public TipClient getTip() {
        return tip;
    }

    public List<String> getMedicamenteInterzise() {
        return medicamenteInterzise;
    }

    public List<String> getListaMedicamentePersonale() {
        return listaMedicamentePersonale;
    }
}