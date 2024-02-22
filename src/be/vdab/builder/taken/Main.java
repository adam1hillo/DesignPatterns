package be.vdab.builder.taken;

public class Main {
    public static void main(String[] args) {

        var builder = new Coordinaat.CoordinaatBuilder();
        Coordinaat coordinaat = builder.metX(5).metY(1).metZ(3).maakCoordinaat();
        Coordinaat coordinaat2 = builder.metX(10).metY(20).metZ(30).maakCoordinaat();
        System.out.println(coordinaat);
        System.out.println(coordinaat2);
        System.out.println(coordinaat);

    }
}
