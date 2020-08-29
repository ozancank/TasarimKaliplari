package main.java.designpatterns.behavioural.command;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal toplam = HesapMakinesi1.islem(IslemTuru.TOPLAMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal fark = HesapMakinesi1.islem(IslemTuru.CIKARMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal carp = HesapMakinesi1.islem(IslemTuru.CARPMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal bol = HesapMakinesi1.islem(IslemTuru.BOLME, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal ust = HesapMakinesi1.islem(IslemTuru.UST, BigDecimal.TEN, BigDecimal.valueOf(2));
        BigDecimal mod = HesapMakinesi1.islem(IslemTuru.MOD, BigDecimal.TEN, BigDecimal.valueOf(3));

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpma: " + carp);
        System.out.println("Bölme: " + bol);
        System.out.println("Üst: " + ust);
        System.out.println("Mod: " + mod);
    }
}
