package day25exception;

public class E01 {
    /*
        1)"Exception" (istisnai hata) java'da kodlarımızı çalıştırırken meydana gelen beklenmedik durumlardır.
        2)Exception'lar ile çalışmanın 2 yolu vardır:
          i)try-catch block kullanma ve exception oluşsa bile çalışmayı devam ettirme.
          ii)throw exception kullanarak çalışmayı durdurma(mesela yazdığımız kod gereği bir dosya üzerinden okuma yapmamız gerekiyor ise bu dosymız eğer silinmiş
          ise java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)
          NOTE:try-catch de kkod çalışmaya devam eder,throw exception'da kod çalışmaya devam etmez.
        3)Eğer exception'u handle etmez isek  (sorunu halletmezsek) java çalışmayı durdurur.
        4)try-catch kullanırken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz
        5)try,catch olmaksızın yalnız kullanılamaz.
        6)Eğer yazmış olduğunuz herhangi bir kod satırında problem olabileceğini düşünüyorsanız try-catch block içine koymalısınız.
        7)catch block parantezi içerisinde olması muhtemel exception class ismi yazılır
        8)e.getmessage(),methodunu kullanarak teknik mesajlar elde edebiliriz ==>"/ by zero" teknik mesaj
          System.out.println burada yazmış olduğumuz mesajlar benim teknik olmayan açıklamalarımdır
          e.printStackTrace();bu methodu Exception ile ilgili detaylıca teknik mesaj verir.kod çalışmaya devam eder
          System.err.println(); hata mesajını renkli olarak verir bu sayede konsolda diğer mesajlardan ayırmak için kullanırız
        9)eğer try budy içindeki kod sorunsuz çalışırsa catch blok devreye girmez
     */

    public static void main(String[] args) {

        //1.yol
   //     divide(6,2); //3
     //   divide(0,2); //0
   //     divide(6,0); //exception -->matematikte bir sayı 0 ile bölünemez.


        //2.yol
        divide2(5,0);
    }

    //1.YOL-->tavsiye edilmez.
    //bir developer için tüm matematik kurallarını ezbere bilmek mümkün değildir bu nedenle tavsiye edilmez.
    public static void divide(int a,int b){
        if (b==0){
            System.out.println("Bir sayi sifir ile bolunemez");
        }else{
            System.out.println(a/b);
        }
    }
    //2.YOL-->try-catch kullanarak exception'u handle etmek tavsiye edilir.(halletmek)
    //normalde java hata aldığında çalışmayı durdurur.try-catch sayesinde java hata aldığında çalışmaya devam eder
    public static void divide2(int a,int b){


        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Bölme işleminde bir problem oluştu "+e.getMessage());
        }
          //Java matematik ile ilgili karşılaşılması muhtemel tüm istisnaları(hataları) ArithmeticException class'ına koymuştur.
        //Matematik'teki tüm istisnaları detayları bilmek zorunda değiliz

//atama ve dönüştürme işlemindeki hatalar için oluşan özel durumlarda arithmetic exception verilir.


    }
}
