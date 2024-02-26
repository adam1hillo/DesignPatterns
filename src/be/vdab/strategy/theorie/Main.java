package be.vdab.strategy.theorie;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Persoon[] personen = new Persoon[] {
                new Persoon("Jean", "Smits", "heer"),
                new Persoon("Jeanine", "Desmet", "mevrouw")
        };
        for (Persoon persoon : personen) {
            System.out.println(persoon.maakBriefHoofding(pers -> informeel(pers.getVoornaam())));
        }
        for (Persoon persoon : personen) {
            System.out.println(persoon.maakBriefHoofding(pers -> formeel(pers.getFamilienaam(), pers.getTitel())));
        }
    }
    private static String informeel (String voornaam) {
        return "Dag " + voornaam;
    }
    private static String formeel (String familienaam, String titel) {
        return "Geachte " + titel + " " + familienaam;
    }
}
