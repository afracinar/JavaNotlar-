package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

         /*
    Kullanıcıdan ilk,orta ve soyismini alınız ve aşağıdaki formatta ekrana yazdırınız
    Ali Mert Can
    123456789
     */

        Scanner input = new Scanner(System.in);

        //1.YOL
        System.out.println("İlk isminizi giriniz...");
        String ilkIsim = input.next();

        System.out.println("Orta isminizi giriniz...");
        String ortaIsim = input.next();

        System.out.println("Soy isminizi giriniz...");
        String soyIsim = input.next();

        System.out.println("Kimlik numaranızı giriniz...");
        String kimlikNo = input.next();

        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);



        //2.YOL  - tek mesajla çoklu data alma
        System.out.println("Ilk,orta ve soyisminizi ve kimlik numaranızı giriniz...");
        String ilk = input.next();
        String orta = input.next();   //next kullanıcının girdiği kelimelerden sadece ilkini alır
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy );
        System.out.println(kimlik);

        /*
           next() ile nextLine() in farkı nedir
           next() methodu kullanıcıdan gelen string in sadece ilk kelimesini alır yani boşluğa kadar olan kısmı alır
           nextLine() methodu kullanıcıdan gelen string in tamamını alır yani bütün kelimeleri
         */


        //3.YOL
        System.out.println("Ilk,orta ve soy isminizi giriniz");
        String tamIsim = input.nextLine();  //input.nextLine() kullanıcının girdiği bütün kelimeleri alır. (line=satır)
        System.out.println(tamIsim);

        System.out.println("Kimlik numarasını giriniz...");
        String kimlikNumarası = input.next(); //kimlik no boşluklardan oluşmuyorsa next() kullanırız
        System.out.println(kimlikNumarası);




    }
}







