package be.vdab.decorator.theorie;

abstract class KoffieDecorator implements Koffie{

    protected final Koffie gedecoreerdeKoffie;

    KoffieDecorator(Koffie gedecoreerdeKoffie) {
        this.gedecoreerdeKoffie = gedecoreerdeKoffie;
    }
}
