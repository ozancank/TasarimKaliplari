package main.java.designpatterns.behavioural.state;

public class Oyun {
    private Konsol konsol;

    public Oyun() {
        System.out.println("Oyun başladı.");
        konsol = new Hucum();
    }

    public void ucgen() {
        konsol.ucgenBas();
    }

    public void kare() {
        konsol.kareBas();
    }

    public void yuvarlak() {
        konsol.yuvarlakBas();
    }

    public void x() {
        konsol.xBas();
    }

    public void topuKap() {
        System.out.println("Top kapıldı. Hücuma çıkılıyor.");
        konsol = new Hucum();
    }

    public void topuKaptir() {
        System.out.println("Top kaptırıldı. Defansa geçiliyor.");
        konsol = new Defans();
    }
}
