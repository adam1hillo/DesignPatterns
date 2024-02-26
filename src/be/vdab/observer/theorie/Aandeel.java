package be.vdab.observer.theorie;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

class Aandeel {
    private final String code;
    private BigDecimal koers;
    private final Set<Observer> observers = new LinkedHashSet<>();

    Aandeel(String code) {
        this.code = code;
    }

    void addObserver (Observer observer) {
        observers.add(observer);
    }

    void removeObserver (Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers () {
        observers.forEach(observer -> observer.update(this));
    }

    void setKoers (BigDecimal nieuweKoers) {
        this.koers = nieuweKoers;
        notifyObservers();
    }

    String getCode() {
        return code;
    }

    BigDecimal getKoers() {
        return koers;
    }
}
