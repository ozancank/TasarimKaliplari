package main.java.designpatterns.structural.facade.yapilandirma;

import main.java.designpatterns.structural.facade.DateUtil;

import java.util.Date;

public class YapilandirmaKontroService {
    /**
     *Eğer vade tarihi üzerinden 90 gün geçtiyse yapılandırma bozulur.
     */
    public boolean isYapilandirmaBozulmali(Date vadeTarihi){
        Date gununTarihi= DateUtil.getGununTarihi();

        long gunFarki=DateUtil.gunFarkiHesapla(vadeTarihi,gununTarihi);

        boolean isYapilandirmaBozulmali=gunFarki>90;

        if (isYapilandirmaBozulmali){
            System.out.println("Borcun yapılandırması bozulmalı! Tahsil edilemez!");
        }

        return isYapilandirmaBozulmali;
    }
}
