package be.vdab.herhalingsoefeningen.brand;

class Brandweerman implements Observer{

    private final int badgeNummer;

    public Brandweerman(int badgeNummer) {
        this.badgeNummer = badgeNummer;
    }

    @Override
    public void update(Brand brand) {
        System.out.println("Brandweerman met badge nummer " + badgeNummer + " werd geinformeerd en is op zijn weg");
    }
}
