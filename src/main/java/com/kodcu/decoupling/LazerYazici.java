package com.usta.decoupling;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 03.03.2012
 * Time: 15:23
 * To change this template use File | Settings | File Templates.
 */
public class LazerYazici implements Yazici{

    public void yaz(){
          System.out.println(this.getClass().getName()+" yazmaya başladı");
    }
}
