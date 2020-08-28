package main.java.designpatterns.structural.facade.tahsilat.kredikarti;

import main.java.designpatterns.structural.facade.borc.OdemeBilgileriDto;

import java.math.BigDecimal;

public class KrediKartiService {
    private final KrediKartiKontrolService krediKartiKontrolService;

    public KrediKartiService() {
        krediKartiKontrolService = new KrediKartiKontrolService();
    }

    public boolean krediKartindanTahsilDene(OdemeBilgileriDto odemeBilgileriDto, BigDecimal odenecekTutar) {
        boolean krediKartiGecerli = krediKartiKontrolService.isKrediKartiGecerli(odemeBilgileriDto);

        if (!krediKartiGecerli) {
            return false;
        }

        boolean yeterliLimitVar = isYetrliLimitVar(odemeBilgileriDto, odenecekTutar);

        if (!yeterliLimitVar) {
            return false;
        }

        System.out.println("Kredi kartından " + odenecekTutar + " TL tahsil edilmiştir.");

        return true;
    }

    private boolean isYetrliLimitVar(OdemeBilgileriDto odemeBilgileriDto, BigDecimal odenecekTutar) {
        BigDecimal limit = getKrediKartiLimiti(odemeBilgileriDto);

        boolean isYeterliLimitVar = limit.compareTo(odenecekTutar) > 0;

        if (!isYeterliLimitVar) {
            System.out.println("Kartta yeterli limit bulunmamaktadır!");
        }

        return isYeterliLimitVar;
    }

    private BigDecimal getKrediKartiLimiti(OdemeBilgileriDto odemeBilgileriDto) {
        BigDecimal limit = BigDecimal.ZERO;

        String kartUzerindekiIsim = odemeBilgileriDto.getKartUzerindekiIsim();

        if (kartUzerindekiIsim.contains("Ali")) {
            limit = new BigDecimal(1000);
        } else if (kartUzerindekiIsim.contains("Ayşe")) {
            limit = new BigDecimal(2000);
        } else if (kartUzerindekiIsim.contains("Veli")) {
            limit = BigDecimal.TEN;
        }

        return limit;
    }
}
