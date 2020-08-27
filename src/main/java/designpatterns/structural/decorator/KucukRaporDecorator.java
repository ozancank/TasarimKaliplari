package main.java.designpatterns.structural.decorator;

public class KucukRaporDecorator extends RaporDecorator {
    private final int genislik;

    public KucukRaporDecorator(Rapor rapor) {
        super(rapor);
        this.genislik = 30;
    }

    @Override
    public String getMetin() {
        String metin = super.getMetin();
        return RaporUtil.metniSigdir(metin, genislik);
    }
}
