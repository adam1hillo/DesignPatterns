package be.vdab.herhalingsoefeningen.kerstboom;

public class Main {
    public static void main(String[] args) {

        var kerstboom = new MetLichtjes(new MetBallen(new MetSlingers(new BasisKerstboom())));
        System.out.println(kerstboom.informatie());
    }
}
