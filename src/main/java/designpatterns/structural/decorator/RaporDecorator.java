package main.java.designpatterns.structural.decorator;

public abstract class RaporDecorator implements Rapor {

    private final Rapor rapor;

    public RaporDecorator(Rapor rapor) {
        this.rapor = rapor;
    }

    @Override
    public String getMetin() {
        return rapor.getMetin();
    }
}
