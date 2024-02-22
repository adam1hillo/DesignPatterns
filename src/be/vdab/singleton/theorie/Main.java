package be.vdab.singleton.theorie;

public class Main {
    public static void main(String[] args) {

        Motor.INSTANCE.start();

    }
    private static void stopDeAuto() {
        Motor.INSTANCE.stop();
    }
}
