package cts.restaurant.adapter.pattern;

public class SoftFacturiVechi implements SoftFacturi {

    @Override
    public void printeazaFactura(String produs) {
        System.out.println("Factura (bucatarie): " + produs);
    }
}