package be.vdab.herhalingsoefeningen.kerstboom;

class MetLichtjes extends KerstboomDecorator{
    MetLichtjes(Kerstboom gedecoreerdeKerstboom) {
        super(gedecoreerdeKerstboom);
    }

    @Override
    public String informatie() {
        return gedecoreerdeKerstboom.informatie() + ", met lichtjes";
    }
}
