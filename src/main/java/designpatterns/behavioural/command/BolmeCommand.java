package main.java.designpatterns.behavioural.command;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BolmeCommand implements Islem {
    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.divide(sayi2, 0, RoundingMode.DOWN);
    }
}
