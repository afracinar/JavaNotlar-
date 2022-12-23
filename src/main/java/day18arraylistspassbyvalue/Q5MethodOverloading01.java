package day18arraylistspassbyvalue;

public class Q5MethodOverloading01 {

    public static void main(String[] args) {

        //overloading aşırı yüklenme demek.methodlara yükleniyoruz.
        /*
           Method Overloading nasıl yapılır?
           1)Method isimleri aynı olmalıdır.
           2)Method parametreleri farklı olmalıdır.
               i)Parametre sayıları değiştirilebilir(2-3-.. parametre)
               ii)parametrelerin data type'leri değiştirilebilir
               iii)Parametrelerin yerleri değiştirilebilir (data type'leri farklıysa işe yarar,aynı ise işe yaramaz)
           3)Method ismi+parametreler = Method Signature
             isim ve parametre dışında yani Method Signature dışında ne değiştirirsek değiştirelim java o methodları farklı kabul etmez.
             Mesela accses modifier ı değiştirsek java onu farklı kabul etmez

         */

        add(3,5); //2 tane parametre kullanılmış.Java 2.methodu eler.diğer methodlar arasında en uygunu olan 1. methoddur.Çünkü ikisi de int değerdir
                        //3 ve 4. methodlar için de java int değeri double değer içine otomatik yerleştirebilir(otowiedining) ama tercih etmez
        add(3,5.0); //Java 3.methodu seçer.çünkü ilk parametre int,2.parametre double'dır.Tam eşleşme vardır.

     //   add(3.0,4.0); ==> Java bu nu kullanamaz çünkü double'ı int değere otomatik koyamadığı için hata verir.


    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(double a,int b){
        System.out.println(a+b);
    }
}
