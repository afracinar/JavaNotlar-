package day26exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        double d = divideStringByTheNumOfTheCharacters("124");
        System.out.println(d); //41.0
    }

    //String'deki character sayısını bulunuz,String'i Integer'a çeviriniz,Integer'ı character sayısına bölünüz

    //1.YOL
    public static double divideStringByTheNumOfTheChar(String str) {

        //variable'ları süslü parantez içinde oluşturursak dışında kullanamayız.Bu yüzden bu variable'ları try 'ın üstünde oluşturuyoruz.

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length(); //NullPointerException: "null" String ile "length()" kullanıldığında alınır.

            i = Integer.valueOf(str); //NumberFormatException: İçinde rakam dışı character olan String'ler valueOf() ile kullanıldığında alınır

            sonuc = i / length; //ArithmeticException: Bölen sayı 0 olduğunda alınır
            //1 tane "try"dan sonra çoklu "catch" kullanılabilir,sıra önemli değildir.
            //AYnı anda birden fazla exception atılamaz.çünkü bir tane exception verildikten sonra diğerleri okunamaz
        } catch (NullPointerException e) {
            System.out.println("==>"+e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        return sonuc;

    }

    //2.YOL
    public static double divideStringByTheNumOfTheCharacter(String str) {

        //variable'ları süslü parantez içinde oluşturursak dışında kullanamayız.Bu yüzden bu variable'ları try 'ın üstünde oluşturuyoruz.

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length(); //NullPointerException: "null" String ile "length()" kullanıldığında alınır.
            i = Integer.valueOf(str); //NumberFormatException: İçinde rakam dışı character olan String'ler valueOf() ile kullanıldığında alınır
            sonuc = i / length; //ArithmeticException: Bölen sayı 0 olduğunda alınır
                             //1 tane "try"dan sonra çoklu "catch" kullanılabilir,sıra önemli değildir.
                             //AYnı anda birden fazla exception atılamaz.çünkü bir tane exception verildikten sonra diğerleri okunamaz
        } catch (Exception e) { //bu Exception bütün exception'ları halleder.bütün exceptionların "parent class"ıdır
            System.out.println(e.getMessage());
        }
        return sonuc;

        //burada genel bir uygulama yapılır ancak üstteki methodun ookunabilirliği daha iyidir.daha açıklayıcıdır.özel senaryolar için çoklu catch daha iyi
    }

    //3.YOL
    public static double divideStringByTheNumOfTheCharacters(String str) {

        //variable'ları süslü parantez içinde oluşturursak dışında kullanamayız.Bu yüzden bu variable'ları try 'ın üstünde oluşturuyoruz.

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length(); //NullPointerException: "null" String ile "length()" kullanıldığında alınır.
            i = Integer.valueOf(str); //NumberFormatException: İçinde rakam dışı character olan String'ler valueOf() ile kullanıldığında alınır
            sonuc = i / length; //ArithmeticException: Bölen sayı 0 olduğunda alınır
                                //1 tane "try"dan sonra çoklu "catch" kullanılabilir,sıra önemli değildir.
                                //AYnı anda birden fazla exception atılamaz.çünkü bir tane exception verildikten sonra diğerleri okunamaz
        } catch (NullPointerException e) {  //child
            System.out.println("Nullpointer'a özel"); //nullpointerexception için özel oluşturduk
        } catch (Exception e) {  //parent
            System.out.println("Diğer tüm exceptionlar için");
        }
        return sonuc;

        //NOTE:
        //çoklu catch kullandığımızda parent exception üstte child exception altta olursa hata alırız.Çünkü exceptionların hepsini parent class yakalar.
        //aralarında parent-child ilişkisi olan exception class'ları kullanırsak child olanı yukarı koymamız şarttır.paent-child ilişkisi yoksa sıra farketmez
    }
}
