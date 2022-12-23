package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        //Note: Switch'lerde boolean ve float kullanılmaz
        //       Switch ifadesi sadece bir kere kullanılır.
        //       Switch case de default kullanmak zorunlu değilidr

        //Example 1= Kullanıcıdan gün sayıyını alınız ve gün ismini ekrana yazdırınız.
        //1==> pazar   2==>Pazartesi

        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarasını giriniz..");
        byte gunNo = input.nextByte();

        //1.YOL: if ile çözünüz.

        if (gunNo==1){
            System.out.println("Pazar");
        }else if(gunNo==2){
            System.out.println("Pazartesi");
        }else if(gunNo==3){
            System.out.println("salı");
        }else if(gunNo==4){
            System.out.println("Çarşamba");
        }else if(gunNo==5){
            System.out.println("perşembe");
        }else if(gunNo==6){
            System.out.println("cuma");
        }else if(gunNo==7){
            System.out.println("Cumaretsi");
        }else{
            System.out.println("Geçerli gün sayısı giriniz");
        }

         //2.yol : swich ile çözün.swich if in yaptığı her şeyi yazar.swich daha sade okunması daha kolaydır.
        //3'ten fazla durum varsa kullanılması tavsiye edilir.

        switch(gunNo){    //switch de sadece variable ismi yazılır.
                          // case durum demek
            case 1:
                System.out.println("Pazar");
                break;     // break mola demek.break koymazsak java ara vermez bir sonraki kodu da çalıştırır.
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Salı");
                break;
            case 4:
                System.out.println("Çarşamba");
                break;
            case 5:
                System.out.println("Peşembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Geçerli gün numarası giriniz...");

        }

    }

}
