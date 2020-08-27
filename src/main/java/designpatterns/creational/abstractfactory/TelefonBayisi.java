package main.java.designpatterns.creational.abstractfactory;

public class TelefonBayisi {
    public static void main(String[] args) {
        S8Fabrikasi s8Fabrikasi =new S8Fabrikasi();
        Telefon s8=s8Fabrikasi.getTelefon("s8","2600mah",4,7);

        Note8Fabrikasi note8Fabrikasi =new Note8Fabrikasi();
        Telefon note8=note8Fabrikasi.getTelefon("note8","3000mah",5,8);

        System.out.println("S8 için telefon özellikleri: ");
        System.out.println(s8);

        System.out.println("Note8 için telefon özellikleri: ");
        System.out.println(note8);
    }
}
