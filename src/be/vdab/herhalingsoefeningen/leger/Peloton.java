package be.vdab.herhalingsoefeningen.leger;

import java.util.ArrayList;
import java.util.List;

class Peloton implements StrijdBaar {

    private final int nummer;
    private final List<Soldaat> soldaten = new ArrayList<>();

    public Peloton(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\tHet peloton " + nummer + " trekt ten strijde met volgende soldaten:");
        soldaten.forEach(Soldaat::trekTenStrijde);
    }

    public void add (Soldaat soldaat) {
        soldaten.add(soldaat);
    }
    public void remove (Soldaat soldaat) {
        soldaten.remove(soldaat);
    }
}
