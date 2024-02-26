package be.vdab.herhalingsoefeningen.brand;

import java.util.LinkedHashSet;
import java.util.Set;

class Brand {

    private final Set<Observer> observers = new LinkedHashSet<>();

    void addObserver (Observer observer) {
        observers.add(observer);
    }

    void removeObserver (Observer observer) {
        observers.remove(observer);
    }

    void breekUit() {
        notifyObservers();
    }
    void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }
}
