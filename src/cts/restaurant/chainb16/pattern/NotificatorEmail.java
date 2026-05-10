package cts.restaurant.chainb16.pattern;

public class NotificatorEmail extends Notificator {

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if (client.getEmail() != null && !client.getEmail().isEmpty()) {
            System.out.println("Email catre " + client.getNume() + ": " + mesaj);
        } else if (urmator != null) {
            urmator.trimiteNotificare(client, mesaj);
        }
    }
}