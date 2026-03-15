package cts.nume.prenume.gNrGrupa.pattern;

import java.util.ArrayList;
import java.util.List;

public class MedicamentInterzis {

    private List<Client> clienti = new ArrayList<>();
    private List<String> medicamente = new ArrayList<>();

    public void adaugaMedicament(String med) {
        if (!medicamente.contains(med)) {
            medicamente.add(med);
            notifyClienti(med);
        }
    }

    public void register(Client c) {
        if (!clienti.contains(c)) {
            clienti.add(c);
        }
    }

    private void notifyClienti(String med) {
        for (Client c : clienti) {
            c.actualizeazaMedicamenteInterzise(med);
        }
    }
}