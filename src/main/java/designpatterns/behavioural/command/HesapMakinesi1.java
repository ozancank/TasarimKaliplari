package main.java.designpatterns.behavioural.command;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HesapMakinesi1 {
    public static BigDecimal islem(IslemTuru islemTuru, BigDecimal sayi1, BigDecimal sayi2) {
        BigDecimal sonuc = BigDecimal.ZERO;

        if (IslemTuru.TOPLAMA.equals(islemTuru)) {
            sonuc = sayi1.add(sayi2);
        } else if (IslemTuru.CIKARMA.equals((islemTuru))) {
            sonuc = sayi1.subtract(sayi2);
        } else if (IslemTuru.CARPMA.equals((islemTuru))) {
            sonuc = sayi1.multiply(sayi2);
        } else if (IslemTuru.BOLME.equals((islemTuru))) {
            sonuc = sayi1.divide(sayi2, 2, RoundingMode.DOWN);
        } else if (IslemTuru.UST.equals((islemTuru))) {
            sonuc = sayi1.pow(sayi2.intValue());
        } else if (IslemTuru.MOD.equals((islemTuru))) {
            sonuc = sayi1.remainder(sayi2);
        }

        return sonuc;
    }
}
