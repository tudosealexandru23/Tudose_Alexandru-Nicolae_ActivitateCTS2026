package cts.nume.prenume.gNrGrupa.pattern;

public class Masina implements Cloneable {

    private String marca;
    private TipMasina tip;
    private String[] dotari;

    public Masina() {
        this.marca = "Dacia";
        this.tip = TipMasina.SEDAN;
        this.dotari = null;
    }

    public Masina(String marca, TipMasina tip) {
        this.marca = marca;
        this.tip = tip;
        this.dotari = null;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipMasina getTip() {
        return tip;
    }

    public void setTip(TipMasina tip) {
        this.tip = tip;
    }

    public String[] getDotari() {
        if(dotari == null) return null;
        String[] copy = new String[dotari.length];
        for(int i=0;i<dotari.length;i++) copy[i] = dotari[i];
        return copy;
    }

    public void setDotari(String[] dotari) {
        if(dotari == null) {
            this.dotari = null;
            return;
        }
        this.dotari = new String[dotari.length];
        for(int i=0;i<dotari.length;i++) this.dotari[i] = dotari[i];
    }

    @Override
    public Masina clone() {
        Masina copy = new Masina(this.marca, this.tip);
        copy.setDotari(this.dotari);
        return copy;
    }
}