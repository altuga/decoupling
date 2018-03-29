package com.kodcu.supermarket;

public class BeyazPeynir extends Mal {



    public BeyazPeynir(Dayaniklilik dayaniklilik,
                       Paketlenebilirlik paketlenebilirlik) {

        super.paketlenebilirlik = paketlenebilirlik;
        super.dayaniklilik = dayaniklilik;
    }



    public void adiniSoyle() {
        System.out.println("Ben Beyaz Peynirim ...");
    }

    public void setDayaniklilik(Dayaniklilik dayaniklilik) {
        super.dayaniklilik =  dayaniklilik;
    }

    public void setPaketlenebilirlik(Paketlenebilirlik paketlenebilirlik) {
        super.paketlenebilirlik =  paketlenebilirlik;
    }
}
