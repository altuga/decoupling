package com.kodcu.sarkuteri;

public class BeyazPeynir extends Mal{


    public BeyazPeynir(SonKullanmaTarihi sonKullanmaTarihi, Paketlenebilirlik paketlenebilirlik) {
        super.setSonKullanmaTarihi(sonKullanmaTarihi);
        super.setPaketlenebilirlik(paketlenebilirlik);

    }

    public String adiniSoyle() {

        System.out.println("Beyaz Peynir");
        return "Beyaz Peynir";
    }


}
