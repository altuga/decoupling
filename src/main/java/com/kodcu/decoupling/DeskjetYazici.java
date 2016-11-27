package com.kodcu.decoupling;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 03.03.2012
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
public class DeskjetYazici implements Yazici{
    public void yaz() {
        System.out.println(this.getClass().getName()+" yazmaya başladı");
    }
}
