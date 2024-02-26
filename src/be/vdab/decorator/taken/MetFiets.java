package be.vdab.decorator.taken;

class MetFiets extends ArrangementDecorator{
    MetFiets(Arrangement gedecoreerdeArangement) {
        super(gedecoreerdeArangement);
    }

    @Override
    public String getTaak() {
        return gedecoreerdeArangement.getTaak() + ", plaats fietsen bij de bungalow";
    }

    public void printAlso() {
        System.out.println("adasd");
    }
}
