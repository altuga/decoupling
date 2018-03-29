package com.kodcu.supermarket;

public class IsliPeynir extends Mal {


    public IsliPeynir(Dayaniklilik dayaniklilik,
                      Paketlenebilirlik paketlenebilirlik) {
        super.paketlenebilirlik = paketlenebilirlik;
        super.dayaniklilik = dayaniklilik;
        // isli peynir hazirla sekli,
    }


    public void adiniSoyle() {
        System.out.println("Ben Isli Peynirim ...");
    }

    public void isliPeynirinOzelFiyatiniHesapalama() {
        double x = 10 + 2.1 ;
    }
}
