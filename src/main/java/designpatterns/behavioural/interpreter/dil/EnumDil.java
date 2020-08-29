package main.java.designpatterns.behavioural.interpreter.dil;

public enum EnumDil {
    KUS("Kuş", "ca"),
    KARGA("Karga", "ga");

    private final String isim;
    private final String ek;

    EnumDil(String isim, String ek) {
        this.isim = isim;
        this.ek = ek;
    }

    public String getIsim() {
        return isim;
    }

    public String getEk() {
        return ek;
    }
}
