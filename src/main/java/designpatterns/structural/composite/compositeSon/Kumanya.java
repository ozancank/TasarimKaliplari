package main.java.designpatterns.structural.composite.compositeSon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya implements Fiyatlanabilir {

    private String adi;
    private final List<Urun> urunList;
    private final List<Paket> paketList;

    public Kumanya(String adi) {
        this.adi = adi;
        this.urunList = new ArrayList<>();
        this.paketList = new ArrayList<>();
    }

    @Override
    public BigDecimal getFiyat() {
        BigDecimal toplamUrunFiyati = FiyatHesaplamaUtil.getToplamUrunFiyati(urunList);
        BigDecimal toplamPaketFiyati = FiyatHesaplamaUtil.getToplamPaketFiyati(paketList);
        return toplamUrunFiyati.add(toplamPaketFiyati);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public List<Paket> getPaketList() {
        return paketList;
    }
}
