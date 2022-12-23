package day29abstractioncollections;

        /*
       "Abstract method"lar sadece ne yapılacağını söyler(what to do).Nasıl yapılacağını söylemez.nasıl yapılacağına child class karar verir
       "Concreat method"lar ne yapılacağı ile birlikte nasıl yapılacağını da söyler (budy kısmında)(how to do)

       "interface"ler bir yapılacak işler listesidir(To do list)aslında interface'lerde child class'lara yapılacak işleri söylüyoruz.
         nasıl yapılacağına karışmayız

         İSTİSNA :: interface lerin içinde "default" ve "static" keyword kullanarak "concreat method" oluşturuabiliriz

       "multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method oluşturursanız bu methodların return type'ları aynı olmalıdır.
       Aksi takdirde hata verir.(void price(); ile int price(); hata verir return type'ları farklı olduğu için java hangisini alacağını bilemez

       interface'lerde constructor olmadığı için interface'lerden obje oluşturamayız.
       "abstract class"larda class oldukları için constructor vardır.Ama constructor'lar abstract class'larda obje oluşturamazlar
     !!!  Java'da interface'lerden ve abtract class'lardan obje oluşturulamaz.

     ***INTERWİEV SORUSU ÇOK ÖENMLİ
     "Abstract class" ile "interface"in farkları nelerdir? (önce method sonra variable sonra parent-child ilişkisi hakkında konuş)
     1)Method
        "Abstract class" hem abstract hem de concreat methodlar içerebilir
        "interface"ler ise sadece abstruct methodlar içerir.
        Ama istersek interface'ler içinde de "default ve static" keyword'ler kullanarak "concreat method"lar oluşturabiliirz
     2)Variable
         "Abstract class"larda normal class'lardaki gibi her türlü variable oluşturulabilir
         "interface"lerde ise variable'lar "public,staic,final" olmak zorundadır
     3)Inheritance İlişkisi
          "Abstract class"lar class oldukları için "multiple inheritance"a müsaade etmezler
          "interface"ler ise "multiple inheritance"ı desteklerler.Zaten varoluş sebebi odur
     4)Object Creation
          "Abstract class"larda consturoctor vardır ama object oluşturmada kullanılmazlar
          "interface"lerde ise constructor olmadığında object oluşturulamaz.

      Soru: Object Oriented Programming Language prensipleri nelerdir? (OOP)
          1)Inheritance
          2)Polymorphism
          3)Encapsulation
          4)Abstraction

     */

public class Civic implements Ac,Engine{ //interface'leri parent yapmak için "implement" koyarız


  //multiple inheritance de methodların budy'si olursa child class ın kafası karışır.Hangi parent'ı dinleyeceğini bilemez
    // ama interface'de budy olmadığı için(çünkü abstract method'a sahiptir)  child class'ın kafası karışmaz

    @Override
    public void run() {
        System.out.println("civic runs well");
    }

    //return type farklı olacaksa aynı method ismini kullanamazsınız,method ismi aynı olamaz



}
