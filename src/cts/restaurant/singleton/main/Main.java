public class Main {
    public static void main(String[] args) {

        ClientManager manager = ClientManager.getInstance();

        Client c1 = new Client("Gigi", "0712345678");
        manager.adaugaClient(c1);

        Client c2 = manager.getClient("0799999999");

        System.out.println(c2.getNume());
    }
}