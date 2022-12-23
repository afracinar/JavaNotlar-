package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        //switch de sadece int,byte,short,char ve String data type'leri kullanılabilir.double,float.long kullanılamaz

        //Kullanıcıdan işlem ve iki tane sayı alarak işlemin sonucunu ekrana yazdıran basit bir hesap makinası yapınız.

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen işlemi seçiniz.+,-,*,/,%");
        char islem = input.next().charAt(0);

        System.out.println("İlk sayıyı giriniz..");
        double sayi = input.nextDouble();

        System.out.println("İkinci sayıyı giriniz..");
        double sayi2 = input.nextDouble();

        switch(islem){
            case '+':
                System.out.println(sayi+sayi2);
                break;
            case '-':
                System.out.println(sayi-sayi2);
                break;
            case '*':
                System.out.println(sayi*sayi2);
                break;
            case '/':
                System.out.println(sayi/sayi2);
                break;
            case'%':
                System.out.println(sayi%sayi2);
                break;
            default:
                System.out.println("Bu işlem tanımlanmamıştır");

        }


    }

}
