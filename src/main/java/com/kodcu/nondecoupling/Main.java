package com.kodcu.nondecoupling;

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
         new YazdirmaServisi().y.yaz();
        // Yazıcı sınıfı LazerYazici sınıfına göbekten bağlı!!
        // Şirketimiz Yazıcı sınıf aracılığıyla Lazer yazıcıyı kullanıyor
        // Peki yeni bir Deskjet yazıcı aldığımızda ne olacak??
        // Yeni bir DeskjetYazici sınıfı oluşturulacak
        // Fakat YaziciServisi sınıfımız yalnızca Lazer yazıcıya hizmet veriyor
        // Peki Yazıcı sınıfını diğer yazıcı türlerine hizmet verir hale nasıl getireceğiz?
        // Cevap : YaziciServisi sınıfını modifiye ederek.
        // 100 adet farklı yazıcı tipine hizmet vermek istiyoruz
        // YaziciServisi sınıfını 100 kere modifiye mi edeceğiz?  İstenmeyen durum!!
        // Amaç : koda dokunmadan projede değişikliğe gidebilmek!!
    }
}
