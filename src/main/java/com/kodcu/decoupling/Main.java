package com.kodcu.decoupling;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 03.03.2012
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args)
    {
        new YazdirmaServisi(new DeskjetYazici()).y.yaz();

        /*
        LazerYazici lazerYazici=new LazerYazici();
        YazdirmaServisi yazdirmaServisi=new YazdirmaServisi(lazerYazici);
        yazdirmaServisi.y.yaz();
        */

    }
}
