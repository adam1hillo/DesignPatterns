package be.vdab.strategy.taken;

public class Main {
    public static void main(String[] args) {
        var vervoer = new Vervoer();
        vervoer.setVervoermiddel(new Motorboot());
        vervoer.doeEenOversteek();
        System.out.println();
        vervoer.setVervoermiddel(new Schaatsen());
        vervoer.doeEenOversteek();
        System.out.println();
        vervoer.setVervoermiddel(new Zeilboot());
        vervoer.doeEenOversteek();


    }
}
