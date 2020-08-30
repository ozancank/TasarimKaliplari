package main.java.designpatterns.behavioural.strategy;

public enum EnumBolum {
    SOZEL("Sözel"),
    ESITAGIRLIK("Eşit Ağırlık"),
    SAYISAL("Sayısal");

    private final String bolum;

    EnumBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return bolum;
    }
}
