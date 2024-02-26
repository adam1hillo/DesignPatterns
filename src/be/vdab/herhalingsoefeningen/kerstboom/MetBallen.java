package be.vdab.herhalingsoefeningen.kerstboom;

class MetBallen extends KerstboomDecorator{
    MetBallen(Kerstboom kerstboom) {
        super(kerstboom);
    }

    @Override
    public String informatie() {
        return gedecoreerdeKerstboom.informatie() + ", met ballen";
    }
}
