package main.java.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private final List<Observer> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void ekle(Observer observer) {
        observerList.add(observer);
    }

    public void cikar(Observer observer) {
        observerList.remove(observer);
    }

    public void haberVer() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
