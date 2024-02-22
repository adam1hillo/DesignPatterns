package be.vdab.facade.taken;

class Stereoketen {
    private Versterker versterker;
    private Equalizer equalizer;
    private Radio radio;
    private CDspeler cdspeler;
    private Geluidsbron huidigeGeluidsbron;

    Stereoketen() {
        versterker = new Versterker();
        equalizer = new Equalizer();
        radio = new Radio();
        cdspeler = new CDspeler();
    }

    void start() {
        versterker.start();
        equalizer.start();
    }

    void stop() {
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
        }
        versterker.stop();
        equalizer.stop();

    }
    void startRadio() {
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
        }
        radio.start();
        huidigeGeluidsbron = radio;
    }
    void startCDspeler() {
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
        }
        cdspeler.start();
        huidigeGeluidsbron = cdspeler;
    }
}
