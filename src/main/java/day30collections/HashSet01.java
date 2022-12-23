package day30collections;

import java.util.HashSet;

public class HashSet01 { //set__tekrarlı olmayan çoklu data'ları depolamak için kullanılır.hash_bir tekniktir birbirine benzemeyen code üretmeye yarar.

    /*
         Hash bir tekniktir,birbirine benzemeyen code'lar üretir,bu code'lar data'yı unique yapar
         Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız(öğrenci numaraları gibi

         HashSet'ler eklenen elemanların sıralaması ile uğraşmaz.Sıralamayla alakalı zaman harcamaz bu yüzden hızlı çalışır
         HashSet'ler index kullanmazlar.Sıralamayı kafasına göre yapıyor bu yüzden index kullanması zaten anlamsızdır.
         HashSetler:
            1)tekrarsiz elemanlarda
            2)sırlama onemli degilse
            3)hız cok önemliyse
            4)İndeks kullanmazlar
        mesela kimlik numaralarını depolamada sıralama önemli değildir.hız önemlidir
     */

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>(); //boş bir set oluşturduk
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails); //[Apple, Fig, Mango, Apricot, Orange] == random order (rastgele) sıraladı
        //set'ler çoklu ama tekrarsız data'ları depolamak için kullanılır.

        //var olan elemanı eklerseniz hata vermez.Son ekleneni varolan data'nın üstüne yazar(OverWrite _ üstüne yazma)
        emails.add("Mango");
        System.out.println(emails); //[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        System.out.println(emails); //[null, Apple, Fig, Mango, Apricot, Orange]
        emails.add(null);
        System.out.println(emails); //[null, Apple, Fig, Mango, Apricot, Orange]


    }


    }


