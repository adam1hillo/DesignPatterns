package be.vdab.herhalingsoefeningen.brand;

class Bewoner implements Observer{

    private final String voornaam;

    public Bewoner(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public void update(Brand brand) {
        System.out.println("Bewoner " + voornaam + " werd geinformeerd en heeft weg gevluchten");
    }
}
