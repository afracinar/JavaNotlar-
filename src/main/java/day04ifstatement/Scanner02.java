package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
    Not 1: char variable ları matematiksel işlemlerde kullanırsanız java onların ASCII değerlerini kullanır
          örneğin; System.out.prtintln('A' + 'C') ekrana AC yerine 132 yazdırır.
    Not 2: Java da '+' sembolünün 2 anlamı vardır. i)toplama işlemi ii)birleştirme işlemi (Concatenation)
           Java '+' sembolü görünce önce toplama yapmaya çalışır,yapamazsa birleştirme işlemi yapmaya çalışır.oda olmazsa
           başka ihtimal kalmadığı için hata verir.Birleştirmenin sonucu her zaman string çıkar.
     */

    public static void main(String[] args) {

        //Example 1:Kullanıcıdan ilk ve soy ismini alınız,ilk ve soy ismin ilk harflerini ekrana yazdırınız.
                   //Ali Can==>AC

        Scanner input = new Scanner(System.in);  //bu kod scanner class tan obje oluşturmak için

        //1.YOL
        System.out.println("İlk isminizi giriniz...");
        char ilk = input.next().charAt(0);  //java stringlerde her karaktere index verir.İlk harfin index'i 0'dır.

        System.out.println("Soy isminizi giriniz..");
        char soy = input.next().charAt(0);

        System.out.println("" + ilk + soy); //Matematiksel ifade varsa Java ilk önce ASCII değerleri toplar.
                                            //AC olarak görmek için başa "" boş string konulur."" ifadesinden sonra java birleştirme yapar.


        //2.YOL
        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine(); //Ali Can A nın index'i 0 C'nin index'i 4
        char ilkHarf = tamIsim.charAt(0);
        System.out.println(ilkHarf);  //ASCII değeri yazdırmaz çünkü matematiksel ifade yok //ln silinirse AC'yi ayrı satırlarda vermez

    }
}
