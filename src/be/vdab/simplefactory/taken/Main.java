package be.vdab.simplefactory.taken;

public class Main {

    public static void main(String[] args) {


        Cadeau cadeau1 = SpeelgoedFactory.INSTANCE.kiesCadeau(4);
        cadeau1.print();
        Cadeau cadeau2 = SpeelgoedFactory.INSTANCE.kiesCadeau(8);
        cadeau2.print();
        Cadeau cadeau3 = SpeelgoedFactory.INSTANCE.kiesCadeau(16);
        cadeau3.print();
        Cadeau cadeau4 = SpeelgoedFactory.INSTANCE.kiesCadeau(-5);
    }
}
