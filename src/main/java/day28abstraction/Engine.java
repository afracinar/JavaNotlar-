package day28abstraction;

/*
ABSTRACT vs INTERFACE
   1) Abstract :
    1.1 - Class`dir.
    1.2 - Abstract ve concrete method`lar konabilir.
    1.3 - Kismi olarak abstraction saglar.
    1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
    1.5 - Hiz acisindan avantajlidir
    1.6 - Icindeki tum nesnelerin public olmasi zorunlu degildir.
    1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
    1.8 - Abstract class constructor`a sahiptir

   2) Interface :
   2.1 - Class degildir.
   2.2 - Sadece abstract method`lar konabilir.
   2.3 - Tam abstraction (soyutluk) saglar
   2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
   2.5 - Hiz acisindan abstract class`a gore yavastir.
   2.6 - Icindeki tum nesnelerin public olmasi gerekir.
   2.7 - Method'lar static olamaz
   2.8 - Abstract class constructor`a sahiptir    */


public interface Engine { //engine= motor

    /*
    NOTE:Java interfac' e neden ihtiyaç duydu? çünkü class'lar multiple inheritance'ye müsaade etmiyor.bazen multiple inheritance ihtiyaç hissedebiliriz
         bu yüzden interface yapısı oluşturulmuştur
    1) Atomik olsun diye "parent"ı parçaladık ama bir "Child Class"ın birden fazla "parent"ı oldu,bu ise Java'da mümkün değildir.
     Çünkü Java "Multiple Inheritance"ı desteklemez

       "Multiple Inheritance" class'lar için mümkün değildir fakat Java "interface" isimli yeni bir yapı oluşturdu(class olmayan),
       bu yapı da "multiple inheritance"a müsaade etti."Honda Parent Class"ı parçaladık (Engine-Ac-Hood) olarak.Bu yüzden "Honda" class'ı sildik

    2)Interface'lerdeki tüm methodlar "abstract" olduğu için "interface"lere "fully abstraction"(tam abstract) denir
      "Abstract Class'larda abstract method ve concrete method bir arada kullanıldığı için "Abstract Class" lara "fully abstraction" denmez.(yarım abstract
     */

    //Eğer bir method abstract ise child'lar için kullanılması mecburidir
    //interface'lerdeki tüm methodlar "abstract" olmak zorundadır,istisnaları vardır:"default-static" keyword ile kullanılabilir

    //interface'lerde abstract method oluştururken "abstract" keyword kullanmaya gerek yoktur.çünkü java o methodun "abstract" olduğunu bilir
    //interface'lerdeki methodlar Java tarafından otomatik olarak "public"tir.Bu yüzden "public" yazmaya gerek yoktur.

    //"public abstract void eco();" ile "void eco();" aynı anlama gelir
    public void eco();  //bu methodlar abstract olduğu için child class'lar tarafından override edilerek kullanılmak zorundadır

    void gas();

    void tsi();

  //!!!interfacelerin içinde concreate method oluşturursak ya "default" ya "static" keyword'u kullanırız
    //default keyword kullanarak interface'lerin içinde budy'si olan methodlar üretebilirsiniz.(non-static methoddur.objelere yapıştırılır.)
    public default int add(int a,int b){
        return a+b;
    }

  //"static" keyword kullanarak interface'lerin içinde budy'si olan methodlar üretebilirsiniz.(static methodlar classa yapıştırılır.class'tan çağırırız)
    public static String update(String str) {
        return str+ "!";

        //concreat method'ları override etmeye gerek yoktur.override abstract methodlar'da uygulanır
    }
}


