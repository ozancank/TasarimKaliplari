package main.java.designpatterns.structural.bridge.bridgeIlk;

public class App {
    public static void main(String[] args) {
        Muzik muzik =new Muzik("Sezen Aksu - Gülümse","Gülümse hadi gülümse");
        Bilgisayar bilgisayar=new Bilgisayar();
        bilgisayar.muzikCal(muzik);
    }
}
