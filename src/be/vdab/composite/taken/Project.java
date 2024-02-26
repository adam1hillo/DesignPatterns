package be.vdab.composite.taken;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Project implements Kost{

    private final List<Kost> kosten = new ArrayList<>();

    void addKost(Kost kost) {
        kosten.add(kost);
    }
    @Override
    public BigDecimal getBedrag() {
        return kosten.stream()
                .map(Kost::getBedrag)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

    }
}
