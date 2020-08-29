package main.java.designpatterns.behavioural.iterator;

import java.util.Iterator;

public class SoruIterator implements Iterator {
    private final Soru[] sorular;
    private int sira;

    public SoruIterator(Soru[] sorular) {
        this.sorular = sorular;
    }

    @Override
    public boolean hasNext() {
        return sira < sorular.length;
    }

    @Override
    public Object next() {
        Soru soru = sorular[sira];
        sira++;

        return soru;
    }
}
