package main.java.designpatterns.creational.abstractfactory;

public class Note8Fabrikasi implements TelefonFactory {
    @Override
    public Telefon getTelefon(String model, String batarya, int en, int boy) {
        return new Note8(model, batarya, en, boy);
    }
}
