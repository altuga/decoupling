package com.kodcu.decoupling;

/**
 * User: Altug Altintas
 * Date: 03.03.2016
 * Time: 15:26
 *
 */
public class YazdirmaServisi {



    // public LazerYazici yazici;
    private Yazici yazici; // dikkat

    public YazdirmaServisi(Yazici yazici) {
          // yazici=new LazerYazici();
         this.yazici = yazici;
    }

    public Yazici getYazici() {
        return yazici;
    }

}
