package main.java.designpatterns.structural.facade;

import main.java.designpatterns.structural.facade.borc.Borc;
import main.java.designpatterns.structural.facade.borc.OdemeBilgileriDto;
import main.java.designpatterns.structural.facade.gecikme.GecikmeZammiHesaplamaService;
import main.java.designpatterns.structural.facade.tahsilat.TahsilatKontrolService;
import main.java.designpatterns.structural.facade.tahsilat.kredikarti.KrediKartiService;

import java.math.BigDecimal;

public class TahsilatFacade {
    private final GecikmeZammiHesaplamaService gecikmeZammiHesaplamaService;
    private final TahsilatKontrolService tahsilatKontrolService;
    private final KrediKartiService krediKartiService;

    public TahsilatFacade() {
        gecikmeZammiHesaplamaService = new GecikmeZammiHesaplamaService();
        tahsilatKontrolService = new TahsilatKontrolService();
        krediKartiService = new KrediKartiService();
    }

    public boolean tahsilatYap(Borc borc, OdemeBilgileriDto odemeBilgileriDto) {
        boolean tahsilataUygun = tahsilatKontrolService.isTahsilataUygun(borc);
        if (!tahsilataUygun) return false;
        BigDecimal borcTutari=borc.getBorcTutari();
        BigDecimal gecikmeZammi= gecikmeZammiHesaplamaService.gecikmeZammiHesapla(borc.getBorcTutari(),borc.getVadeTarihi());
        BigDecimal odenecekTutar= borcTutari.add(gecikmeZammi);
        System.out.println("Bilgi: Kredi kartından "+odenecekTutar+" TL tahsilatı deneniyor.");

        return krediKartiService.krediKartindanTahsilDene(odemeBilgileriDto,odenecekTutar);
    }
}
