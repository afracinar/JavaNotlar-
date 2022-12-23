package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: [0, 2, -3, 0, 12, 0] sıfırları en sona koyunuz.(interwiev sorusu)
        //           [2, -3, 12, 0, 0, 0]

        int orginal[] ={0, 2, -3, 0, 12, 0};
        int yeni[]= new int[orginal.length];  //önce yeni bir Array oluşturulmalı ve yeni Array'in eleman sayısı orijinal Array ile aynı olmalı.

        int idx=0;  //yeni array için indexe ihtiyacımız var

        for (int i=0 ; i<orginal.length ; i++){  //loop original array için oluşturuldu.index 0'dan başlayacağı için i=0 dedik

            if (orginal[i]!=0){    //original içindeki eleman 0 değilse
                yeni[idx] = orginal[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));


        //Example 2: Bir Array'in içinde herhangi bir elemanın olup olmadını kontrol eden ve kaç kere tekrarlandığını gösteren  kodu yazınız.
        //           [2, 1, 2, -3, 2] ==> Kullanıcı 2 yi sordu ==> 2 elemanı var ve 3 kere tekrarlandı..
        //                            ==> Kullanıcı 6 yi sordu ==> 6 elemanı yok ve 0 kere tekrarlandı..

        int arr []={2, 1, 2, -3, 2};
        int eleman = -3;
        int counter =0;  //counter-sayıcı demek
        for(int w : arr){  //Elimizde Array olduğu için foreach loop kullandık

            if (w==eleman){
                counter++; //counter saydır demek

            }

        }
        if (counter>0){
            System.out.println(eleman + " Array'de " + counter + " defa var");
        }else{
            System.out.println(eleman + " Array' de yok ");
        }

        //Example 3:Size verilen bir cümledeki en uzun kelimeyi bulan kodu yazınız.
        //         "Java kolaydır çalışana, ne kolay ki çalışmayana ==> çalışmayana

        String sentence = "Javaaaaaaaaa kolaydır çalışana, ne kolay ki çalışmayana.";
        System.out.println(sentence);

        sentence = sentence.replaceAll("\\p{Punct}",""); //noktalama işaretlerinden kurtulduk
        System.out.println(sentence);

        String words [] = sentence.split(" ");  //split methodu array verir

        Arrays.sort(words, Comparator.comparingInt(String::length));  //compar-karşılaştır demek comparator-karşılaştırıcı demek.String'lerin uzunluklarına göre karşılaştır

        System.out.println(Arrays.toString(words)); //burda uzunlukları azdan çoğa doğru sıraladı

        System.out.println(words[words.length-1]); //en uzun olan en sonda olduğu için son indexi aldık


    }

}
