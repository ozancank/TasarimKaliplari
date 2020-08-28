package main.java.designpatterns.structural.facade.tahsilat;

import main.java.designpatterns.structural.facade.borc.Borc;
import main.java.designpatterns.structural.facade.borc.EnumBorcTuru;
import main.java.designpatterns.structural.facade.hukuksal.HukuksalKontrolService;
import main.java.designpatterns.structural.facade.yapilandirma.YapilandirmaKontroService;

public class TahsilatKontrolService {
    private final YapilandirmaKontroService yapilandirmaKontroService;
    private final HukuksalKontrolService hukuksalKontrolService;

    public TahsilatKontrolService() {
        yapilandirmaKontroService = new YapilandirmaKontroService();
        hukuksalKontrolService = new HukuksalKontrolService();
    }

    public boolean isTahsilataUygun(Borc borc) {
        boolean yapilandirmaBozulmali=false;
        if (EnumBorcTuru.YAPILANDIRMA.equals(borc.getBorcTuru())) {
            yapilandirmaBozulmali = yapilandirmaKontroService.isYapilandirmaBozulmali(borc.getVadeTarihi());
        }

        boolean hukuksalIslemde = hukuksalKontrolService.isHukuksalIslemde(borc.getId());

        return !(yapilandirmaBozulmali || hukuksalIslemde);
    }
}
