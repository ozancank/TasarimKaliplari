package main.java.designpatterns.behavioural.chain;

public class OckKargo {
    public static KargoSirketi getKargoSirketi(){
        CankiriSube cankiriSube=new CankiriSube();
        AnkaraSube ankaraSube=new AnkaraSube();
        IstanbulSube istanbulSube=new IstanbulSube();
        AntalyaSube antalyaSube=new AntalyaSube();

        KargoSirketi ockKargo = cankiriSube
                .setSonrakiKargoSirketi(ankaraSube
                        .setSonrakiKargoSirketi(istanbulSube
                                .setSonrakiKargoSirketi(antalyaSube)));

        return ockKargo;
    }
}
