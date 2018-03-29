package hava;

import org.junit.*;

public class AirTest {

    @Test
    public void IcUcuslarTest() {

        IcUcus ucus = new IcUcus(new ReklamYok(), new IndirimYok()) ;

        String sonuc = ucus.ucusBilgileriniVer();

        Assert.assertEquals(sonuc, "Ic Hat Indirim Yok Reklam Yok") ;


    }
}
