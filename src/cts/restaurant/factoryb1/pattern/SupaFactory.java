package cts.restaurant.factoryb1.pattern;

public class SupaFactory {

    public static Supa getSupa(TipSupa tip) {
        switch (tip) {
            case LEGUME:
                return new SupaLegume();
            case CIUPERCI:
                return new SupaCiuperci();
            case VITA:
                return new SupaVita();
            default:
                return null;
        }
    }
}