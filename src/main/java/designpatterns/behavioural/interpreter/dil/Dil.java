package main.java.designpatterns.behavioural.interpreter.dil;

public abstract class Dil {
    private final EnumDil dil;

    public Dil(EnumDil dil) {
        this.dil = dil;
    }

    public String turkveyeCevir(String soz) {
        StringBuilder turkce = new StringBuilder();
        String[] kelimeler = soz.split(" ");

        for (String kelime : kelimeler) {
            String turkceKelime = kelimeyiTurkceyeCevir(kelime);
            turkce.append(" ");
            turkce.append(turkceKelime);
        }

        return turkce.toString();
    }

    private String kelimeyiTurkceyeCevir(String kelime) {

        String heceleri = hecele(kelime);

        String[] heceList = heceleri.split("-");

        return hecelerdenKelimeBul(heceList);
    }

    private String hecelerdenKelimeBul(String[] heceList) {
        StringBuilder turkceKelime = new StringBuilder();

        int i = 0;

        for (String hece : heceList) {
            if (i % 2 == 0) {
                turkceKelime.append(hece);
            }
            i++;
        }

        return turkceKelime.toString();
    }

    private String hecele(String kelime) {
        StringBuilder hecelenmisHali = new StringBuilder();
        while (kelime.length() > 0) {
            String hece = getHece(kelime);
            hecelenmisHali.append(hece);
            hecelenmisHali.append("-");
            kelime = kelime.replaceFirst(hece, "");
        }
        return hecelenmisHali.toString();
    }

    private String getHece(String kelime) {
        int boyut = dil.getEk().length();
        if (kelime.length() < dil.getEk().length()) {
            boyut = kelime.length();
        }

        return kelime.substring(0, boyut);
    }
}
