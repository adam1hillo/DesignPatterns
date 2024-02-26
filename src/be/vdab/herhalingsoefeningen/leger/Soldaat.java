package be.vdab.herhalingsoefeningen.leger;

class Soldaat implements StrijdBaar {

    private final String voornaam;

    public Soldaat(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\t\tSoldaat " + voornaam + " trekt ten strijde.");
    }
}
