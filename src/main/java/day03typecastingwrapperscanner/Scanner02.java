package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1:Sayıları kullanıcıdan alan ve toplama işlemi yapan kodu yazınız

        //1.adım :Scanner Class'ından object oluşturunuz.
        Scanner input = new Scanner(System.in);

        //2.aım : kullanıcıya ne yapacağını söye
        System.out.println("ilk sayıyı giriniz...");

        //3.adım: kullanıcıdan aldığın datayı bir variable içine koy
        double sayi1 = input.nextDouble();  //data tipi ne ise next o seçilir.

        System.out.println("ikinci sayıyı giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);

    }

}
