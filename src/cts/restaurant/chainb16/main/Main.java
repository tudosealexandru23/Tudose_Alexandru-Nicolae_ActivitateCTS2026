package cts.restaurant.chainb16.main;

import cts.restaurant.chainb16.pattern.Client;
import cts.restaurant.chainb16.pattern.Notificator;
import cts.restaurant.chainb16.pattern.NotificatorEmail;
import cts.restaurant.chainb16.pattern.NotificatorManager;
import cts.restaurant.chainb16.pattern.NotificatorSMS;

public class Main {

    public static void main(String[] args) {
        Notificator sms = new NotificatorSMS();
        Notificator email = new NotificatorEmail();
        Notificator manager = new NotificatorManager();

        sms.setUrmator(email);
        email.setUrmator(manager);

        Client c1 = new Client("Mihai Popescu", "0722456189", "mihai@yahoo.com");
        Client c2 = new Client("Andrei Pavel", "", "andrei.pavel@gmail.com");
        Client c3 = new Client("Ioana Matei", null, "ioana.matei@yahoo.com");
        Client c4 = new Client("Raluca Stan", "", "");

        String mesaj = "Avem un meniu nou de sarbatori cu reducere 20%.";

        sms.trimiteNotificare(c1, mesaj);
        sms.trimiteNotificare(c2, mesaj);
        sms.trimiteNotificare(c3, mesaj);
        sms.trimiteNotificare(c4, mesaj);
    }
}