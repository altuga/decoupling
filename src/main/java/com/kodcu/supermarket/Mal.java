package com.kodcu.supermarket;

public abstract class Mal {

    protected Dayaniklilik dayaniklilik;
    protected Paketlenebilirlik paketlenebilirlik;

    public void printBarcode() {
        this.dayaniklilik.dayanikliliginiSoyle();
        this.paketlenebilirlik.paketlenmeSekliniSoyle();
        this.adiniSoyle();

    }



    public abstract void adiniSoyle();
}
