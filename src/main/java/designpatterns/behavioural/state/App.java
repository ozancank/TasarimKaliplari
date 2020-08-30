package main.java.designpatterns.behavioural.state;

public class App {
    public static void main(String[] args) {
        Oyun oyun = new Oyun();

        oyun.x();
        oyun.ucgen();
        oyun.kare();
        oyun.topuKaptir();

        oyun.x();
        oyun.kare();
        oyun.topuKap();
    }
}
