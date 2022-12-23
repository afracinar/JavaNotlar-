package day20stringbuilderstringbuffer;

public class Q2StringBuilder01 {

    public static void main(String[] args) {

        /*
            1)StringBuilder Java'da bir Class'tır(Scanner-Array.. gibi).Class içinde variable'lar(pasif özellikler ve method'lar(aktif özellikler) olur
            2)"StringBuilder",String oluşturmaya  yarar.(StringBuilder-String Yapar)
            3)"String" Class varken neden StringBuilder'a ihtiyaç duyarız?
               Çünkü "String" Class "Immutable Class"tır (değişmez-sabit-durağan)(String'ler orijinal değeri korur),ama biz bazen "Mutable"(değişime açık) String'lere ihtiyaç duyarız.
               "StringBuilder" bize "Mutable"String verir.
               String Class ile String oluşturduğumuzda bu değişime kapalı olur yani "Immutable" olur
            4) "Immutable Class"larda(mesela String) var olan bir değer değiştirilemez.Siz varolan bir değeri değiştirmek istediğinizde
                i)Memory'de yeni bir varible,yeni değerle oluşturulur
                ii)Eski variable'ın pointer'ı yeni variable'a döndürülür.(eski adres kırılır yeni adres oluşur)
                iii)Eğer bir variable'i hiçbir pointer göstermiyorsa o variable "Gabage Collector" tarafından silinir.
                NOTE:String class'ın immutable olması bir container'ı değiştirdiğimizde diğerlerinin etkilenmesini engeller.Stringbuilder ise bir değişimde diğer
                her şey de etkilenir.

                "Mutable Class" larda var olan değer değiştirilebilir.Orijinal değer korunmaz

            5)"String Class"ların "Immutable" yapısı "security" için önemlidir
               (hesapsahibi tomhanks örneği)mesela 100 tane "Tom Hanks" için memory'de tek container oluşturur 100 ok adres çıkarır.
               Aynı değere sahip birden fazla string olduğunda Java bir tane container oluşturur ve aynı değere sahip string'lerin bu container'ı
               kullanmasını temin eder.Bu memory'i korumak için iyidir ancak container'daki değeri,bir variable için değiştirdiğimizde tüm variable'ların
               etkilenmesi tehlikesi vardır.Bu tehlikeden kurtulmak için java String'leri "immutable" yani değişmez yapmıştır.Fakat herhangi bir variable'ın
               değerini değiştirmek için java bir yol bulmuştur.Değiştirmek istediğimiz variable için yeni bir container oluşturur ve variable'ın pointer'ını
               bu yeni variable'a yönlendirir.Böylelikle hem değişim sağlanmış hem de diğerleri etkilenmemiş olur
         */

        //STRİNG
        String str = "Java"; //==> bu string değişime kapalı
        str = "Java Güzeldir"; // Java "Heap"te yeni "str"adında conteynır oluşturur ve içine "Java Güzeldir"yazar."stack"teki eski adresi kırar yeni adres oluşturur.
                               // Var olan orijinal string hiç değişmez,kalmaya devam eder.Bu bazen kötü olur çünkü memory'de her değişimde yeni container
                               //oluşturulur ve bu da memory'de çok fazla yer kaplar.İyi yönü ise orijinal değer her zaman korunur.
        System.out.println(str); //Java Güzeldir

        //STRİNGBUİLDER
        StringBuilder strB = new StringBuilder("Java");
        strB = new StringBuilder("Super Java ");
        System.out.println(strB);  //StringBuilder'ı değiştirmek istediğimizde yeni bir container oluşturulmaz direkt var olan stringbuilder'ı değiştirir

        //StringBuilder nasıl oluşturulur?
           //1.YOL-new keyword ile
        StringBuilder strb1 = new StringBuilder("Java"); //==> değişime açık
        System.out.println(strb1); //Java
           //2.YOL
        StringBuilder strb2 = new StringBuilder();
        System.out.println(strb2); //boş bir "StringBulder" oluşur.Dikkat!!String değil
         //yol a
        strb2.append("Java"); //append() methodu ile ekleme yaparız.String'lerde "concat()" methodunu kullanırdık.
        strb2.append(" is easy.");
        System.out.println(strb2); //Java is easy.

         //yol b
        strb2.append(" Learn").append( " Java earn").append(" money."); //method zinciri
        System.out.println(strb2); //Java is easy. Learn Java earn money.

        //StringBuilder'larda karakter sayısı nasıl bulunur? == length() methodu ile bulunur
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar); //18

