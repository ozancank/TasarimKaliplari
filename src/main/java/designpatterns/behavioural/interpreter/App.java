package main.java.designpatterns.behavioural.interpreter;

import main.java.designpatterns.behavioural.interpreter.yorumlayici.KargaDiliYorumlayici;
import main.java.designpatterns.behavioural.interpreter.yorumlayici.KusDiliYorumlayici;
import main.java.designpatterns.behavioural.interpreter.yorumlayici.Yorumlayici;

public class App {
    public static void main(String[] args) {
        String kusSozu = getKusSozu();
        String kargaSozu = getKargaSozu();

        yazdir(kusSozu, new KusDiliYorumlayici());
        yazdir(kargaSozu, new KargaDiliYorumlayici());
    }

    private static void yazdir(String kusSozu, Yorumlayici yorumlayici) {
        String turkce = yorumlayici.yorumla(kusSozu);
        System.out.println(turkce);
    }

    private static String getKusSozu() {
        return "Ozcoan Cacan Köcösecemecez";
    }

    private static String getKargaSozu() {
        return "Ozgoan Cagan Kögösegemegez";
    }
}
