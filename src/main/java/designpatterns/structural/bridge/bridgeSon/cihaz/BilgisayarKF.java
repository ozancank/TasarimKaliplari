package main.java.designpatterns.structural.bridge.bridgeSon.cihaz;

import main.java.designpatterns.structural.bridge.bridgeSon.Muzik;
import main.java.designpatterns.structural.bridge.bridgeSon.muzikcalar.Fizy;
import main.java.designpatterns.structural.bridge.bridgeSon.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {
    public BilgisayarKF() {
        sesCihazi=new Kulaklik();
        muzikCalar=new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar Çalıştı.");
        super.muzikCal(muzik);
    }
}
