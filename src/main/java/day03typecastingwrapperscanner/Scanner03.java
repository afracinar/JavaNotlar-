package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanıcıdan bir diktörtgenin en ve boyunu alıp alan ve çevresini hessaplayan kodu giriniz

        Scanner input = new Scanner(System.in);

        System.out.println("dikdörtgenin kısa kenarını giriniz..");
        int en = input.nextInt();

        System.out.println("dikdörtgenin uzun kenarını giriniz..");
        int boy = input.nextInt();

        System.out.println("alan" + en*boy);

        System.out.println("çevre" + 2*(en+boy));

    }
}
