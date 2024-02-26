package be.vdab.observer.taken;

import java.util.LinkedHashSet;
import java.util.Set;

public class FotokopieMachine {
    private final static int ONDERHOUD_OM_DE_PAGINAS = 10000;
    private final String serienummer;
    private final Set<Observer> observers = new LinkedHashSet<>();
    private int aantalKopiesSindsLaatsteOnderhoud;

    FotokopieMachine(String serienummer) {
        this.serienummer = serienummer;
    }

    void aadObserver (Observer observer) {
        observers.add(observer);
    }

    void removeObserver (Observer observer) {
        observers.remove(observer);
    }
    void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }
    void kopieer(int paginas) {
        System.out.println(paginas + " fotokopie(s)");
        aantalKopiesSindsLaatsteOnderhoud += paginas;
        if (aantalKopiesSindsLaatsteOnderhoud >= ONDERHOUD_OM_DE_PAGINAS) {
            notifyObservers();
        }

    }
    String getSerienummer() {
        return serienummer;
    }

    void doeOnderhoud() {
        aantalKopiesSindsLaatsteOnderhoud = 0;
    }
}
