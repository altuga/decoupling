package com.kodcu.decoupling;

/**
 * User: Altug Altintas
 * Date: 03.03.2016
 * Time: 15:26
 *
 */
public class YazdirmaServisi {

   // public LazerYazici y;
      public Yazici y; // dikkat

    public YazdirmaServisi(Yazici y) {
          // y=new LazerYazici();
         this.y=y;
    }

}
