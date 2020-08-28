package main.java.designpatterns.structural.proxy;

import java.math.BigDecimal;

public class GercekYonetici implements SirketBilgileri {
    @Override
    public BigDecimal getCiro() {
        return BigDecimal.valueOf(10000);
    }
}
