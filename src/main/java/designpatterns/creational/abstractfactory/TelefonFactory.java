package main.java.designpatterns.creational.abstractfactory;

public interface TelefonFactory {
    Telefon getTelefon(String model, String batarya, int en, int boy);
}
