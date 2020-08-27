package main.java.designpatterns.structural.bridge.muzikcalar;

import main.java.designpatterns.structural.bridge.Muzik;

public class Spotify implements MuzikCalar {
    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Spotify " + muzik + " şarkısını çalıyor.");

        return muzik.getSes();
    }
}
