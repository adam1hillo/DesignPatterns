package be.vdab.singleton.taken;

public enum Versnellingsbak {

    INSTANCE;

    private int versnelling;

     void hoger () {
        if (versnelling == 5) {
            throw new VerkeerdeVersnellingException("Verkeerde versnelling");
        }
        versnelling++;
        System.out.println("Versneling: " + versnelling);
    }
    void lager () {
        if (versnelling == -1) {
            throw new VerkeerdeVersnellingException("Verkeerde versnelling");
        }
        versnelling--;
        System.out.println("Versneling: " + versnelling);
    }
}
