package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1 : Bir String'deki sesli harflerin sayısını bulan kodu yazınız.
        //           a - e - i - o - u - A - E - İ - O -U

        String str = "Java oğrenince para kazanmak kolay,ogrenmeyince ne kolay ki.";
        str = str.toLowerCase();

        String harfler []=str.split("");  //split methodu her zaman Array verir
        int counter =0;

        System.out.println(Arrays.toString(harfler)); //[J, a, v, a,  , ö, ğ, r, e, n, i, n, c, e,  , p, a, r, a,  ,.....]

        for (String w : harfler){

            switch (w){    //3'ten fazla ihtimal varsa switch tercih edilir.

                case "a":  //"a" string
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);



    }


}
