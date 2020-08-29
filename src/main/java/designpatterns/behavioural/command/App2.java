package main.java.designpatterns.behavioural.command;

import java.math.BigDecimal;

public class App2 {
    public static void main(String[] args) {
        BigDecimal sayi1 = BigDecimal.TEN;
        BigDecimal sayi2 = BigDecimal.valueOf(2);

        BigDecimal toplam = HesapMakinesi2.islem(new ToplamaCommand(), sayi1, sayi2);
        BigDecimal fark = HesapMakinesi2.islem(new CikarmaCommand(), sayi1, sayi2);
        BigDecimal carp = HesapMakinesi2.islem(new CarpmaCommand(), sayi1, sayi2);
        BigDecimal bol = HesapMakinesi2.islem(new BolmeCommand(), sayi1, sayi2);
        BigDecimal ust = HesapMakinesi2.islem(new UstCommand(), sayi1, sayi2);
        BigDecimal mod = HesapMakinesi2.islem(new ModCommand(), sayi1, sayi2);

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpma: " + carp);
        System.out.println("Bölme: " + bol);
        System.out.println("Üst: " + ust);
        System.out.println("Mod: " + mod);
    }
}
