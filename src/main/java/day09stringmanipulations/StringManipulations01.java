package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*  indexOf()'methodu her zaman int verir.
            indexOf()'un 4 tane kullanımı var:
             i)indexOf(String str) : parantez içine string koyulur
             ii)indexOf(int ch) : parantez içine char konulur.
             iii)indexOf(int ch,int fromIndex) : birinci parametre char,ikinci parametre tam sayı
             iv)indexOf(String str,int fromIndex) : ilk parametree string,ikinci parametre tam sayı

        */

        String str = "Kara kara düşünme Ankara"; //endWith string in neyle bittiğini kontrol ediyor.boolean verir
                                                //startWith string in neyle başladığını kontrol ediyor.boolean verir.

       //indexOf() methodu verilen character veya character'lerin "ilk" görünüşün index'ini verir.
       int idxA1 = str.indexOf("kara");  //indexOf içinde çoklu karakter kullanılırsa ilk görünümdeki ilk harfin index'ini verir.yani "kara" index 5 ten başlıyor
        System.out.println(idxA1);

        //lastIndexOf() methodu verilen character veya character'lerin "son" görünümünün index'ini verir.
       int idxA2 = str.lastIndexOf("kara");  //lastIndexOf() son görünümün ilk karakterinin index'ini verir
        System.out.println(idxA2); //

        String s = "Mississippi";
        int idxI = s.indexOf('i');  //bu method hem char hem string ile kullanılabilir.burada char olan method'u seçtik.char kullanırsak parantez içine çoklu ifade koyamayız
        System.out.println(idxI); //1 verir

        int idxIss1 = s.indexOf("iss"); //Java 'iss' yi bulur.indexOf() "ilk" görünümün "ilk" karakterinin index'ini cerir
        System.out.println(idxIss1);

        int idxIss2 = s.lastIndexOf("iss");  //"son" görünümünün "ilk" karakterinin index'ini verir
        System.out.println(idxIss2);


        //Example 1: Bir String'deki bir karakterin tekrarlı veya tekrarsız olup olmadığını gösteren kodu yazınız.
        //           "Helloooo" ==>   H-->tekrarsız       e-->tekrarsız      l-->tekrarlı       o-->tekrarlı
        //indexOf ile lastIndexOf eşitse tekrarsız,eşit değilse tekrarlıdır.!!

        String t = "Helloooo";

        char c ='H';  //character'i dışarıda değiştirmek daha kolaydır.kodun içinde değiştirmek hoş olmaz.

        if (t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsız");
        }else{
            System.out.println("Tekrarlı");
        }

        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar "character'i"  gectikten sonra istenen character'in
        //ilk gorunumunun indexini return eder.
        int sonuc = u.indexOf("a", 6); // ilk 6 character'den sonra gelen ilk a'nın index'ini verir
        System.out.println(sonuc);//7


        //lastIndexOf() iki parametre ile kullanılırsa ikinci parametrede verilen sayıyı "index" olarak kabul edip en baştan bu indexe kadar olan karakterleri
        //bir kutu içine alır ve lastIndexOf methodu sadece bu kutu içindeki string'de istenen karakterin en son görünümünün index'i için kullanırız
        String m = "Hello everyone";
        int e = m.lastIndexOf("e",7); //lastIndexOf() methodu ilk 7 index'i kutu içine alır kutu içindeki son e nin index'ini verir.
        System.out.println(e); //6


        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.space karakteri olsa bile doludur false verir
        //Eger String'de hic character yoksa isEmpty() "true" return eder, herhangi bir character varsa "false" return eder.boolean verir.
        // length()==0 demek isEmpty() true verir demektir.
        //Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin
        String v = "Java is java";
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu); //false

        //isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.birden çok space kullanılabilir.isEmpty()'den farkı space karakteri içindir.
        String x = "     ";
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);//true

        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);

    }

}
    }