package main.java.designpatterns.structural.bridgeIlk;

public class Bilgisayar {
    private Spotify spotify;
    private Hoparlor hoparlor;

    public Bilgisayar() {
        this.spotify = new Spotify();
        this.hoparlor = new Hoparlor();
    }

    public void muzikCal(Muzik muzik){
        System.out.println("Bilgisayar çalıştı.");
        String ses= spotify.muzikCal(muzik);
       hoparlor.muzikCal(ses);
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Hoparlor getHoparlor() {
        return hoparlor;
    }

    public void setHoparlor(Hoparlor hoparlor) {
        this.hoparlor = hoparlor;
    }
}
