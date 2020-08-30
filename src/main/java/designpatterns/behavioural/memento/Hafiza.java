package main.java.designpatterns.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class Hafiza {
    private final List<NotePadMemento> list;

    public Hafiza() {
        this.list = new ArrayList<>();
    }

    public void ekle(NotePadMemento memento) {
        list.add(memento);
    }

    public NotePadMemento sonVersiyonuGetir() {
        if (!list.isEmpty()) {
            NotePadMemento sonVersiyon = list.get(list.size() - 1);

            list.remove(sonVersiyon);

            return sonVersiyon;
        } else {
            throw new ArrayIndexOutOfBoundsException("Yüklü versiyon bulunamadı!");
        }
    }
}
