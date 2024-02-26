package be.vdab.decorator.taken;

class MetBarbecue extends ArrangementDecorator{
    MetBarbecue(Arrangement gedecoreerdeArangement) {
        super(gedecoreerdeArangement);
    }

    @Override
    public String getTaak() {
        return gedecoreerdeArangement.getTaak() + ", plaats een barbecue bij de bungalow";
    }
}
