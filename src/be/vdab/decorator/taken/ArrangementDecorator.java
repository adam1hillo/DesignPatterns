package be.vdab.decorator.taken;

abstract class ArrangementDecorator implements Arrangement{

    protected final Arrangement gedecoreerdeArangement;

    ArrangementDecorator(Arrangement gedecoreerdeArangement) {
        this.gedecoreerdeArangement = gedecoreerdeArangement;
    }
}
