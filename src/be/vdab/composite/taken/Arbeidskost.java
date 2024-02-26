package be.vdab.composite.taken;

import java.math.BigDecimal;

class Arbeidskost implements Kost{

    private BigDecimal uurloon;
    private int aantalUren;

    Arbeidskost(BigDecimal uurloon, int aantalUren) {
        this.uurloon = uurloon;
        this.aantalUren = aantalUren;
    }

    @Override
    public BigDecimal getBedrag() {
        return uurloon.multiply(BigDecimal.valueOf(aantalUren));
    }
}
