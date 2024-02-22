package be.vdab.singleton.taken;

public class Main {
    public static void main(String[] args) {

        System.out.println(
                Magic8Ball.INSTANCE.getAntwoord("Win ik morgen de lotto ?"));
        System.out.println(
                Magic8Ball.INSTANCE.getAntwoord("Zal het morgen regenen ?"));

    }
}
