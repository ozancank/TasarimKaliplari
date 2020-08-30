package main.java.designpatterns.behavioural.memento;

public class NotePadMemento {
    private final String metin;

    public NotePadMemento() {
        metin = "";
    }

    public NotePadMemento(String metin) {
        this.metin = metin;
    }

    public String getMetin() {
        return metin;
    }
}
