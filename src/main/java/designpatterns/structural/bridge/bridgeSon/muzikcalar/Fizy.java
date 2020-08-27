package main.java.designpatterns.structural.bridge.bridgeSon.muzikcalar;

import main.java.designpatterns.structural.bridge.bridgeSon.Muzik;

public class Fizy implements MuzikCalar {
    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Fizy "+muzik+" şarkısını çalıyor.");
        return  muzik.getSes();
    }
}
