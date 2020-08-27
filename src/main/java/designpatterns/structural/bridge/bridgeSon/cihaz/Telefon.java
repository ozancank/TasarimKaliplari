package main.java.designpatterns.structural.bridge.bridgeSon.cihaz;

import main.java.designpatterns.structural.bridge.bridgeSon.Muzik;
import main.java.designpatterns.structural.bridge.bridgeSon.muzikcalar.MuzikCalar;
import main.java.designpatterns.structural.bridge.bridgeSon.sescihazi.SesCihazi;

public class Telefon extends MuzikCalabilenBilgisayar {
    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {

        System.out.println("Telefon müzik çalıyor");
        super.muzikCal(muzik);
    }
}
