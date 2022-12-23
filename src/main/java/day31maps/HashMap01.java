package day31maps;

import java.util.*;

/* SÖZLÜK ÖRNEĞİ
  Eğer bir data'yı "Cat=Kedi" formatında sözlük yapısında depolamak istiyorsak "Map" kullanırız.Mesela ülke ve nüfuslarında "Map" kullanırız
  Sol taraftaki kısma "Key,sağ taraftaki kısma "Value" denir.Map'ler "key-value" yapısını kullanır
  Map'lerde "key" kısmı unique olur yani tekrarsızdır.Mesela sözlükte "Cat" kelimesini gördükten sonra bir daha görmeyiz
  Map'lerde "value" kısmı tekrarlı data içerebilir.Mesela "Cat" Kedi'dir ama başka bir ing kelimenin anlamı da Kedi olabilir
  Map'lerde "Key" kısmında null tekrarsız olarak kullanılır.Ama "Value"lerde null'ı birçok kere kullanmak mümkündür.
  Map'ın yapısına EntrySet'i vardır ==> Cat=Kedi ==> bu ifade EntrySet'tir
  Map'teki EntrySet'ler unique'dir.çünkü Key'ler unique'dir
  HashMap'ler entryset'leri sıralamakla uğraşmazlar,rastgele depolarlar.HashMap'ler bu yüzden superfast'tir,çok hızlıdırlar
  EntrySet'leri put() methoduyla ekleriz (Array'lerde add() methodu ile)
    1)Map'ler key-value structure kullanir
    2)Key'ler unique'dir,tekrarsızdır
    3)Value'lar tekrarli data icerebilir.(non unique)
    4)Map'lerde eleman degil "EntrySet" kullaniriz.
    5)Key'ler de null tekrarsız olarak kullanılır(aynı key den birden çok kullanırsak en son girilen entryset'in value'sini yazdırır
    6)Value'lar null kabul eder.
    7)HashMap'ler EntrySet'leri herhangi bir siralamaya tabi tutmaz, rastgele siralar
    8)Siralama ile vakit kaybetmedigi icin HashMap'ler cok hizli calisirlar.
 */
    public class HashMap01 {

        public static void main(String[] args) {

            HashMap<String, Integer> studentAges = new HashMap<>(); //data type'ı primitive olamaz
            studentAges.put("Ali", 13); //{Ali=13} ==> collection'larda köşeli parantez kullanılırdı,map'lerde süsülü parantez ile yazdırır
            studentAges.put("Tom", 21);
            studentAges.put("Brad", 12);
            studentAges.put("Ajda", 76);
            studentAges.put("Cuneyt", 75);
            studentAges.put("Ali", 88);//Ayni key degerini tekrar kullandiginizda hata vermez "overwrite"(üstüne yazma) yapar.değer kısmını değiştirir son girilen yapar
            studentAges.put(null, 55);
            studentAges.put(null, 66); //key'lerde null tekrarsız olarak kullanılır,bu yüzden value değerini değiştirir 66 yapar
            studentAges.put("Ayhan Isik", null);
            studentAges.put("Sadri Alisik", null);
            System.out.println(studentAges); // {null=66, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

            //Map'den sadece key'ler nasil alinir?
            Set<String> keys = studentAges.keySet();
            System.out.println(keys);//[null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

            //Map'den sadece value'lar nasil alinir
            Collection<Integer> values = studentAges.values(); //values() methodu Collection veriyor.methoda gir oku
            System.out.println(values);//[66, null, null, 21, 76, 12, 75, 88]

            //Belli bir key'e ait value nasil alinir?
            Integer cuneytAge = studentAges.get("Cuneyt");
            System.out.println(cuneytAge);// 75

            //Example 1: Tum integer yaslarin ortalamasini hesaplayan kodu yaziniz.(null'ları hesaplama)
            Collection<Integer> ages = studentAges.values(); //collectionlarda for-each loop kullanılır
            int sum =0;
            double counter =0;
            for (Integer w :ages){
                if (w!=null){
                    sum=sum+w;
                    counter++;
                }
            }
            System.out.println("Ortalama yaş = "+(sum/counter)); //56.333333333333336

            //Example 2:A ile başlamayan isimlerin içerdiği toplam karakter sayısını bulan kodu yazınız

            Set<String> names = studentAges.keySet();
            int sum1 =0;
            for (String w : names){
                if (w!=null && !w.startsWith("A")){

                    sum1 = sum1 + w.length();

                    }
                }
            System.out.println(sum1); //25

            //remove methodu verilen key ve valuo yu silerse true,silemezse false verir.Mesela valuo 75 girseydik bulamayacağı için silemezdi ve false verirdi
            //remove("Ajda",76) key'si Ajda ve value'si 76 olan EntrySet'i siler ve size boolean  return eder.silerse true,silmezse false return eder.
            boolean sonuc =studentAges.remove("Ajda",76);
            System.out.println(sonuc);//true

            Integer sonuc2 = studentAges.remove(null);//null olanı sil--key kısmında bir tane null olur
            System.out.println(sonuc2); //66 ==>Silinen değerin value'sini return eder

            //Key varsa value'yu ver ,key yoksa sizin istediğiniz değeri verir
           Integer sonuc3 = studentAges.getOrDefault("Brad",0); //getOrDefault methodu varsa var olan değeri verir,yoksa bizim belirttiğimiz değeri verir
            System.out.println(sonuc3); //12==> Brad'in değerini verdi.eğer ke y olmasaydı 0 değerini verirdi.

            //Value null ise ekleme yapar,value null değilse ekleme yapmaz.
            Integer sonuc4 =studentAges.putIfAbsent("Brad",100); //putIfAbsent (ekle eğer yoksa)
            System.out.println(sonuc4); //12 ==>çünkü Brad key'inin value'si 12 olduğundan 12 verdi.Brad'in value'si null olmadığından değiştirmedi
            Integer sonuc5 = studentAges.putIfAbsent("Ayhan Isik",100);
            System.out.println(sonuc5); //null ==>ilk başta var olan değeri döndürüyor
            System.out.println(studentAges); //{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

            //Key yoksa ekleme yapar
            Integer sonuc6 =studentAges.putIfAbsent("Acun Ilicali",200); //putIfAbsent (ekle eğer yoksa)
            System.out.println(sonuc6); //null
            System.out.println(studentAges); //{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=200, Ali=88}

            //replace() methodu value ları değiştirmek için kullanılır
            studentAges.replace("Brad",50);
            System.out.println(studentAges); //{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=50, Cuneyt=75, Acun Ilicali=200, Ali=88}

            //replace() methodu value'ları,key ve value^yi kontrol ettikten sonra değiştirdi
            studentAges.replace("Brad",50,56); //Brad'in yaşı 50ise 56 ile değiştir
            System.out.println(studentAges); //{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=56, Cuneyt=75, Acun Ilicali=200, Ali=88}

            //Example 3: Map'teki her bir Entry'i ekrana farklı bir satırdı olacak şekilde yazdırınız.

           Set<Map.Entry<String,Integer>> entries = studentAges.entrySet(); //entrySet() her bir eleman demek
            for (Map.Entry<String,Integer> w :entries){ //loop'lar Collectionlarda kullanılır
                System.out.println(w);
            }




            }



        }


