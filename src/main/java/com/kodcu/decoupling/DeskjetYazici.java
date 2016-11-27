package com.kodcu.decoupling;

/**
 * User: Altug Altintas
 * Date: 03.03.2016
 * Time: 15:26
 *
 */
public class DeskjetYazici implements Yazici{
    public void yaz() {
        System.out.println(this.getClass().getName()+" yazmaya başladı");
    }
}
