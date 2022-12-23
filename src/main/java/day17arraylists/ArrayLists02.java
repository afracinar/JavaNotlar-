package day17arraylists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {

    public static void main(String[] args) {

        //*** Example 1:Verilen bir List'teki elemanları tekrarsız olarak yazınız.
        //          [2,3,2,2,5] ==> [2,3,5]
        // Yeni bir list oluşturulur

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();

        for (Integer w : a){
            if (!yeni.contains(w)){
                yeni.add(w);
            }
        }
        System.out.println(yeni);  //[2, 3, 5]

        //Example 2:Kullanıcıdan bir harf alınız.Harf sizdeki List'in içinde varsa o harfi "Bulundu"ya çeviriniz
        //yoksa o harfi List'e ekleyiniz..
        //           [A,K,R,S]  ==> R  ==> [A,K,Bulundu,S]
        //           [A,K,R,S]  ==> X  ==> [A,K,R,S,X]

        Scanner input = new Scanner(System.in);
        String harf ="";

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        do {

            System.out.println("Lütfen bir harf giriniz");
            harf = input.next().substring(0, 1);//List  string olduğu için char değil,string yaptık.


            if (c.contains(harf)) {
                c.set(c.indexOf(harf), "Bulundu");
            } else if(!harf.equals("Q")){  //
                c.add(harf);
            }


        }while(!harf.equals("Q"));

        System.out.println(c);
}

}
