package cts.restaurant.facadeb6.pattern;

public class FacadeRestaurant {
    private VerificareMasaLibera verificareMasaLibera;
    private VerificareMasaDebarasata verificareMasaDebarasata;
    private VerificareServetele verificareServetele;

    public FacadeRestaurant() {
        verificareMasaLibera = new VerificareMasaLibera();
        verificareMasaDebarasata = new VerificareMasaDebarasata();
        verificareServetele = new VerificareServetele();
    }

    public boolean poateFiOcupata(Masa masa) {
        return verificareMasaLibera.esteLibera(masa)
                && verificareMasaDebarasata.esteDebarasata(masa)
                && verificareServetele.areServeteleNoi(masa);
    }
}