package be.vdab.herhalingsoefeningen.kerstboom;

abstract class KerstboomDecorator implements Kerstboom{

    protected final Kerstboom gedecoreerdeKerstboom;

    KerstboomDecorator(Kerstboom gedecoreerdeKerstboom) {
        this.gedecoreerdeKerstboom = gedecoreerdeKerstboom;
    }

}
