package hava;

public class IcUcus extends Ucus {
    public IcUcus(Reklam reklam, Indirim indirim) {
        super.reklam = reklam;
        super.indirim = indirim;
    }


    public String hatBilginiBelirt() {
        return "Ic Hat";
    }
}
