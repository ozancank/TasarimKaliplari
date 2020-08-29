package main.java.designpatterns.behavioural.command;

import java.math.BigDecimal;

public class CarpmaCommand implements Islem {
    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.multiply(sayi2);
    }
}
