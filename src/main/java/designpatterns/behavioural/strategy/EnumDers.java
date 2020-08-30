package main.java.designpatterns.behavioural.strategy;

public enum EnumDers {
    TURKCE("Türkçe"),
    MATEMATIK("Matematik"),
    FEN("Fen"),
    SOSYAL("Sosyal");

    private final String ders;

    EnumDers(String ders) {
        this.ders = ders;
    }

    @Override
    public String toString() {
        return ders;
    }
}
