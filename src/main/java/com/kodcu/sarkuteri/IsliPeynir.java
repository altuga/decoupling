package com.kodcu.sarkuteri;

public class IsliPeynir extends Mal {

    public IsliPeynir(SonKullanmaTarihi sonKullanmaTarihi, Paketlenebilirlik paketlenebilirlik) {
        super.setSonKullanmaTarihi(sonKullanmaTarihi);
        super.setPaketlenebilirlik(paketlenebilirlik);

    }

    public String adiniSoyle() {

        System.out.println("Isli Peynir");
        return "Isli Peynir";
    }
}
