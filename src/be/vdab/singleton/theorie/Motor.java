
package be.vdab.singleton.theorie;

public enum Motor {
    INSTANCE;
    private boolean gestart;

    void start() {
        gestart = true;
        System.out.println("gestart");
    }
    void stop() {
        if(gestart) {
            gestart = false;
            System.out.println("gestopt");
        }
    }
}
