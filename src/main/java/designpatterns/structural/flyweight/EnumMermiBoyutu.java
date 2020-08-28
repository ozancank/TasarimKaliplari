package main.java.designpatterns.structural.flyweight;

public enum EnumMermiBoyutu {
    UC(3),
    BES(5),
    YEDI(7);

    private int boyut;

    EnumMermiBoyutu(int boyut) {
        this.boyut=boyut;
    }

    @Override
    public String toString() {
        return String.valueOf(boyut);
    }

    public int getBoyut() {
        return boyut;
    }
}
