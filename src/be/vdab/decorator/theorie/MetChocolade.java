package be.vdab.decorator.theorie;

import java.math.BigDecimal;

class MetChocolade extends KoffieDecorator{
    MetChocolade(Koffie gedecoreerdeKoffie) {
        super(gedecoreerdeKoffie);
    }

    @Override
    public BigDecimal getKost() {
        return gedecoreerdeKoffie.getKost().add(BigDecimal.valueOf(2));
    }

    @Override
    public String getBereidignswijze() {
        return gedecoreerdeKoffie.getBereidignswijze() + ", schilfer de chocolade, voeg de schilfers toe";
    }
}
