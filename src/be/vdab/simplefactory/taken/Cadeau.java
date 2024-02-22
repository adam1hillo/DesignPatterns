package be.vdab.simplefactory.taken;

import java.math.BigDecimal;

abstract class Cadeau {

    private BigDecimal prijs;

    Cadeau(BigDecimal prijs) {
        this.prijs = prijs;
    }

    void print() {
        System.out.println("Cadeau is " + this.getClass().getSimpleName().toLowerCase() + ", prijs: " + prijs);
    }
}
