package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        /*
           Kullanıcıya ay ismi sorunuz ve kullanıcının verdiği ay isminden son aya kadar ekrana yazdırınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay ismini giriniz..");
        String ayİsmi = input.next().toLowerCase();  //lower- küçük case-harf demek. toLowerCase() methodu bir string deki harfleri küçük harfe çevirir
                                                     //toUpperCase() ise bir string deki tüm karakterleri büyük harfe çevirir
        switch(ayİsmi){                              //equls kullanılmaz çünkü karşılaştırma yok
            case "ocak":
                System.out.println("Ocak");
            case "şubat":
                System.out.println("Şubat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayıs":
                System.out.println("Mayıs");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "ağustos":
                System.out.println("Ağustos");
            case "eylül":
                System.out.println("Eylül");
            case "ekim":
                System.out.println("Ekim");
            case "kasım":
                System.out.println("Kasım");
            case "aralık":
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Geçerli ay ismi giriniz..");


        }

    }

}
