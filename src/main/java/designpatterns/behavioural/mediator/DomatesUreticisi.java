package main.java.designpatterns.behavioural.mediator;

import java.math.BigDecimal;

public class DomatesUreticisi extends Uretici {
    public DomatesUreticisi(String adi, BigDecimal fiyat, Araci araci) {
        super(adi, EnumUrun.DOMATES, fiyat, araci);
    }
}
