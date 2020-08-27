package main.java.designpatterns.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class RaporUtil {
    public static String getCizgiliMetin(String metin) {
        String[] satirList = metin.split("\n");

        StringBuilder cizgiliMetin = new StringBuilder();
        for (String eachSatir : satirList) {
            String cizgiliSatir = herSatiraBirCizgiEkle(eachSatir);
            cizgiliMetin.append(cizgiliSatir);
        }

        return cizgiliMetin.toString();
    }

    private static String herSatiraBirCizgiEkle(String eachSatir) {
        String yeniSatir;

        if (eachSatir.trim().length() == 0) {
            yeniSatir = "\n";
        } else {
            yeniSatir = "\n- " + eachSatir;
        }

        return yeniSatir;
    }

    public static String metniSigdir(String metin, int genislik) {
        String kucukSatirliMetin = "";

        String[] satirListesi = metin.split("\n");

        for (String eachSatir : satirListesi) {
            if (eachSatir.length() <= genislik) {
                //aynen ekle
                kucukSatirliMetin = ekleVeYeniSatiraGec(kucukSatirliMetin, eachSatir);
            } else {
                //küçült ve ekle
                List<String> parcalanmisList = parcala(eachSatir, genislik);

                for (String eachYeniSatir : parcalanmisList) {
                    kucukSatirliMetin = ekleVeYeniSatiraGec(kucukSatirliMetin, eachYeniSatir);
                }
            }
        }

        return kucukSatirliMetin;
    }

    private static String ekleVeYeniSatiraGec(String anaMetin, String eklenenMetin) {
        return anaMetin + eklenenMetin + "\n";
    }

    private static List<String> parcala(String eachSatir, int genislik) {

        List<String> parcaliSatirList = new ArrayList<>();

        for (int i = 0; i < eachSatir.length() / 30; i++) {
            int ilkHane = genislik * i;
            int sonHane = ilkHane + genislik;

            if (sonHane > eachSatir.length()) {
                sonHane = eachSatir.length();
            }

            String parcaliSatir = eachSatir.substring(ilkHane, sonHane);

            if (parcaliSatir.trim().length() > 0) {
                parcaliSatirList.add(parcaliSatir);
            }
        }
        return parcaliSatirList;
    }

    public static String sonaImzaliMetinEkle(String metin) {
        String imza = "\n\n + \t\t\t\t\t\t imza: ";
        return metin + imza;
    }
}
