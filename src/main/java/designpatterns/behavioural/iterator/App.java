package main.java.designpatterns.behavioural.iterator;

import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Matematik");
//        List<Soru> soruList = kitap.getSoruList();
//        yazdir(soruList);
        Fasikul fasikul = new Fasikul("Turkce");
//        Soru[] sorular=fasikul.getSorular();
//        yazdir(sorular);

        Iterator soruIteratorKitap = kitap.getSoruIterator();
        Iterator soruIteratorFasikul = fasikul.getSoruIterator();

        yazdir(soruIteratorKitap);
        yazdir(soruIteratorFasikul);


    }

    private static void yazdir(Iterator soruIteratorKitap) {
        while (soruIteratorKitap.hasNext()) {
            Soru soru = (Soru) soruIteratorKitap.next();

            Long soruNo = soru.getSoruNo();

            System.out.println("Soru No: " + soruNo);
        }
    }

//    private static void yazdir(Soru[] sorular) {
//        for (Soru soru: sorular){
//            Long soruNo=soru.getSoruNo();
//            System.out.println("Soru No: "+soruNo);
//        }
//    }
//
//    private static void yazdir(List<Soru> soruList) {
//        for (Soru soru : soruList) {
//            Long soruNo = soru.getSoruNo();
//
//            System.out.println("Soru No: " + soruNo);
//        }
//    }
}
