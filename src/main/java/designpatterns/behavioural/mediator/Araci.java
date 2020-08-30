package main.java.designpatterns.behavioural.mediator;

public interface Araci {
    void ureticiEkle(Uretici uretici);

    void halciEkle(Halci halci);

    void ureticidenAl(Uretici uretici);

    void haleSat(Halci halci);
}
