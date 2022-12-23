package day08stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {


        //Example 1: Bir String'deki space hariç kaç tane character kullanıldığını gösteren kodu yazınız.
        //          "Ali okula gitti." ==>14 character
        //replace() methodu herhangi bir karakteri veya karakterleri değiştirmek için kullanılır.çoklu karakter yerine azlı karakter de konulabilir
        String str ="Ali okula gitti.";
       int num = str.replace(" ","").length();   //karakter silmek için replace() kullanıyoruz
        System.out.println(num);

        //Example 2: Bir String'deki tüm 'a' harflerini 'A' ya çeviriniz.
        String s = "Ankara'nın taşına gözlerimin yaşına bak.";
        String ss = s.replace('a' ,'A');
        System.out.println(ss);


        //Example 3: Bir String'deki tüm "kara" kelimelerinin yerine "*" koyunuz.
        String t ="Kara kara düşünme Ankara";
        String yeniT = t.replace("kara","*"); //baştaki Kara yerine * koymazz.çünkü Kara=!kara.
        System.out.println(yeniT);


        //Example 4: Bir String'deki tüm sayıları "*" a çeviriniz.
        String stdId = "AC202117004";
        String yeniStdId = stdId.replaceAll("[0-9]","*"); //replaceAll() kullanmamızınn nedeni tüm sayılarla işlem yapacak olmamız
        System.out.println(yeniStdId);

        /*
            Bir grup data'yı ifade eden kod'lara 'Regex" denir
            "Regex" Regular Expressions'ın kısaltılmış halidir.

            1)tüm rakamları ifade etmek istersek ==> [0-9]
            2)tüm küçük harfler ==> [a-z]
            3)tüm büyük harfler==> [A-Z]
            4)tüm harfler ==> [a-zA-Z]
            5)sesli harfler ==> [aeiouAEİOU]
            6)Space ==> [ ]
            7)Tüm rakamlar ve tüm harfler ==> [0-9a-zA-Z]
            8)Tüm noktalama işaretleri ==> \\p{Punct}

            1)Rakamlar hariç tüm karakterler ==> [^0-9]     hariç=^
            2)Küçük harfler hariç tüm karakterler ==> [^a-z]
            3)Büyük harfler hariç tüm karakterler ==> [^A-Z]
            4)Tüm harfler hariç tüm karakterler ==> [^a-zA-Z]
            5)Space hariç ==> [^ ]

         */

        //Example 5: Verilen bir String'de kullanılan noktalama işareti ve rakamlar ve space karakteri hariç tüm karakterlerin sayısını bulan kodu yazınız
        String u = "Ali 13 yaşında, dersem inanma!...";
        int sonuc = u.
                replaceAll("[0-9]","").
                replace(" ","").
                replaceAll("\\p{Punct}","").
                length();
        System.out.println(sonuc);



        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";

        //i)Space haric en az sekiz karakter olmali
        boolean first = pwd.replace(" ", "").length()>7;  //karşılaştırma işlemleri her zaman boolean verir.

        //ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length()>0; //rakam dışındakileri sildirdik

        //iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        //v)En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if(pwdGecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else{
            System.out.println("Password'unuz gecerli degildir...");
        }


        //Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);



        //Example 8:Verilen bir string "Al" ile başlıyor ve "x" ile bitiyorsa ekrana "harika" yazdırın.aksi halde "normal"yazdırın.

        String v = "Alex";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);


    }

}
