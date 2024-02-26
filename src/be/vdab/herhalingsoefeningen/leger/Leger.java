package be.vdab.herhalingsoefeningen.leger;

import java.util.ArrayList;
import java.util.List;

class Leger implements StrijdBaar {

    private final List<Peloton> pelotons = new ArrayList<>();
    @Override
    public void trekTenStrijde() {
        System.out.println("Het leger trekt ten strijde met volgende pelotons:");
        pelotons.forEach(Peloton::trekTenStrijde);
    }

    public void add (Peloton peloton) {
        pelotons.add(peloton);
    }
    public void remove (Peloton peloton) {
        pelotons.remove(peloton);
    }
}
