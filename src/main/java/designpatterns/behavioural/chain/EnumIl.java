package main.java.designpatterns.behavioural.chain;

public enum EnumIl {
    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    CANKIRI("Çankırı"),
    KARS("Kars");

    private String il;

    EnumIl(String il) {
        this.il = il;
    }

    @Override
    public String toString() {
        return il;
    }

    public String getIl() {
        return il;
    }
}
