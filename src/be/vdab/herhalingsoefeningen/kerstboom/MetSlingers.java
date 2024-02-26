package be.vdab.herhalingsoefeningen.kerstboom;

class MetSlingers extends KerstboomDecorator{
    MetSlingers(Kerstboom gedecoreerdeKerstboom) {
        super(gedecoreerdeKerstboom);
    }

    @Override
    public String informatie() {
        return gedecoreerdeKerstboom.informatie() + ", met slingers";
    }
}
