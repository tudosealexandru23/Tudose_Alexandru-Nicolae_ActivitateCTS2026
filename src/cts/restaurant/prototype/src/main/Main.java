package cts.restaurant.prototype.src.main;

import cts.restaurant.prototype.src.pattern.Client;
import cts.restaurant.prototype.src.pattern.ClientRegistry;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Alex Tudor", "0723456789", "alex.tudor@restaurant.com");

        ClientRegistry.adaugaClient(c1);

        Client clientRezervare = ClientRegistry.getClient("Alex Tudor");

        System.out.println(clientRezervare);
    }
}