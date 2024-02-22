package be.vdab.facade.theorie;

import java.math.BigDecimal;

class Beroepsinkomsten {

    private BigDecimal maandWedde;

    Beroepsinkomsten(BigDecimal maandWedde) {
        this.maandWedde = maandWedde;
    }

    BigDecimal getMaandWedde() {
        return maandWedde;
    }
}
