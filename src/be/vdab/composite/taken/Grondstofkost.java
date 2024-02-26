package be.vdab.composite.taken;

import java.math.BigDecimal;

class Grondstofkost implements Kost{

    private BigDecimal eenheidsprijs;
    private int hoeveelheid;

    Grondstofkost(BigDecimal eenheidsprijs, int hoeveelheid) {
        this.eenheidsprijs = eenheidsprijs;
        this.hoeveelheid = hoeveelheid;
    }

    @Override
    public BigDecimal getBedrag() {
        return eenheidsprijs.multiply(BigDecimal.valueOf(hoeveelheid));
    }
}
