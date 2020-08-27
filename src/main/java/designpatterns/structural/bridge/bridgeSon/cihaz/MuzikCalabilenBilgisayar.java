package main.java.designpatterns.structural.bridge.bridgeSon.cihaz;

import main.java.designpatterns.structural.bridge.bridgeSon.Muzik;
import main.java.designpatterns.structural.bridge.bridgeSon.muzikcalar.MuzikCalar;
import main.java.designpatterns.structural.bridge.bridgeSon.sescihazi.SesCihazi;

public abstract class MuzikCalabilenBilgisayar {
    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {
    }

    public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    public void muzikCal(Muzik muzik) {
        String ses = muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);
    }
}
