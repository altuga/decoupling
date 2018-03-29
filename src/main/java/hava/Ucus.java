package hava;

public abstract class Ucus {

    protected Indirim indirim;
    protected Reklam reklam;



    public final String ucusBilgileriniVer() {

        String hatBilgisi = hatBilginiBelirt();
        String indirimKonusu = indirim.indirimiSoyle();
        String reklamDurumu = reklam.reklamBilginiVer();
        return  hatBilgisi + " " + indirimKonusu + " " + reklamDurumu ;
    }

    public Indirim getIndirim() {
        return indirim;
    }

    public Reklam getReklam() {
        return reklam;
    }

    public abstract String hatBilginiBelirt();
}
