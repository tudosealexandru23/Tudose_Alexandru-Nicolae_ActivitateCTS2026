package cts.restaurant.chainb16.pattern;

public abstract class Notificator {
    protected Notificator urmator;

    public void setUrmator(Notificator urmator) {
        this.urmator = urmator;
    }

    public abstract void trimiteNotificare(Client client, String mesaj);
}