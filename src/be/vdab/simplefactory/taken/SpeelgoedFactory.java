package be.vdab.simplefactory.taken;

import java.math.BigDecimal;

enum SpeelgoedFactory {

    INSTANCE;
    Cadeau kiesCadeau(int leeftijd) {
        Cadeau cadeau;
        if (leeftijd >= 0 && leeftijd <= 5) {
            cadeau = new Pop(BigDecimal.TEN);
        } else if (leeftijd > 5 && leeftijd <= 12) {
            cadeau = new Gezelschapsspel(BigDecimal.valueOf(20.50));
        } else if (leeftijd > 12) {
             cadeau = new Boekenbon(BigDecimal.valueOf(15.50));
        } else {
            throw new IllegalArgumentException();
        }
        return cadeau;
    }
}
