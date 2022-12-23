package day23inheritancepolymorphism;

public class Cat extends Mammal{

    //parent class'ta uygulamasını beğenmediğimiz methodun uygulamasını değiştirip kullanmaya "overriding" denir.
    // yani "hayvanlar yer" yerine "kediler yer" demek lazım

    public void moew(){     //method oluşturduk
        System.out.println("Cats meow..");
    }

    @Override  //override annotation.(hangi parent'tan override yapıldığını anlamamız için yandaki mavi yuvarlağa tıklrız bu bizi parent'a götürür
    public void eat() {   //parent'taki eat methodunu aldık ve değiştirdik.override var.animals'daki eat methodu aynı!!
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }
    //aşağıdaki method "Overriding" method olarak adlandırılır
    @Override
    public Animal create() {
        return new Mammal();
    }
    /*
    @Override annotation'ını kullanarak Java'nın yaptığı override işlemini kontrol etmesini sağlarız.
    Parent class a konulan methodlar genel methodlardır.Bütün child class'lara konulacak şekilde uyarlanır.Ancak bazı Child Class'lar özel uygulama ister.
    Bazen Parent class'taki genel methodu özelleştirip child class'ta kullanmak gerekir.Bu işleme "Overrid" denir

       1)Override yaparken "methodun buddy"si değiştirilir.(method signiture'a dokunulamaz)
       2)override yaparken ASLA "method signiture" değştirilemez.(yani isim ve parametre kısmına dokunulmaz,aynı kalır)
       3)override yaparken "interitance" olmak zorundadır.override yapmanın ön şartı "inheritance" ın olmasıdır.(parent-child ilişkisi )
       4)override yaparken "access modifier"lar belli kurallara göre farklılaştırılabilirler.
             i)"private"methodlar override edilemezler.
        **** ii)"Child" class'daki "override edilen" methodun access modifier'ı parent class'taki methodun access modifier'ı ile aynı veya geniş olmalıdır
             NOTE:Child class'daki methodun access modifier'ı daha dar olamaz
             ii)"default" methodlar aynı package içindeyse override edilebilirler.Farklı package'dan override edilemezler.
       5)parent class'taki methodun return type'ı "void" ise return type değiştirilemez.Yani "void"den başka bir şey yazılamaz.
       6)parent class'taki methodun return type'ı "primitive" ise return type değiştirilemez.(aynısı olmalıdır)
       7)parent class'daki methodun return type'ı "wrapper class" ise return type değiştirilemez
       8)parent class'daki methodun return type'ı "Parent class" ise return type child'lardan biri olabilir
         NOTE:child class'taki return type parent class'takinden geniş olamaz.
       NOTE: Aralarında parent-child ilişkisi olmayan class'lar overriding'de return type değişiminde kullanılamazlar.mesela "Short" "Integer"dan küçüktür
            fakar aralarında parent-child ilişkisi olmadığında "Integer" yerine "Short" kullanamazsınız
       NOTE:Child'daki methodun "return type"ından parenttaki methodun "return type"ına gidişte "IS-A" Relationship olmalı.
       note:Aralarında "IS-A" relationship olan data type'lara "covariant" denir
        9)Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
                     HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
        10)"final"methodlar override edilemezler,çünkü overriding'de method buddy değiştirilir ancak "final" method,buddy değiştirilmesine müsade etmez
        11)Polymorphism (çoklu yapı) = Overloading + Overriding
          Note:Polymorphism nedir derlerse overloading ve overriding'i anlatın
     ***12)overloading ile overriding arasındaki farklar nelerdir?
           i)overloading için "inheritance" gerekmez fakat overriding için "ınheritance" gerekir. (overloading tek class içinde olur bu yüzden parent-child gerekmez
           ii)"private methodlar" overload edilebilir.override edilemezler
           iii)final methodlar overload edilebilir,override edilemezler
           iv)overloading static polymorphism olarak,overriding dinamic polymorphism olarak adlandırılır.çünkü "static" methodlar overload edilebilir,override edilemezler
           v)overloading de method signiture değişir ama overriding method signure a dokunulamaz
     */
}
