package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {

        //Array'ler çoklu data depolamak için kullanılır.bir array e konulan dataların hepsi aynı tipte olmalıdır.sadece string veya sadece int
        //Array oluştururken kaç eleman yerleştireceğimizi başta söylememiz gerekir.
        //for-each loop Array'lerde ve Colllections'larda kullanılır
        //Arrays'lerin içine "primitive data type"leri ve reference'(adres)ler yerleştirilebilir.Non-primitive yazılamaz
        //Array içinde adresi vardır.string yoktur.Java ;Array içine String'i koymaz,adresi koyar.
        //(Stack Memory-Heap Memory örneği)

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";

        //System.out.println(str); --> bu ifade adresi verir bize String'i vermez

        System.out.println(Arrays.toString(str)); //burda ise adresi değil String'i istedik

        //Example 1: String bir Array oluşturunuz ve "Tom" ve "Tom"dan önceki tüm elemanları ekrana yazdırınız.

        String arr[] = {"Jane", "Mark", "Cristoper" , "Tom", "Ali","Rojda"}; //"arr"-->Array kısaltması

        for (String w : arr){

            System.out.print(w + " ");

            if (w.equals("Tom")){
                break;  //"Tom" u yazdırdık sonra loop kırıldı

            }
        }
        System.out.println();

        //Example 2: String bir Array oluşturunuz ve "Tom" ve "Jane" hariç tüm elemanları ekrana yazdırınız.

        String brr[] = {"Jane", "Mark", "Cristoper" , "Tom", "Ali","Rojda"};
        for (String w : brr){

            if (w.equals("Tom") || w.equals("Jane")){
                continue; //boşveeer yazdırma
            }
            System.out.print(w + " ");
        }

        System.out.println();
        //Example 3 : Kullanıcı ile beraber bir Array oluşturunuz.
        //           Bir öğretmenin sınıfındaki öğrencilerinin isimlerini application'a yüklemesini sağlayan kodu yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç öğrenci isim gireceğinizi yazınız..");  //Array'de ilk olarak kaç data girileceiğinin yazılması lazım
        int numOfStd = input.nextInt();
        String names [] = new String[numOfStd];

        System.out.println("Girişi sonlandırmak için Q harfine basınız.");

        for (int i = 1 ; i <= numOfStd ; i++) {   //tekrarlı işlem olduğu için sürekli isim girileceğinden for kullandık.
                                                  //Henüz Array olmadığı için foreach kullanamayız
            System.out.println("Lütfen " + i + ". öğrencinin ilk  ismini giriniz");

            String stdName = input.next();

            if (stdName.equalsIgnoreCase("Q")){
                break;  //if true verirse break çalışır ve loop kırılır sout'a geçer
            }

            names[i-1] = stdName;  //[i-1] dedik çünkü konulan ilk ismin index'i 0 olacak yaninames[i-1] 0 olacak 0.index

        }

        System.out.println(Arrays.toString(names));











    }

}
