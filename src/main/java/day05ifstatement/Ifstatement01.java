package day05ifstatement;

import java.util.Scanner;

public class Ifstatement01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan aldınan sayının tek mi çift mi olduğunu ekrana yazan kodu yazınız.
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz...");
        int s = input.nextInt();  //int yaptık çünkü tam sayı olmalı.

        //1.YOL: bu yol ideal yol değil.

        if (s%2==0){
            System.out.println("Cift Sayı..");
        }

        if (s%2!=0){  //"!=" demek 'eşit değil' demektir.java da ! demek değil demektir
            System.out.println("Tek sayı...");
        }

        //2.YOL  ideal yol budur.çünkü 1.yolda 2 şart kontol  edilir.2.yolda bir şart kontrol edilir.2.yolda java daha hızlıdır
                       //Java if ve else if lerde doğruyu bulduktan sonra diğer kodları okumaz bu da java ya hız kazandırır
        if(s%2==0){
            System.out.println("Cift Sayı..");
        }else{  //"else" 'diğer bütün durumlar için' demektir..Başka bir ihtimal yoksa else kullanılır
            System.out.println("Tek sayı..");
        }

        //Example: Bir sayının negatif, pozitif veya nötr olduğunu söyleyen kodu yazınız.

        System.out.println("Bir sayı giriniz...");
        double d = input.nextDouble();

        if (d>0){
            System.out.println("Pozitif");
        }else if(d==0){  //birden fazla opsiyon varsa "else if" ile bire indirmemiz lazım
            System.out.println("Nört");
        }else{  //tek opsiyon kaldıysa "else" kullanılır.
            System.out.println("Negatif");
        }

    }

    }

