package cts.nume.prenume.gNrGrupa.pattern;

import java.util.ArrayList;
import java.util.List;

public class Farmacie {

    private List<Client> clienti = new ArrayList<>();
    private MedicamentInterzis medicamentInterzis = new MedicamentInterzis();

    public void inregistreazaClient(Client c) {
        clienti.add(c);
        medicamentInterzis.register(c);
        System.out.println(c.getNume() + " a fost inregistrat in farmacie.");
    }

    public void adaugaMedicamentInterzis(String med) {
        System.out.println("Adaugam medicamentul interzis: " + med);
        medicamentInterzis.adaugaMedicament(med);
    }

    public void simuleazaProces() {
        for (Client c : clienti) {
            System.out.println("Client: " + c.getNume() + ", Tip: " + c.getTip());
            System.out.println("Medicamente personale: " + c.getListaMedicamentePersonale());
            System.out.println("Medicamente interzise: " + c.getMedicamenteInterzise());
            System.out.println("----");
        }
    }
}