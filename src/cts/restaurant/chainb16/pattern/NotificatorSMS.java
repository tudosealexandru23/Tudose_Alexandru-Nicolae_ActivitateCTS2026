package cts.restaurant.chainb16.pattern;

public class NotificatorSMS extends Notificator {

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if (client.getTelefon() != null && !client.getTelefon().isEmpty()) {
            System.out.println("SMS catre " + client.getNume() + ": " + mesaj);
        } else if (urmator != null) {
            urmator.trimiteNotificare(client, mesaj);
        }
    }
}