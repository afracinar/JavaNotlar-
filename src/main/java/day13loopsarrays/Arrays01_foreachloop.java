package day13loopsarrays;

import java.util.Arrays;

public class Arrays01_foreachloop {

    public static void main(String[] args) {

        /*
            1)Aynı data type'da,çoklu data'i depolamak için Java'nın oluşturduğu yapılar vardır
            Bu yapıların birisi de "Array" lerdir.ya string ya int (emin değilim doğrula?)
         */

        //Array nasıl oluşturulur?
        int stdAges[] = new int[7];   //[] koyunca Java Array olduğunu anlar
                         //içine kaç tane koyacağımızı belirtiyoruz.

        //Array nasıl yazdırılır?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasıl eklenir?
        stdAges[1] = 11;  //indexi 1 olana 11 yazdır
        System.out.println(Arrays.toString(stdAges));

        stdAges [0] = 12;
        stdAges [1] = 11;
        stdAges [2] = 13;
        stdAges [3] = 14;
        stdAges [4] = 10;
        stdAges [5] = 12;
        stdAges [6] = 12;
        System.out.println(Arrays.toString(stdAges));  //[12, 11, 13, 14, 10, 12, 12]

        //Array'deki herhangi bir elemanı nasıl yazdırabiliriz?
        System.out.println(stdAges[4]);  //10

        //Example 1 : Array'deki en küçük ve en büyük elemanın toplamını ekrana yazdırınız

       Arrays.sort(stdAges);  //sort methodu küçükten büyüğe dizer
        System.out.println(Arrays.toString(stdAges));
        int ilk = stdAges[0];                   //ilk index
        int son = stdAges [stdAges.length-1];  //son index  //"length()" String'lerde kullanılır, "length" Array'lerde kullanılır.
        System.out.println(ilk+son);  //24


        //Example 2 : stdAges Array'i içindeki tüm elemanların toplamını ekrana yazdıran kodu yazınız

           //1.YOL : for-loop
        int sum = 0;
        for (int i = 0; i< stdAges.length ; i++){   //arrayler index kullandığı için index ler 0 dan başladığı için başlangıcı 0 yaptık.

            sum = sum + stdAges[i];
        }
        System.out.println(sum);

           //2.YOL : while
        int i =0;
        int top = 0;
        while (i<stdAges.length){

            top = top + stdAges[i];

            i++;
        }
        System.out.println(top);

           //3.YOL :do-while
         int k =0;
         int s =0;
        do {
            s=s+stdAges[k];
            k++;

        }while(k<stdAges.length); //while içine şart yazılır

        System.out.println(s);

           //4.YOLL : for each loop -en gelişmiş loop'tur.en tercih edilen loop'tur.
        // Array'lerde ve Collections'larda kullanılır.
        //Arrays varsa for-each kullanılı (?)
        int t = 0;

        for (int w :stdAges){     // parantez içine ilk olarak elemanların data tipi yazılır. en son kısma array ismi yazılır
        t = t+ w;
        }
        System.out.println(t);

        //Example 3 : String bir array oluşturunuz
        //            bu Array'e 5 tane isim yerleştiriniz
        //            Bu isimlerdeki karakter sayılarının toplamını ekrana yazdırınız

        String isim[] = new String[5];
        isim[0] = "Ayşe";
        isim[1] = "Fatma";
        isim[2] = "Mehmet";
        isim[3] = "Ahmet";
        isim[4] = "Ali";

        int toplam = 0;

        for (String w :isim){

            toplam = toplam + w.length();
        }
        System.out.println(toplam);


        //Example 4 :Char bir Array oluşturunuz
        //          bu array e 5 eleman ekleyiniz
        //          bu array deki sadece büyük harfleri ekrana yazdırınız.

        char ch [] = {'A', 'c', 'D', 'k', 'm'};

        for (char w : ch){

            if (w>= 'A' && w<='Z'){
                System.out.print(w);
            }

        }

    }

}
