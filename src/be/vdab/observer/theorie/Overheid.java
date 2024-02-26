package be.vdab.observer.theorie;

public class Overheid implements Observer{
    @Override
    public void update(Aandeel aandeel) {
        System.out.println("De overheid registreert de nieuwe koers van " + aandeel.getCode() + " : " + aandeel.getKoers());
    }
}
