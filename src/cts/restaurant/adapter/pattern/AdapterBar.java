package cts.restaurant.adapter.pattern;

public class AdapterBar implements SoftFacturi {

    private SoftBarNou softBar;

    public AdapterBar(SoftBarNou softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaFactura(String produs) {
        // adaptare între cele două sisteme
        softBar.printareNotaBar(produs);
    }
}