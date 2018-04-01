package com.kodcu.nondecoupling;

/**
 * User: Altug Altintas
 * Date: 03.03.2016
 * Time: 15:26
 *
 */
public class YazdirmaServisi {

    public LazerYazici lazerYazici;

    public YazdirmaServisi() {
        lazerYazici = new LazerYazici(); // YazdirmaServisi Lazer yazıcıya sıkı sıkıya bağlı

    }

}
