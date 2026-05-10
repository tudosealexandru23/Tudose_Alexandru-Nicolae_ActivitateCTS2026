package cts.restaurant.chainb16.pattern;

public class NotificatorManager extends Notificator {

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println("Manager anuntat: clientul " + client.getNume() + " nu are date de contact.");
    }
}