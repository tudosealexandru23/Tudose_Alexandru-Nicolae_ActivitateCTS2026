package cts.restaurant.facadeb6.main;

import cts.restaurant.facadeb6.pattern.FacadeRestaurant;
import cts.restaurant.facadeb6.pattern.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1, true, true, true);
        Masa masa2 = new Masa(2, true, false, true);

        FacadeRestaurant facadeRestaurant = new FacadeRestaurant();

        if (facadeRestaurant.poateFiOcupata(masa1)) {
            System.out.println("Masa " + masa1.getNumar() + " este ocupata.");
        } else {
            System.out.println("Masa " + masa1.getNumar() + " nu este ocupata.");
        }

        if (facadeRestaurant.poateFiOcupata(masa2)) {
            System.out.println("Masa " + masa2.getNumar() + " este ocupata.");
        } else {
            System.out.println("Masa " + masa2.getNumar() + " nu este ocupata.");
        }
    }
}