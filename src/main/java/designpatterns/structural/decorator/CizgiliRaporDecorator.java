package main.java.designpatterns.structural.decorator;

public class CizgiliRaporDecorator extends RaporDecorator {

    public CizgiliRaporDecorator(Rapor rapor) {
        super(rapor);
    }

    @Override
    public String getMetin() {
        String metin = super.getMetin();

        return RaporUtil.getCizgiliMetin(metin);
    }
}
