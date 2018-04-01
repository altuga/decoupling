package com.kodcu.decoupling;

/**
 * User: Altug Altintas
 * Date: 03.03.2016
 * Time: 15:26
 *
 */
public class Main {

    public static void main(String[] args)
    {
        new YazdirmaServisi(new DeskjetYazici()).getYazici().yaz();

        new YazdirmaServisi(new LazerYazici()).getYazici().yaz();

        //new YazdirmaServisi(new DotPrinter()).getYazici().yaz();

        /*
        LazerYazici lazerYazici=new LazerYazici();
        YazdirmaServisi yazdirmaServisi=new YazdirmaServisi(lazerYazici);
        yazdirmaServisi.yazici.yaz();
        */

    }
}
