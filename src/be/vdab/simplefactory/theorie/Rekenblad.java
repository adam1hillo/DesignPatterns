package be.vdab.simplefactory.theorie;

class Rekenblad extends Document{

    Rekenblad(String bestandsnaam) {
        super(bestandsnaam);
    }

    @Override
    void print() {
        System.out.println("een afdruk van een rekenblad");
    }

    @Override
    void printPreview() {
        System.out.println("een afdrukvoorbeeld van een rekenblad");
    }
}
