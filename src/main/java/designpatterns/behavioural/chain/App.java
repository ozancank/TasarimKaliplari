package main.java.designpatterns.behavioural.chain;

public class App {
    public static void main(String[] args) {
        KargoSirketi ockKargo = OckKargo.getKargoSirketi();

        ockKargo.kargola(EnumIl.KARS);
        System.out.println("\n--------------------\n");
        ockKargo.kargola(EnumIl.ANTALYA);
        System.out.println("\n--------------------\n");
        ockKargo.kargola(EnumIl.ISTANBUL);
        System.out.println("\n--------------------\n");
        ockKargo.kargola(EnumIl.ANKARA);
        System.out.println("\n--------------------\n");
        ockKargo.kargola(EnumIl.CANKIRI);
    }
}
