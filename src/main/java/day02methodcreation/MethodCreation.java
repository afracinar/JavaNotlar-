package day02methodcreation;

public class MethodCreation {

    //main method içinde kullanacağımız her şey 'static' olmalıdır.çünkü main method static'tir.
    //main method daki sonucu ekranda  görebilmek için "System.out.println()"yapmamız gerekiyor

    public static void main(String[] args) {

       System.out.println(toplamaYap(1.2,5));
       System.out.println(ucSayiyiCarp(4,2.5,3));
       System.out.println(ikisiniToplaUcuncuyleCarp(6,2,5));

       //'sout' yazıp enter a basılırsa System.out.prinln() otomatik olarak yazıır.
        // Ekrana bir şey yazdırmak için 2 tane kod vardır: i)System.out.println()  ii)System.out.print()
        // i de satır başı yapar (ln),ii de satır atlamaz aynı satırdan devam eder


    }

    //Example 1:Toplama işlemi yapan bir method oluşturunuz.
    public static double toplamaYap(double a, double b){
        return a+b;
    }

    //Example 2:Üç sayıyı birbiriyle çarpan method oluşturunuz.
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;
    }

    //Example 3:Üç sayıdan ilk ikisini toplayıp üçüncü ile çarpan method oluşturup sonucu ekrana yazdırın
    public static double ikisiniToplaUcuncuyleCarp(double a,double b,double c){
        return (a+b)*c;
    }
}

