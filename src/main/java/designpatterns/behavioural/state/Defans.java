package main.java.designpatterns.behavioural.state;

public class Defans implements Konsol {
    @Override
    public void kareBas() {
        System.out.println("Müdahale ediliyor.");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Kaleci açılıyor.");
    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Kayarak müdahale ediliyor.");
    }

    @Override
    public void xBas() {
        System.out.println("Markaj Uygulanıyor.");
    }
}
