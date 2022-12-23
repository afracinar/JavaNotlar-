package day16multidimensionalarraysarrayllist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        /*
        Note:ArrayList'ler aynı data type'ine sahip birden fazla datayı depolamak için kullanılır.
           Array ile ArrayList'in farkı nedir? (interwiev sorusu)
           1)Array oluşturulurken Array'in içine kaç eleman koymamız gerektiğini söylemeliyiz ve söylediğimiz eleman sayısından fazla eleman koyamayız
             Array'ler eleman sayısında "fixed"tirler.(bu dezavantajdır)
             ArrayList'leri oluştururken eleman sayısını söylemeye gerek yok, çünkü ArrayList'ler eleman sayısında "flexible"(esnek)'dırlar.
             0 elemanda koyabiliriz,sınırsız eleman da koyabiliriz

           2)Array'lerin içine "primitive" ve "reference(adres)"lar konulabilir.Non-primitive konulamaz
             ArrayList'lerin içine ise sadece "non-primitive"ler konulur.Primitive'ler ile çalışmaz.("int" kullanamayız,"Integer" kullanabilirz

           3)Array'ler super fast, çok hızlı.Array'ler memory'i çok az kullanır,çünkü yapısı basittir.(avantaj)
             NOTE:Eleman sayısı kesin belli olan çoklu datalarda Array tercih etmeliyiz.Eleman sayısı değişken olan çoklu datalar için Array kullanma riskini alma
            Arraylist'ler daha fazla memory kullanır arraylere kıyasla daha yavaş çalışırlar
        */

        //ArrayList nasıl oluşturulu?
          //1.YOL
        ArrayList<Integer> age = new ArrayList<>();
          //2.YOL
        ArrayList<Integer> heights = new ArrayList<>();
          //3.YOL
        List<Integer> nums = new ArrayList<>();


        //3 yol da kullanılabilir daha çok 2 ve 3. yol tercih edilir.3.yol en kısa olduğu için daha çok tercih edilir.

        //ArrayList'ler nasıl yazdırılır?
        System.out.println(nums); //direk yazdırmak yeterli.

        //ArrayList'lere nasıl eleman eklenir? "add"methodu kullanılır.
        // "add" methodu elemanı her zaman en sona ekler.Bir method verdiğimiz elemanı ekleme sırasına göre diziyorsa buna"insertion order" denir.
        //add methodu boolean return eder.true-görev tamam,false-yerleştirilemedi demektir.
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums); // [21,18,20]

        nums.add(1,50); //add(int index,Integer element) methodu ise söylediğimiz index'e söylediğimiz elemanı koyar
        System.out.println(nums); //[21,50,18,20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices);  //addAll(Collection<? Integer>c) methodu ==> bir listi bir list'e ekleyebiliriz demektir.nums list'ine prices list'indekiher şeyi ekledik
        System.out.println(nums); //[21, 50, 18, 20, 23, 185] nums değişti ekleme yaptık

        nums.addAll(2,prices); //2. index'e prices'ı ekledik
        System.out.println(nums); //[21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList'lerin eleman sayısı nasıl bulunur?
        // "size methodu ile bulunur.size methodu eleman sayısı vereceği için int verir
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi); //8
        //Array'lerde eleman sayısını "length" verir,ArrayList'lerde ise "size" verir.Array'in length'i,ArrayList'in size'ı(teknik ifadeler)

        //ArrayList'lerde herhangi bir eleman nasıl seçilir?
        //"get()" methodu ile.
        int eleman1 = nums.get(3);  //3.index'i verir
        System.out.println(eleman1); //185

        //ArrayList'in boş olupolmadığını nasıl anlarız? //isEmpty() methodu boolean verir.boş olursa true boş değilse false verir
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1); //false verir çünkü nums array'i boş değil
        boolean bos2 = age.isEmpty();
        System.out.println(bos2);  //true verir.çünkü yukarıda oluşturduğumus age array'i boş

        //ArrayList'te bir eleman nasıl değiştirilir? "set()" methodu var olan bir değeri değiştirmede kullanılır.index ile çalışır
        nums.set(3,200);  //index 3'deki elemanı 200'e çevirir
        System.out.println(nums); //[21, 50, 23, 200, 18, 20, 23, 185]


        //Example 1: nums ArrayList'indeki tüm tek sayıları 11 arttırdıktan sonra ekrana yazdırınız.
        //for each loop array ve collection larda kullanılır
                       //[21, 50, 23, 200, 18, 20, 23, 185]
        for (int w : nums){

            if (w%2!=0){
                nums.set(nums.indexOf(w),w+11); //örn:21'in index'ini alır bu index 0'dır.index 0 daki değeri 11 arttırır.indexOf methodu her zaman ilk görünümün indexini verir
            }

        }
        System.out.println(nums); //[32, 50, 34, 200, 18, 20, 34, 196]


        //remove methodunun içine tam sayı koyarsak java onu index kabul eder.bundan dolayı tam sayıyı wrapper class'a çevirmemiz lazım
        //Example 2: ArrayList'ten 34 elemanının siliniz
        //NOTE:Tüm tam sayılar aksi söylenmedikçe "primitive" dir yani "int" 'dir.
        //NOTE 2: Primitive'ler ArrayList'lerin içine konamazlar
        //Note 3: Primitive'i wrapper class'a çevirirsek non-primitive olur.Non-primitive'ler ArrayList'lerin elemanı olur,index olmazlar
        Integer sayi =34;
        nums.remove(sayi); //remove ilk görünümü siler
        System.out.println(nums);//[32, 50, 200, 18, 20, 34, 196] 34 'ün ilk görünümünü siler.




    }


}
