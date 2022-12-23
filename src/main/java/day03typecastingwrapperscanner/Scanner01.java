package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanıcıdan data almaya yarar.Yani dışarıdaki datayı dijital ortama taşır
    //Scnnner kullanıcı ile etkileşim kurmamızı sağlar.
    //Scanner bir Java class'ıdır.Bu class'ı kullanabilmek için 'import' etmek gerekir.
    //Scanner class' Java'nın util kütüphanesindedir.
    //Scanner class içinde kullanıcıdan data almayı sağlayan method+variable lar vardır

    public static void main(String[] args) {
       //Kullanıcıdan data almak için yapılması gerekenler:

        //1.Adım : Scanner class'ından objekt oluşturun
         //obje oluşturma: 1)class adını yaz 2)isim ver 3)=  4)new   5)class adını tekrar yaz parantezle (constructor)
        Scanner input = new Scanner(System.in);  //constructor içine System.in yazarız.yani sistem içine bir şey koyacam demek.

        //2.Adım : kullanıcıya ne yapacağını söyle
        System.out.println("Hey kullanıcı yaşını gir...");

        //3.Adım : Kullanıcıdan aldığınız datayı bir variable ın içine koyun
        byte age = input.nextByte();

        System.out.println("Hey kullanıcı senin yaşın:" + age);


    }

}
