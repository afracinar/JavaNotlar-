package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydır.";

        //starsWith("kola",5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile başlayıp başlamadığını kontrol eder.
        //"kola" ile başlıyorsa "true",başlamıyorsa "false" return eder
        //starsWith boolean(true/false) verir.
        boolean b = a.startsWith("va",2);  //true
                                               //bu string 2. karakterden sonra ne ile başlıyor sorusu cevabı?
        System.out.println(b);


        //replaceFirst("a","*") kod String'deki ilk "a"yı "*" e çevirir. bu method string verir
        //replace("a","*") kod String deki tüm "a" ları "*" e çevirir
        String c = a.replaceFirst("a","*");
        System.out.println(c); //J*va kolaydır.

        //concat() methodu ekleme yapar.iki tane String'i birbirine yapıştırmaya yarar.sonucu String olur.başına boşluk ekleriz ki birleşik yazdırmasın
        //"concatenation" işlemi iki türlü yapılabilir: i)+ ile ii)concat() ile
        //Java bir işlem için metod ürettiyse o methodu kullanmak "best practice" dir
        //concat methodu her zaman en sona ekleme yapabilir.
        String d = a.concat(" Anladın mı?");
        System.out.println(d);

        //trim=bir şeyi ucundan kesmek . saçların kırıklarını aldırmak
        //trim() methodu String'in baş ve sondaki space'leri siler düzeltmeleri yapar,aradaki boşlukları silmez.yani kullanıcının girdiği hataları düzeltir.
        // String verir
        String e = "   Tom Hanks    ";
        System.out.println(e);
        String f = e.trim();
        System.out.println(f);

        //h.compareTo (i) kodu iki tane String'i alfabetik olarak karşılaştırır.büyük harf küçük harfe duyarlıdır.
        //büyük harf küçük k-harfe duyarlı olmasını istemezsek h.compareToIgnorecase(i); i kullanırız
        //h.compareTo(i); bu kodda "h" nin alfabetik sırasından "i" nin alfabetik sırası çıkarılır.
        //string ler aynıysa sonucu 0 verir.yani aynı anlamında
        String h = "Java";
        String i = "Java";
        int k = h.compareTo(i);
        System.out.println(k);

        //repeat() methodu Stringi tekrarlar.String döndürür
        //a.repeat(5) kodu "a" stringini yanyana 5 kere yazar.
        //repeat(0); empty String return eder.
        // count'a negatif girersek hata verir
        String n = a.repeat(0);
        System.out.println(n);
    }

}
