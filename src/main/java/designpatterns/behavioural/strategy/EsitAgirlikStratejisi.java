package main.java.designpatterns.behavioural.strategy;

public class EsitAgirlikStratejisi implements SinavStratejisi {
    @Override
    public EnumDers getBirinci() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getİkinci() {
        return EnumDers.MATEMATIK;
    }

    @Override
    public EnumDers getUcuncu() {
        return EnumDers.SOSYAL;
    }

    @Override
    public EnumDers getDorduncu() {
        return EnumDers.FEN;
    }
}
