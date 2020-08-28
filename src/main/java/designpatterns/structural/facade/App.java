package main.java.designpatterns.structural.facade;

import main.java.designpatterns.structural.facade.borc.Borc;
import main.java.designpatterns.structural.facade.borc.EnumBorcTuru;
import main.java.designpatterns.structural.facade.borc.OdemeBilgileriDto;

import java.math.BigDecimal;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        TahsilatFacade tahsilatFacade = new TahsilatFacade();

        Long id=10L;
        BigDecimal borcTutar=new BigDecimal(100);
        EnumBorcTuru borcTuru=EnumBorcTuru.NORMAL;
        Date vadeTarihi = DateUtil.tarihOlustur("01.01.2020");

        Borc borc = new Borc(id, borcTuru, borcTutar, vadeTarihi);
        OdemeBilgileriDto odemeBilgileriDto = new OdemeBilgileriDto("Ali", "123456", 1L, 2023L, 123L);

        boolean isSuccess= tahsilatFacade.tahsilatYap(borc,odemeBilgileriDto);

        if(isSuccess){
            System.out.println("Tahsilat Yapıldı.");
        }else{
            System.out.println("Tahsilat Yapılmadı.");
        }
    }
}
