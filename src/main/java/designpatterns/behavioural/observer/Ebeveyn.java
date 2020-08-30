package main.java.designpatterns.behavioural.observer;

public class Ebeveyn implements Observer {
    private final String adi;

    public Ebeveyn(String adi) {
        this.adi = adi;
    }

    @Override
    public void update(Observable observable) {
        Termometre termometre = (Termometre) observable;
        System.out.println(adi + " dedi ki: ooo sıcaklık: " + termometre.getAnlikSicaklik() + " derece olmuş!");
    }
}
