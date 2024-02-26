package be.vdab.decorator.theorie;

import java.math.BigDecimal;

class MetMelk extends KoffieDecorator{


    MetMelk(Koffie gedecoreerdeKoffie) {
        super(gedecoreerdeKoffie);
    }

    @Override
    public BigDecimal getKost() {
        return gedecoreerdeKoffie.getKost().add(BigDecimal.ONE);
    }

    @Override
    public String getBereidignswijze() {
        return gedecoreerdeKoffie.getBereidignswijze() + ", warm de melk op, voeg de melk toe";
    }
}
