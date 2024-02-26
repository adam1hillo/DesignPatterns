package be.vdab.herhalingsoefeningen.leger;

public class Main {
    public static void main(String[] args) {

        Soldaat soldaat1 = new Soldaat("Jan");
        Soldaat soldaat2 = new Soldaat("Mieke");
        Soldaat soldaat3 = new Soldaat("Piet");
        Soldaat soldaat4 = new Soldaat("Fatima");
        Peloton peloton1 = new Peloton(123);
        Peloton peloton2 = new Peloton(456);
        peloton1.add(soldaat1);
        peloton1.add(soldaat2);
        peloton2.add(soldaat3);
        peloton2.add(soldaat4);
        Leger leger = new Leger();
        leger.add(peloton1);
        leger.add(peloton2);
        leger.trekTenStrijde();
    }
}
