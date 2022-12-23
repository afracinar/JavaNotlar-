package day22inheritancepolymorphism;

public class Runner {

    //Runner class içinde "main method" olan class'tır.
    //Inheritance'da data tipine bakarak variable'ı seçer.
    //bir class tan obje oluştururken data tipi kendisinden de seçilebilir parent'ından da seçilebilir
    //Her Class data tipidir.Ancak her data tipi class değildir.data tipi ile class aynı anlamda kullanılır

    /*
    Inheritance'da variable'lar seçilirken Java "objenin data type"ına bakar
    Öncelikle istediğiniz variable'ı Object'in data type'ı olan Class'da arar.
    O Class'da bulamazsa Parent Class'lara bakar
    Hiçbir parent class'da bulamazsa hata verir
     */

    public static void main(String[] args) {

        Cat cat1 = new Cat();  //Cat objesi oluşturduk (data type'ı Cat )
        System.out.println(cat1.a); //14 ==> Data tipine bakarak variable'ını seçer.
        System.out.println(cat1.b); //34 ==> cat class'ının kendisinde b variable'ı olmadığı için parent'a gidip oraya bakar.
        System.out.println(cat1.c); //45 ==> data type'a bakacak , data type "Cat".Cat class'ında c yi arayacak
                                           // cat class'ında c variable olmadığı için parent'ı Mammal'a gider,orada da olmadığı için bir üst parent'a gider


//data type:Mammal        cat objesi
        Mammal cat2 = new Cat(); //Cat class'ına gidip Mammal'ı parents yaptık.Yani parents'ı kullandık.Mammal'ı parent yapmadan obje olşturursak hata verir
        System.out.println(cat2.a); //13==> Data tipi "Mammal" olduğu için Mamaal'daki sonucu verir

        Animal cat3 = new Cat(); //Mammal class'a gidip Mammals'ı Animal'ın child'ı yaptık
        System.out.println(cat3.a); //12  ==> Data tipi "Animal" olduğu için Animal'daki değeri verir

        //NOTE:Obje oluşturulurken data type'ı direk class'ın kendisinden de seçilebilir,parent'tan da seçilebilir,parent'ın parent'ını da kullanabiliriz.


        //Object oluştururken object'in data type'ı Child Class'lardan seçilemez yani "Cat cat5 = new Mammal();" yapamayız

        //Inheritance da methodlar seçilirken Java "Constructor'a" bakar. (örn:"Cat()" , "Mammal()" , "Animal()" bunlar constructor)
        //Öncelikle istediğiniz methodu Constroctor'ı kullanılan Class'tan alır.
        //O Class'ta bulamazsa Parent Class'lara bakar
        //Hiçbir yerde o methodu bulamazsa hata verir
        Cat cat4 = new Cat();
        cat4.eat(); //Cat eat..
        cat4.drink(); //Mammal drink..==>Java ilk olarak Constroctor a bak (Cat()) burada method olmazsa parent'a bakar orada varsa onu yazdırır
        //NOTE:Bir methodun kendisi ekrana bir şey yazdırıyorsaonu "sout" içine koyamayız.method direk ekrana yazdırı.


        Mammal cat5 = new Mammal();
        cat5.eat(); //Mammal eat.. ==>constructor Mammal() olduğu için Mammal class'taki method çalışır.

        Animal cat6 = new Animal();
        cat6.eat(); //Animal eat..

        //NOTE:Inheritance da methodlar seçilirken Java "Constructor'a" bakar,variable'lar seçilirken Java "objenin data type"ına bakar

    }
}
