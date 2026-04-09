package cts.restaurant.factoryb1.main;

import cts.restaurant.factoryb1.pattern.Supa;
import cts.restaurant.factoryb1.pattern.SupaFactory;
import cts.restaurant.factoryb1.pattern.TipSupa;

public class Main {
    public static void main(String[] args) {

        Supa s1 = SupaFactory.getSupa(TipSupa.LEGUME);
        Supa s2 = SupaFactory.getSupa(TipSupa.CIUPERCI);
        Supa s3 = SupaFactory.getSupa(TipSupa.VITA);

        s1.afisare();
        s2.afisare();
        s3.afisare();
    }
}