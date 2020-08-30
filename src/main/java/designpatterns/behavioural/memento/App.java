package main.java.designpatterns.behavioural.memento;

public class App {
    public static void main(String[] args) {
        Hafiza hafiza = new Hafiza();

        NotePad notePad = new NotePad();
        notePad.ekle("O");
        notePad.ekle("Z");
        notePad.ekle("A");
        notePad.ekle("N");

        versiyonKaydet(hafiza, notePad);

        notePad.ekle(" CAN");

        versiyonKaydet(hafiza, notePad);

        hataliNoktaKoy(notePad, ".");

        geriAl(hafiza, notePad);

        versiyonKaydet(hafiza, notePad);

        notePad.ekle(" KÖSEMEZ");

        versiyonKaydet(hafiza, notePad);

        hataliNoktaKoy(notePad, ".");

        geriAl(hafiza, notePad);
        geriAl(hafiza, notePad);
        geriAl(hafiza, notePad);

    }

    private static void geriAl(Hafiza hafiza, NotePad notePad) {
        notePad.geriDon(hafiza.sonVersiyonuGetir());
        notePad.yazdir();
    }

    private static void hataliNoktaKoy(NotePad notePad, String s) {
        notePad.ekle(s);
        notePad.yazdir();
    }

    private static void versiyonKaydet(Hafiza hafiza, NotePad notePad) {
        NotePadMemento ozan_can = notePad.kaydet();
        hafiza.ekle(ozan_can);
        notePad.yazdir();
    }
}
