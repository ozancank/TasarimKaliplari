package main.java.designpatterns.structural.decorator;

import java.util.Scanner;

public class RaporApp {
    public static void main(String[] args) {
        String metin;
        String talimat = "1)Düz Rapor\n2)Çizgili Rapor\n3)Çizgili Küçük Rapor\n4)İmzalı Çizgili Küçük Rapor";
        System.out.println(talimat);

        Scanner scanInput = new Scanner(System.in);
        String secenek = scanInput.nextLine();
        scanInput.close();

        String icerik = getRaporIcerik();

        metin = switch (secenek) {
            case "1" -> duzRaporCiktisi(icerik);
            case "2" -> cizgiliRaporCiktisi(icerik);
            case "3" -> CizgiliKucukRaporCiktisi(icerik);
            case "4" -> imzaliCizgiliKucukRaporCiktisi(icerik);
            default -> talimat;
        };
        System.out.println(metin);
    }

    private static String imzaliCizgiliKucukRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);
        CizgiliRaporDecorator cizgiliRaporDecorator = new CizgiliRaporDecorator(duzRapor);
        KucukRaporDecorator kucukRaporDecorator = new KucukRaporDecorator(cizgiliRaporDecorator);
        ImzaliRaporDecorator decorator = new ImzaliRaporDecorator(kucukRaporDecorator);
        return decorator.getMetin();
    }

    private static String CizgiliKucukRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);
        CizgiliRaporDecorator cizgiliRaporDecorator = new CizgiliRaporDecorator(duzRapor);
        KucukRaporDecorator decorator = new KucukRaporDecorator(cizgiliRaporDecorator);
        return decorator.getMetin();
    }

    private static String cizgiliRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);
        CizgiliRaporDecorator decorator = new CizgiliRaporDecorator(duzRapor);
        return decorator.getMetin();
    }

    private static String duzRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);
        return duzRapor.getMetin();
    }

    private static String getRaporIcerik() {

        return "Lorem Ipsum Nedir?\n" +
                "\nLorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. Lorem Ipsum, adı bilinmeyen bir matbaacının bir " +
                "\nhurufat numune kitabı oluşturmak üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler " +
                "\nolarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden elektronik dizgiye de " +
                "\nsıçramıştır. 1960'larda Lorem Ipsum pasajları da içeren Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker " +
                "\ngibi Lorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.";
    }
}
