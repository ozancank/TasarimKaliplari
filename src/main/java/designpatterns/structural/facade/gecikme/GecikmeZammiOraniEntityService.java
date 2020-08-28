package main.java.designpatterns.structural.facade.gecikme;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GecikmeZammiOraniEntityService {
    public BigDecimal getGecikmeZammiOran() {
        BigDecimal oran = new BigDecimal("0.0016");

        oran.divide(new BigDecimal(100),4, RoundingMode.HALF_DOWN);

        return oran;
    }
}
