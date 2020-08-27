package main.java.designpatterns.structural.bridge.cihaz;

import main.java.designpatterns.structural.bridge.Muzik;
import main.java.designpatterns.structural.bridge.muzikcalar.Fizy;
import main.java.designpatterns.structural.bridge.sescihazi.Kulaklik;

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
