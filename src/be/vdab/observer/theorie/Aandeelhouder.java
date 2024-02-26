package be.vdab.observer.theorie;

class Aandeelhouder implements Observer{

    private final String voornaam;

    Aandeelhouder(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public void update(Aandeel aandeel) {
        System.out.println(voornaam + " koopt of verkoopt " + aandeel.getCode() + " met koers " + aandeel.getKoers());
    }
}
