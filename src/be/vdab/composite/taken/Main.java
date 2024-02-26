package be.vdab.composite.taken;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        var project = new Project();
        project.addKost(new Grondstofkost(BigDecimal.valueOf(10), 10));
        project.addKost(new Arbeidskost(BigDecimal.valueOf(15), 10));
        var subproject2 = new Project();
        subproject2.addKost(new Grondstofkost(BigDecimal.valueOf(100), 2));
        subproject2.addKost(new Arbeidskost(BigDecimal.valueOf(15), 20));
        project.addKost(subproject2);
        System.out.println(subproject2.getBedrag());
        System.out.println(project.getBedrag());
    }
}
