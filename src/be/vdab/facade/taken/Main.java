package be.vdab.facade.taken;

public class Main {
    public static void main(String[] args) {

        Stereoketen stereoketen = new Stereoketen();
        stereoketen.start();
        stereoketen.startRadio();
        stereoketen.startCDspeler();
        stereoketen.startRadio();
        stereoketen.stop();
    }
}
