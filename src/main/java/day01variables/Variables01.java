package day01variables;

import java.security.KeyStore;

public class Variables01 {
                                     //variable nasıl oluşturulur?

    //1) Access Modifier  2)Data type  3)Variable ismi  4)=     5)Değer  6);

    // Java da ";" ingilizcedeki "." gibidir. Javada cümle bitince ";" konulur
    // ingilizcede "cümle" deriz Java'da "statement" deriz.yani statement sonuna ; konulur
    // = sembolu assignment (atama) operator olarak adlandırılır. sağdaki değeri soldakinin içine koyar

    public int age = 13;
    public int height = 183;

                                    // Java'da data type'leri
    /*
                                      Primitive Data Types
    1)int:Integer'ın kısaltmasıdır. integer tamsayı demektir. "int" 32 bit kullanır. 32 bit = 4 byte
          Matematikte tamsayıların başı ve sonu yoktur.Fakat Java'da tamsayıların başı ve sonu vardır.
          En küçük int= -2,147,483,648
          En büyük int= 2,147,483,647 'dir.Nedeni memory de çok yer kaplamaması içindir.

     2)Byte: tamsayılar için kullanılır.Byte'lar memory'de daha az yer kaplar."Byte" yetiyorsa "int" kullanmamalıyız
             8 bit kullanır
              En küçük byte: -128
              En büyük byte: 127

      3)Short:Tamsayılar içindir.Örneğin sitede yaşayan insan sayısı için kullanılır.16 bit kullanır
              En küçük short = -32768
              En büyük short = 32767

      4)Long:Tamsayılar içindir.Mesela dünya nüfusu için."int" yetmez."int" yetmediği yerde "long" kullanılır.
             64 bit kullanır
             En küçük long = -9,223,372,036,854,755,808
             En büyük long = 9,223,372,036,854,755,807

      5)Float:Virgüllü,ondalıklı sayılar içindir.örnek fiyatlar için.Memory'de 32 bit yer kaplar.
              "float" virgülden sonra 7 basamak içerebilir.
              "float"değerlerinde sona "f" veya "F" konulması gerekir.bundan float çok tercih edilmez.'doable'tercih

       6)Doable:Ondalıklı sayılar içindir. hassas bilimsel veriler için kullanılması tavsiye edilir.
                64bit yer kaplar
                sonuna "f" "F" konulması gerekmez
                "doable" virgülden sonra 16 basamak içerir.

        7)Boolean:'true-false' değerleri için kullanılır.sadece 2 değeri olduğundan 1 bit yer kaplar.

        8)char: Tek karakterler için kullanılır.16 bit kullanılır
                A , c ,2 , ?, - ,
                Note: "char"lara değer verirken değeri tek tırnak ('') arasına koyun yoksa hata verir

          Note:Java büyük harf ve küçük harflere duyarlıdır.Java için "True" ile "true" tamamen farklıdır.
          Note:Numeric Data Types : Byte < short < int < long < float < double
               Numeric olmayan data type : boolean - char

                                 Non-Primitive Data Types
        1)String: isim ,adres ,kimlik numarası gibi bir veya daha fazla karakter içeren değerlerde kullanılır
                  String değeri mutlaka " " (çift tırnak) arasına konulmalıdır.
                  String non-primitive'dir.Yani bir String oluşturduğunuzda Java size bir sürü method verir

                  Primitive ile Non-Primitive farkları nelerdir ?
               1)Non-Primitive data type'lerinde değerin yanında metod'lar vardır. Değer+method
                 Primitive data type'lerinde ise sadece değer vardır,method yoktur
               2)Primitive data type'leri Java tarafından oluşturulmuştur,toplam 8 tanedir (yukarıda sayıldı).
                 Biz primitive data oluşturmayız.
                 Non-primitive data type'leri Java tarafından da oluşturulmuştur,biz de oluşturabiliriz
                 Non primitive'ler sayılamayack kadar çoktur.her developer Non-primitive data type oluşturabilir.
                 class oluşturmak non-primitive data oluşturmak demektir
               3)Primitive data type isimleri küçük harf ile başlar (long-short-int-byte..)
                 Non-Primitive data type isimleri büyük harfle başlar (String..)Nedeni:Bütün class'lar aynı zamanda
                 Non-primitive'dir.class lar büyük harfle başlar,class lar aynı zamanda data type olduğu için.
               4)Primitive data type'lar memory'de farklı büyüklükte yerler kullanır.(long-64bit,float-32bit..)
                 Non-Primitive data type'ler memory'de aynı büyüklükte yer kaplarlar.

    */
    public byte price = 12;
    public short populationOfVillage = 2300;
    public float priceOfShirt  = 13.99F;
    public double wqightOfCell = 0.00012045;

    // Siz "long" demenize rağmen Java verilen sayıyı "int" kabul eder.
    //Bu yüzde long bir variable'a "int" aralığı dışında bir sayı verirsek sonuna "L" veya "l" koyunuz.
    public long populationOfWorld = 7000000000L;

    // Burada " L" koymadığımız halde problem olmaz çünkü "1234" int aralığına uyar.
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name = "Tom Hanks";

    //Note: main method arabanın motoru gibidir. "main method" olmadan hiçbir şey çalışmaz.
    public static void main(String[] args) {

        String a = "123456";
        int b = 123456;
        System.out.println(a.equals(b)); //false

        String c ="123456";
        String d = "123456";
        System.out.println(c==d); //true -->stringlerde "==" kullanılabilir.ama "equals()" kullanılması tercih edilir.



    }
    }





