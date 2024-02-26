package be.vdab.composite.theorie;

public class Main {
    public static void main(String[] args) {

        var tekening = new Tekening();
        tekening.add(new Rechthoek(2,1));
        tekening.add(new Cirkel(3));
        var subTekening = new Tekening();
        subTekening.add(new Rechthoek(3,2));
        subTekening.add(new Cirkel(4));
        tekening.add(subTekening);
        System.out.println(tekening.getOppervlakte());
    }
}
