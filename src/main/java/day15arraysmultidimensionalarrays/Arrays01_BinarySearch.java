package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01_BinarySearch {

    public static void main(String[] args) {

        //binarySearch() Methodu: Bu method'u kullanarak bir elemanın Array'de olup olmadığını anlarız.
        //                       binarySearch() Methodu'nu kullanmadan önce mutlaka Arrays.sort() kullanılmalıdır
        //                       binarySearch() Methodu'u aradığınız eleman Array'de varsa o elemanın indexini return eder
        // aradığımız eleman Array'de yoksa-a şeklinde negatif sayı alırız.Bu sayıdaki - işaretinin anlamı "bu eleman Array'de yok" demektir.
        //"a"nın anlamı ise "olsaydı kaçıncı sırada olurdu"demektir
        //binarySearch methodu tekrarlanan elemanlar için kullanılmaz.


        int arr[] = {12, 31, 43, 14};

        int sayi1 = 43;   //genelde ana koda dokunulmaz değiştirilmesi gereken şeyler variable içine konur.

        Arrays.sort(arr);  // [12 , 14 , 31 , 43]
        Arrays.binarySearch( arr  , sayi1  ) ;//binarySearch iki parametre ile kullanılır.ilk kısma array ismi diğer kısma araştıracağımız sayıyı yazıyoruz
                                             //sorttan sonraki oluşan array'deki indexi verir yani 3 verir

        int idx1 = Arrays.binarySearch(arr,sayi1);
        System.out.println(idx1);  //3

       //binarySearch() Methodu aradığımız eleman eğer Array'de yoksa ?
        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc); //-5 --> (-) olmasının sebei olmadığını gösteriyor.olsaydı eğer hangi sırada olacağını gösteriyor.yani 58 olsaydı 5. "sırada" olacaktı



    }

}
