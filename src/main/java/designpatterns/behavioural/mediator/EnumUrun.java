package main.java.designpatterns.behavioural.mediator;

public enum EnumUrun {
    DOMATES("Domates"),
    SALATALIK("Salatalık");

    private final String urun;

    EnumUrun(String urun) {
        this.urun = urun;
    }

    public String getUrun() {
        return urun;
    }
}
