package be.vdab.strategy.theorie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Persoon {
    private final String voornaam;
    private final String familienaam;
    private final String titel;

    Persoon(String voornaam, String familienaam, String titel) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.titel = titel;
    }

    String getVoornaam() {
        return voornaam;
    }

    String getFamilienaam() {
        return familienaam;
    }

    String getTitel() {
        return titel;
    }

    String maakBriefHoofding (AansprekingAlgoritme algoritme) {
        LocalDate vandaag = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        return new StringBuilder().append("Brussel, ")
                .append(formatter.format(vandaag))
                .append("\n").append(algoritme.getAanspreking(this))
                .append("\n").toString();
    }
}
