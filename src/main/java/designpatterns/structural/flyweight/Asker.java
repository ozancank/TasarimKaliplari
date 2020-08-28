package main.java.designpatterns.structural.flyweight;

public abstract class Asker {
    private EnumMermiBoyutu mermiBoyutu;

    public Asker(EnumMermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;
    }

    public void atesEt(){
//        Mermi mermi=new Mermi(mermiBoyutu);
        Mermi mermi=MermiFactory.mermiUret(mermiBoyutu);
        mermi.atesle();
    }

    public void tara(){
        for (int i = 0; i < 5; i++) {
            atesEt();
        }

        for (int i = 0; i < 5; i++) {
            tara();
        }
    }
}
