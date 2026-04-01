package cts.restaurant.prototype.src.pattern;

import java.util.HashMap;
import java.util.Map;

public class ClientRegistry {

    private static Map<String, Client> clienti = new HashMap<>();

    public static void adaugaClient(Client c) {
        clienti.put(c.getNume(), c);
    }

    public static Client getClient(String nume) {
        if (clienti.containsKey(nume)) {
            return (Client) clienti.get(nume).clone();
        }
        return null;
    }
}