package cts.restaurant.prototype.src.pattern;

public class Client implements Cloneable {

    private String nume;
    private String telefon;
    private String email;

    public Client(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public Object clone() {
        return new Client(nume, telefon, email);
    }

    @Override
    public String toString() {
        return "Client: " + nume + " | Tel: " + telefon + " | Email: " + email;
    }
}