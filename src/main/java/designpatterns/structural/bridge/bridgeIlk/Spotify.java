package main.java.designpatterns.structural.bridge.bridgeIlk;

public class Spotify {
    public String muzikCal(Muzik muzik){
        System.out.println("Spotify "+muzik+" şarkısını çalıyor.");

        return muzik.getSes();
    }
}
