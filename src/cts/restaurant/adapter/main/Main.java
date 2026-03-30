package cts.restaurant.adapter.main;

import cts.restaurant.adapter.pattern.AdapterBar;
import cts.restaurant.adapter.pattern.SoftBarNou;
import cts.restaurant.adapter.pattern.SoftFacturi;

public class Main {
    public static void main(String[] args) {


        SoftBarNou softNou = new SoftBarNou();


        SoftFacturi adapter = new AdapterBar(softNou);

        adapter.printeazaFactura("Bloody Mary");
    }
}