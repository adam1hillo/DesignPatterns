package be.vdab.observer.taken;

class Technieker implements Observer{

    private final int personeelsnummer;

    Technieker(int personeelsnummer) {
        this.personeelsnummer = personeelsnummer;
    }

    @Override
    public void update(FotokopieMachine fotokopieMachine) {
        System.out.println("Techniker nr: " + personeelsnummer + " noteert onderhoud voor machine " + fotokopieMachine.getSerienummer());
    }
}
