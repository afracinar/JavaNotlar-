package day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    /*

    NOTE:Biz bir class oluşturduğumuzda Java bu class'tan obje oluşturacağımızı bildiği için bize otomatik olarak constructor'ı verir

       1)Class oluşturduğumuzda Java otomatik olarak bize görünmez bir constructor verir,çünkü Java,Class'ın bir kalıp olduğunu ve Object oluşturmak için,
       yaratıldığını ve Object oluşturmak için constructor'ın şart olduğunu bilir.(class , obje içindir)
       2)Java'nın otomatik olarak oluşturduğu bu görünmez constructor'a "görünmez constructor" (default constructor) denir.
       3)Siz kendiniz herhangi bir constructor oluşturduğunuzda Java "Default Constructor"ı siler.
       4)bir class'ta birden fazla contructor olabilir.Fakat bu constructor'ların parametreleri farklı olmalıdır.
       5)"this" keyword "Bu Class" anlamındadır."this.price" demek "Bu class'taki price isimli variable" demektir.
          "this.price" syntax'i constructor'ların içinde kullanılmaktadır.
       6)Constructor kullanarak variable'lar üzerinde yaptığımız değişiklikler sadece object üzerindeki variable değerlerini değiştirir
         Class üzerindeki variable değerlerini değiştiremez.

   */
    /*
         HondaAccord Class'ının içinde price,year,make,model variable'ları var.Biz constructor oluşturduğumuzda bu class'tan obje oluşturmuş oluyoruz.
         Obje Class'ın kopyasıdır.obje deki her şey class'tan gelir.Class'taki her şey Class'a gider. yani class'taki variable'ların hepsi obje de de vardır.
         biz constructor kullandığımızda objedeki değerleri değiştirmiş oluyoruz,class'takiler aynı kalıyor.class'ı bozamayız
         Java constructorların sadece objeyi değiştirmesine izin verir
     */
    //variable oluşturduk ama değer atamadık bunun değeri 0'dır
    public int price; //0
    public int year; //0
    public String make;
    public String model;

    //görünmez olan constructor'ı görünür hale getirdik
    public HondaAccord(){

    }

    //Bir tane class'tan farklı şekillerde consturoctor oluşturabiliriz.
    public HondaAccord(int price){
          this.price=price;  //bu classs'taki price'ı sana vereceğim price'a eşitle.yani verilecek price değerini bu class'taki price'a(0) atar
    }

    public HondaAccord(int price,int year){
                             //burada görünmez "super()" vardır bu bizi bir üst pareentta parametresi boş olan constructor'a götürür
           this.price=price;
           this.year=year;//bu class'taki yılı(0) benim verdiğim değere eşitle.yani sağdaki değeri soldaki class değerine atıyor.
        System.out.println("Honda Accord Constructor");
    }

    public HondaAccord(int price,int year,String make,String model){  //variable isimleri küçük harfle başlar
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;
    }

}
