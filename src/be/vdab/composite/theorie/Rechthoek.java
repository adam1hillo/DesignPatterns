package be.vdab.composite.theorie;

public class Rechthoek implements Figuur{

    private final double lengte;
    private final double breedte;

    Rechthoek(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    @Override
    public double getOppervlakte() {
        return lengte * breedte;
    }
}
