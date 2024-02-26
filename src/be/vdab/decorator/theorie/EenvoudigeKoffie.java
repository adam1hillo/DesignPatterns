package be.vdab.decorator.theorie;

import java.math.BigDecimal;

class EenvoudigeKoffie implements Koffie{


    @Override
    public BigDecimal getKost() {
        return BigDecimal.valueOf(3);
    }

    @Override
    public String getBereidignswijze() {
        return "maal de koffiebnnen, laat kokend water over het poeder lopen";
    }
}
