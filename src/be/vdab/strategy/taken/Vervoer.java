package be.vdab.strategy.taken;

public class Vervoer {

    private Vervoermiddel vervoermiddel;

    public void setVervoermiddel(Vervoermiddel vervoermiddel) {
        this.vervoermiddel = vervoermiddel;
    }

    void doeEenOversteek () {
        System.out.println("Inpakken");
        vervoermiddel.vervoer();
        System.out.println("Uitpakken");
    }
}
