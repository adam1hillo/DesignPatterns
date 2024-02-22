package be.vdab.simplefactory.theorie;

public class Presentatie extends Document{

    public Presentatie(String bestandsnaam) {
        super(bestandsnaam);
    }

    @Override
    void print() {
        System.out.println("een afdruk van een presentatie");
    }

    @Override
    void printPreview() {
        System.out.println("een afdrukvoorbeeld van een presentatie");
    }
}
