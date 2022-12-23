package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız.
        //           Ramazan==>Rn

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = input.next();  //String'ler tek kelimeyse next yeter,birden fazla kelimeyse nextline

        //1.YOL
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length()-1);
                                 //-1 deriz çünkü index 0 dan başlar son harfin index i her zaman toplam karakter sayısının 1 eksiğidir
                                //yazdığınız code sadece bazı durumlar için çalışırsa o code'a "hard coding" denir.hard coding kötü bir şeydir
                               //yazdığınız code her durum için çalışırsa o code 'a "Dynamic coding" denir.dynamic code yazmalıyız

        System.out.println("" + ilkHarf + sonHarf); //"" koymazsak ascıı değerleri toplar.

        //2.YOL  --sub,alt demektir.substring demek bir stringin içindeki string'ler demektir.Alt küme gibi.
        String ilk = isim.substring(0,1);   //(0,1) her zaman ilk harfi verir.0 index'i dahil 1 index'i dahil değildir.
        String son = isim.substring(isim.length()-1,isim.length()); //n
        System.out.println(ilk+son); //String olarak yazdığımız için java ascıı değerlerini toplayamaz.substring kullandığımızda java direk birleştirme işlemi yapıyor


        //Example 2:Verilen String'deki sadece hayvan isimlerini ekrana yazdırınız.
        //          "Ben kedi,eşim tavuk,oğlum sever inek"

        //substring()'in iki kullanımı vardır.
        //      1)substring(baslangıç indexi,bitiş indexi) String'in ortasından yani içinden bir parça almaya yarar
        //      2)substring(baslangıç indexi) String'in verilen index'ten sonuna kadar almaya yarar.yani başlangıçtan sonuna kadar alır
        String str = "Ben kedi,eşim tavuk,oğlum sever inek";
        String kedi = str.substring(4,8);
        String tavuk = str.substring(14,19);
        String inek = str.substring(32); //32'den başlar cümlenin sonuna kadar yazdırır
        System.out.println(kedi+tavuk+inek);


        //Example 3: ilk isim ve soy isimi içeren isimlerden ilk ve soyisimlerin baş harflerini ekrana yazdırınız.
        //           Ali Can ==>AC       Tahsin Yurdakul==>TY

        System.out.println("İlk ve soyisminizi giriniz..");
        String tamİsim = input.nextLine();   //Kullanıcı birden fazla kelime gireceği için nextLine aldık

        String a  = tamİsim.substring(0,1);  //(0,1) her zaman ilk harfi verir

        String b = tamİsim.split(" ")[1].substring(0,1);
        System.out.println(a+b);  //String olduğu için ascıı değerleri toplanamaz

    }

}
