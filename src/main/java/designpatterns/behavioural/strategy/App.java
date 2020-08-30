package main.java.designpatterns.behavioural.strategy;

public class App {
    public static void main(String[] args) {
        Ogrenci sayisalOgrencisi = new Ogrenci(EnumBolum.SAYISAL);
        Ogrenci sozelOgrencisi = new Ogrenci(EnumBolum.SOZEL);
        Ogrenci esitAgirlikOgrencisi = new Ogrenci(EnumBolum.ESITAGIRLIK);

        String oncelikSiralamasi = sayisalOgrencisi.getOncelikSiralamasi();
        System.out.println(oncelikSiralamasi);
        oncelikSiralamasi = sozelOgrencisi.getOncelikSiralamasi();
        System.out.println(oncelikSiralamasi);
        oncelikSiralamasi = esitAgirlikOgrencisi.getOncelikSiralamasi();
        System.out.println(oncelikSiralamasi);
    }
}
