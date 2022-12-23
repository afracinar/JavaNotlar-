package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {

        //Example 1 : 3'den 10'a kadar tam sayıları aynı satırda ekrana yazdıran kodu yazınız.

        //1.YOLL

        for (int i = 3; i <11 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //2.YOLL "While Loop": bütün loop çeşitlerinde başlangıç değeri,koşulu,arttırma azaltma kısmı mutlaka vardır.sadece yerleri farklıdır

        int i=3;
        while(i<11){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println();
         //Example 2 : 17'den 4'e kadar tüm çift sayıları ekrana yazdıran kodu yazınız.

        int ii=17;

        while(ii>3){

            if(ii%2==0){
                System.out.print(ii+" ");
            }

            ii--;
        }

        System.out.println();
        //Example 3: 12'den 67'ye kadar sayıların toplamını veren kodu yazınız.

        int sum = 0;
        int m =12;
        while(m<68){

            sum = sum + m;
            m++;
        }
        System.out.println(sum); //2212

        ///Example 4: Size verilen bir tam sayının rakamları toplamını ekrana yazdıran kodu yazınız.

        int sonuc=0;
        int sayı = 385;
        while(sayı>0){
            sonuc = sonuc + sayı%10;

            sayı=sayı/10;

        }
        System.out.println(sonuc);

        //Example 5: kullanıcıdan aşdığınız bir sayının çarpım tablosunu ekrana yazdırınız. 3*1=3 3*2=6 ... 3*10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int s = input.nextInt();
        int c= 1;
        while(c<11){

            System.out.println(s + "*" + c + "=" + s*c);

            c++;
        }
    }
}
