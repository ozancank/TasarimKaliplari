package main.java.designpatterns.behavioural.mediator;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Kabzimal kabzimal = new Kabzimal();
        DomatesUreticisi ureticiAli = new DomatesUreticisi("Ali", BigDecimal.valueOf(4), kabzimal);
        DomatesUreticisi ureticiVeli = new DomatesUreticisi("Veli", BigDecimal.valueOf(3), kabzimal);

        DomatesHalcisi halciAhmet = new DomatesHalcisi("Ahmet", BigDecimal.valueOf(5), kabzimal);
        DomatesHalcisi halciMehmet = new DomatesHalcisi("Mehmet", BigDecimal.valueOf(5), kabzimal);

        kabzimal.ureticiEkle(ureticiAli);
        kabzimal.ureticiEkle(ureticiVeli);

        kabzimal.halciEkle(halciAhmet);
        kabzimal.halciEkle(halciMehmet);

        ureticiAli.urunSat();
        halciMehmet.urunAl();
    }
}
