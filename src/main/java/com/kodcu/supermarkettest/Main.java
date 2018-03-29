package com.kodcu.supermarkettest;

import com.kodcu.supermarket.*;

public class Main {

    public static void main(String[] args) {

        // t1
        BeyazPeynir beyazPeynir1 =
                new BeyazPeynir(new AzOmurlu(), new TekParca());

        beyazPeynir1.printBarcode();

        beyazPeynir1.setDayaniklilik(new BirYildanFazla());
        beyazPeynir1.printBarcode();

        beyazPeynir1.setDayaniklilik(new AzOmurlu());
        beyazPeynir1.printBarcode();


        IsliPeynir isliPeynir =
                new IsliPeynir(new BirYildanFazla(), new DilimDilim());

        isliPeynir.printBarcode();



    }
}
