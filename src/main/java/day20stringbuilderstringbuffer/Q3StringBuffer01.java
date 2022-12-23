package day20stringbuilderstringbuffer;

public class Q3StringBuffer01 {

    public static void main(String[] args) {

    /*
        1)StringBuffer Java'da bir "Class"tır ve String oluşturmaya yarar.(Stringbuilder-String gibi)

        2)StringBuffer Class,StringBuilder Class gibi "mutable"dır.

        StringBuffer ile StringBuilder farkı nedir ? //yemek örneği
           1)StringBuffer "thread-safe"dir.Multi-thread'tir.(eş zamanlı çoklu iş yapma)(Java bir işi bitirip öbürüne başlamaz,bir işi yaparken üst üste yapar)
           2)StringBuffer synchronized'dır.Yani multi-thread olabilmek için mantıklı Sıralama yapabilmek gerekir.

           3)StringBuilder multi-thread değildir.

        "String" için 3 seneryo vardır.Senaryolar:
        1)Değiştirilemez data için ==> String Class (inmuitible)
        2)Değiştirilebilir (muitible) ama multi-thread (çoklu iş) gerekmeyen durumlar için ==> StringBuilder Class kullanılır
        3)Değiştirilebilir ve multi-thread gereken durumlar için ==> "StringBuffer" kullanılır.



     */




    }

}
