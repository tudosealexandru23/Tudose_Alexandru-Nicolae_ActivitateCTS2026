public class Client {
    private String nume;
    private String telefon;

    public Client(String nume, String telefon) {
        this.nume = nume;
        this.telefon = telefon;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getNume() {
        return nume;
    }
}