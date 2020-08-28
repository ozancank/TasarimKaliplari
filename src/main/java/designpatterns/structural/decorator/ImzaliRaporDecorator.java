package main.java.designpatterns.structural.decorator;

public class ImzaliRaporDecorator extends RaporDecorator {
    public ImzaliRaporDecorator(Rapor rapor) {

        super(rapor);
    }

    @Override
    public String getMetin() {
        String metin = super.getMetin();
        return RaporUtil.sonaImzaliMetinEkle(metin);
    }
}
