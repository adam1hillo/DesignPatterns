package be.vdab.observer.theorie;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        var aandeel = new Aandeel("ORCL");
        var larry = new Aandeelhouder("Larry");
        var james = new Aandeelhouder("James");
        var overheid = new Overheid();
        aandeel.addObserver(larry);
        aandeel.addObserver(james);
        aandeel.addObserver(overheid);
        aandeel.setKoers(BigDecimal.valueOf(39));
        System.out.println();
        aandeel.removeObserver(james);
        aandeel.setKoers(BigDecimal.valueOf(40));
    }
}
