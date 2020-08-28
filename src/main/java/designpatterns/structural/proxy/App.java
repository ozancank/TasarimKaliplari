package main.java.designpatterns.structural.proxy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        //YoneticiProxy yoneticiProxy = new YoneticiProxy("Ali", "123");
        YoneticiProxy yoneticiProxy = new YoneticiProxy("Veli", "12345");

        try {
            BigDecimal ciro = yoneticiProxy.getCiro();
            System.out.println("Şirket Cirosu: " + ciro);
        } catch (IllegalAccessException e) {
            System.out.println("Hassas bilgilere erişiminiz yoktur.");
        }

    }
}
