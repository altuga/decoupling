package com.kodcu.nondecoupling;

/**
 * User: Altug Altintas
 * Date: 03.03.2016
 * Time: 15:26
 *
 */
public class YazdirmaServisi {

    public com.kodcu.nondecoupling.LazerYazici y;

    public YazdirmaServisi() {
           y=new com.kodcu.nondecoupling.LazerYazici(); // YazdirmaServisi Lazer yazıcıya sıkı sıkıya bağlı

    }

}
