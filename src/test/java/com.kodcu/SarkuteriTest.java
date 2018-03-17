package com.kodcu;

import com.kodcu.sarkuteri.*;
import org.junit.Assert;
import org.junit.Test;

public class SarkuteriTest {


    @Test(expected = NullPointerException.class)
    public void peynirTest() {


        // given
        BeyazPeynir beyazPeynir = new BeyazPeynir(new BirYildanAz(),  new Butun()) ;

        // when
        beyazPeynir.printBarcode();

        // then
        Assert.assertEquals("Butun" , beyazPeynir.getPaketlenebilirlik().paketSekliniSoyle());


        // when
        beyazPeynir.setPaketlenebilirlik(new DilimDilim()) ;

        // then
        beyazPeynir.printBarcode();
        // then
        Assert.assertEquals("Dilim Dilim" , beyazPeynir.getPaketlenebilirlik().paketSekliniSoyle());



    }

    @Test
    public void testIsliPeynir() {
        // given - when
        Mal isliPeynir = new IsliPeynir(new BirYildanCok(),  new DilimDilim());

        isliPeynir.setSonKullanmaTarihi(new BirYildanCok()) ;

        isliPeynir.printBarcode();
    }
}
