package day29abstractioncollections;

public interface Engine extends Vehicle {

  //interface'deki variable'lar:public-static-final'dır
  //interface içine variable konulabilir.interface içindeki bütün variable'ler otomatik olarak(default) "public"tir.diğer access modifier'lar hata verir

  //interface içindeki bütün variable'ler otomatik olarak "final"dır.değer atanması zorunludur.Atanmazsa hata verir.variable'lar değiştirilemez
 //interface içindeki bütün variable'ler otomatik olarak "static"tir.static olan bir şeye interface'in ismi ile ulaşılabilir.obje oluşturmaya gerek yok

  //child      Parent
 //Class ---> Interface ==> implements
//Class --->   Class == extends
//Interface ---> Interface ==> extends
//Interface ---> Class ==> mümkün değil!!!! bir class bir interface'in parent'ı olamaz
  int price=2000;
  double weight = 23.5;

    void run();

}
