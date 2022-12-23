package day22inheritancepolymorphism;

public class CatRunner {

    /*
        Java'da Object oluştururken Constructor'lar Parent'tan Child'a doğru çalıştırılır.
        Java en üst parent Constructor'a çıkabilmek için "super()" kodunu kullanır
        "super()" kodu child class'tan parent class'a gidip oradaki consturoctor'ı kullanmamızı sağlar.
        "super()" kodu her Constructor'ın 'ilk satırında' ve 'gizli' olarak bulunur
        "super()" kodunu isterseniz görünür şekilde de yazabilirsiniz,Java kızmaz
        "super()" kodunu görünür şekilde yazarsanır sakın ilk satırdan başka bir yere yazmayın hata verir
        "super() kodu "parent class"dan Constructor çağırmaya yarar.

     */

    public static void main(String[] args) {

        //Biz bir obje yaratmak istediğimizde objenin yaratılışı consturoctor kullanılmasına bağlıdır
        // Constructor'ların yaratılışı yukarıdan aşağıya doğrudur.Bu yüzde yukarıdan aşağıya doğru çalışır.

        //bu kodu yazınca Java'ya Cat objesi oluştur dedik.Java constructor'a bakar:Cat() constructor'ı kullanılmıştır.Cat() constructor'ına gelecek.
        //Cat constructor'ında görünmez bir "super()" kodu vardır.bu kodun anlamı "parent'taki constructor'ı bul" demektir.cat'in parent'ı mammal olduğu
        //için Mammal constructor'ına gidecek orada da "super()" vardır,bir üst parent olan Animal() consturoctor'ına gidecek.sonra yukarıdan aşağıya yazdırır

        // Java cat olabilmesi için önce animal'ın yaratılması gerektiğini söyler.bu yüzden ilk animal
        //constructor ı yazıldı sonra mammal sonra cat constructorı yazdırılır.(parent'lar)

        Cat cat1 = new Cat(); //Animal
                              //Mammal
                              // Cat



    }
}
