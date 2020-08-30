package main.java.designpatterns.behavioural.strategy;

public class SayisalStratejisi implements SinavStratejisi {
    @Override
    public EnumDers getBirinci() {
        return EnumDers.MATEMATIK;
    }

    @Override
    public EnumDers getİkinci() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getUcuncu() {
        return EnumDers.FEN;
    }

    @Override
    public EnumDers getDorduncu() {
        return EnumDers.SOSYAL;
    }
}
