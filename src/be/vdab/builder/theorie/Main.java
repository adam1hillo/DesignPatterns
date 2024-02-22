package be.vdab.builder.theorie;

class Main {

    public static void main(String[] args) {

        var builder = new Inwoner.InwonerBuilder();
        Inwoner inwoner = builder.metVoornaam("Olivier")
                                .metFamilienaam("Gerard")
                                .metAantalKinderen(1)
                                .maakInwoner();
        System.out.println(inwoner);

    }
}
