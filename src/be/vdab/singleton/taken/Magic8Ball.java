package be.vdab.singleton.taken;

import java.util.Random;

public enum Magic8Ball {
    INSTANCE;

    private final String[] antwoorden = new String[] {"Zoals ik het zie, ja.", "Het is zeker.", "Hoogst waarschijnlijk.", "Ziet er goed uit.",
            "Zonder twijfel.", "Ja.", "Zeker.", "Je mag er op rekenen.", "Vraag dit later nog eens.",
            "Dit wil je niet weten", "Ik kan dit nu niet voorspellen", "Concentreer je en stel je vraag opnieuw",
            "Je moet er neit op rekenene.", "Nee.", "Ziet er neit goed uit", "Zeer twijfelachtig"};
    private int vorigAntwoordIndex = -1;

    String getAntwoord (String vraag) {
        System.out.println(vraag);
        Random random = new Random();
        int antwoordIndex = random.nextInt(antwoorden.length);
        while (vorigAntwoordIndex == antwoordIndex) {
            antwoordIndex = random.nextInt(antwoorden.length);
        }
        vorigAntwoordIndex = antwoordIndex;
        return antwoorden[antwoordIndex];
    }
}
