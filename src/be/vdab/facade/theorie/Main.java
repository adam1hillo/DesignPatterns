package be.vdab.facade.theorie;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Persoon persoon = new Persoon(new Beroepsinkomsten(BigDecimal.valueOf(3000)), new Rekening());

        LeningVerstrekker verstrekker = new LeningVerstrekker();

        if (verstrekker.isLeningGoedgekeurd(persoon)) {
            System.out.println("Goedgekeurd");
        } else {
            System.out.println("Afgekeurd");
        }
    }
}
