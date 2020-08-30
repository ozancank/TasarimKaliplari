package main.java.designpatterns.behavioural.visitor;

import main.java.designpatterns.behavioural.visitor.islemler.*;
import main.java.designpatterns.behavioural.visitor.saglikbakanligi.*;

public class App {
    public static void main(String[] args) {
        Hasta ahmet = new Hasta("Ahmet", EnumHastalik.COVID, EnumHastaDurumu.AGIR_HASTA);
        Hasta mehmet = new Hasta("Mehmet", EnumHastalik.COVID, EnumHastaDurumu.ZATURRE);
        Hasta fatma = new Hasta("Fatma", EnumHastalik.COVID, EnumHastaDurumu.OLUM);
        Hasta nese = new Hasta("Neşe", EnumHastalik.COVID, EnumHastaDurumu.IYILESTI);

        Hastane capa = new Hastane("Çapa");
        capa.hastaEkle(ahmet);
        capa.hastaEkle(mehmet);
        capa.hastaEkle(fatma);
        capa.hastaEkle(nese);

        Il istanbul = new Il("İstanbul");
        istanbul.hastaneEkle(capa);

        Ulke turkiye = new Ulke("Türkiye");
        turkiye.ilEkle(istanbul);

        raporUlke(turkiye);
    }

    private static void raporUlke(Ulke ulke) {
        CovidHastaSayisiVisitor hastaSayisiVisitor = new CovidHastaSayisiVisitor();
        String hastaSayisi = hastaSayisiVisitor.visitUlke(ulke);

        CovidOlumSayisiVisitor olumSayisiVisitor = new CovidOlumSayisiVisitor();
        String olumSayisi = olumSayisiVisitor.visitUlke(ulke);

        CovidZaturreSayisiVisitor zaturreSayisiVisitor = new CovidZaturreSayisiVisitor();
        String zaturreSayisi = zaturreSayisiVisitor.visitUlke(ulke);

        CovidAgirHastaSayisiVisitor agirHastaSayisiVisitor = new CovidAgirHastaSayisiVisitor();
        String agirHastaSayisi = agirHastaSayisiVisitor.visitUlke(ulke);

        CovidIyilestiSayisiVisitor iyilestiSayisiVisitor = new CovidIyilestiSayisiVisitor();
        String iyilesenHastaSayisi = iyilestiSayisiVisitor.visitUlke(ulke);

        System.out.println("Hasta Sayısı: " + hastaSayisi);
        System.out.println("Ölüm Sayısı: " + olumSayisi);
        System.out.println("Zatürre Sayısı: " + zaturreSayisi);
        System.out.println("Ağır Hasta Sayısı: " + agirHastaSayisi);
        System.out.println("İyileşen Hasta Sayısı: " + iyilesenHastaSayisi);
    }
}
