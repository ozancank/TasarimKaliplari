package main.java.designpatterns.behavioural.interpreter.yorumlayici;

import main.java.designpatterns.behavioural.interpreter.dil.KargaDili;

public class KargaDiliYorumlayici implements Yorumlayici {
    @Override
    public String yorumla(String soz) {
        KargaDili kargaDili = new KargaDili();

        return kargaDili.turkveyeCevir(soz);
    }
}
