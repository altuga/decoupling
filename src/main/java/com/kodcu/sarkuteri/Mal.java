package com.kodcu.sarkuteri;

public abstract class Mal {

    protected Paketlenebilirlik paketlenebilirlik;
    protected SonKullanmaTarihi sonKullanmaTarihi;

    public final void printBarcode() {

        getPaketlenebilirlik().paketSekliniSoyle(); // Tek Paraca
        getSonKullanmaTarihi().bilgiVer(); // BirYildanCok
        adiniSoyle(); // BeyazPeynir

    }

    public abstract String adiniSoyle();


    public Paketlenebilirlik getPaketlenebilirlik() {
        return paketlenebilirlik;
    }

    public void setPaketlenebilirlik(Paketlenebilirlik paketlenebilirlik) {
        this.paketlenebilirlik = paketlenebilirlik;
    }

    public SonKullanmaTarihi getSonKullanmaTarihi() {
        return sonKullanmaTarihi;
    }

    public void setSonKullanmaTarihi(SonKullanmaTarihi sonKullanmaTarihi) {
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }
}