        //Stringbuilder'ların içine alabileceği karakterlerin sayısı capacity'dir.
        // normalde 16,capacity aşımlarında capacity var olan capacity'nin 2 katının 2 fazlasına çıkar
        int capacity1 = strb3.capacity(); //StringBuilder'ların içine alabileceği kapasiteyi gösterir
        System.out.println(capacity1); //34

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2); //70 ==>( 34*2 )+ 2

        //set değiştir demektri.
        //setCharAt(2,'r') ==> index 2 deki karakteri 'r' ile değiştir.
        strb3.setCharAt(2,'r');
        System.out.println(strb3); //Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //delete(3,18) ==> parametre de start ile başlar endd ile biter.index 3 dahil , index 18 hariç(substring gibi)olmak üzere aradaki tüm karakterleri siler.
        strb3.delete(3,18);
        System.out.println(strb3); //Carmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //deleteCharAt(2) ==> index 2 deki karakteri siler
        strb3.deleteCharAt(2);
        System.out.println(strb3); //Cammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //reverse() methodu "StringBuilder"ı tersten yazdırır. Ali ==> ilA !!interwiev de sorulursa bahset (reverse-ters çevir)
        //"mutable" larda sedece method kullanmak orijinal değeri değiştirmek için yeterlidir.
        strb3.reverse();
        System.out.println(strb3); //mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC


        String abc = "Java";
        abc.replace("a","i");
        System.out.println(abc); //Java ==>String'de sadece method kullanınca orijinal değer korunuyor,değişmiyor.Stringbuilder ile farkı.

        //"immutable"larda orijinal değeri değiştirmek için methodu kullanmak yeterli olmaz bir de "atama işlemi" yapılmalıdır
        String abc1 = "Java";
        abc1 = abc1.replace("a","i"); //"atama" yaptıktan sonra yazdırırsak değiştirilmiş halini görürüz.
        System.out.println(abc1); //Jivi

        //toString() methodu StringBuilder'ları String'e çevirir.Elimizde artık String olduğu için yeni variable oluşturmamız lazım.
        String stringStrb3 = strb3.toString(); //"strb3" Stringbuilder'ını "toString()" methodu ile string'e çeviriyoruz.
                                               // Artık elimizde String olduğu için String variable'ına atıyoruz.
        System.out.println(stringStrb3); //mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //String'den de StringBuilder'a aşağıdaki gibi dönülebilir.
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4); //mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3,"XXXX") ==> 3. "karakterden" sonra 4 tane X gösterir..(insert-araya koy)
        strb4.insert(3,"XXXX"); //offset boşver demek
        System.out.println(strb4); //mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3,"KLMOPQRSTU",5,8) ==> 3.karakterden sonra "KLMOPQRSTU" Stringinin index 5-6-7 deki karakterlerini (8 dahil değil) yerleştirir
        strb4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(strb4);

        //compareTo() methodu karşılaştırma demektir.Sonucu int verir.Alfabetik sıraya koyar
        //              i)StringBuilder'lar tamamıyla aynı ise "0" verir yani aralarında fark yok demektir
        //              ii)"a" alfabetik sırada "b"den sonra gelirse pozitif olarak aradaki alfabetik sıralama farkını gösterir.Kava-Java 1 verir
        //              iii)"a" alfabetik sırada "b"den önce gelirse negatif olarak aradaki alfabetik sıralama farkını gösterir.
        StringBuilder a = new StringBuilder("java");
        StringBuilder b = new StringBuilder("Java");
        int sonuc = a.compareTo(b);
        System.out.println(sonuc); //32













    }

}
