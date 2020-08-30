package main.java.designpatterns.behavioural.mediator;

import java.math.BigDecimal;

public abstract class Uretici {
    private final String adi;
    private final EnumUrun urun;
    private final BigDecimal fiyat;

    private final Araci araci;

    public Uretici(String adi, EnumUrun urun, BigDecimal fiyat, Araci araci) {
        this.adi = adi;
        this.urun = urun;
        this.fiyat = fiyat;
        this.araci = araci;
    }

    public void urunSat() {
        araci.ureticidenAl(this);
    }

    public String getAdi() {
        return adi;
    }

    public EnumUrun getUrun() {
        return urun;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }
}
