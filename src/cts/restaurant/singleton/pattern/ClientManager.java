import java.util.HashMap;
import java.util.Map;

public class ClientManager {
    private static ClientManager instance; // instanta unica
    private Map<String, Client> clienti = new HashMap<>();

    private ClientManager() {} // constructor privat

    public static ClientManager getInstance() {
        if (instance == null) {
            instance = new ClientManager();
        }
        return instance;
    }

    public Client getClient(String telefon) {
        return clienti.get(telefon);
    }

    public void adaugaClient(Client client) {
        clienti.put(client.getTelefon(), client);
    }
}