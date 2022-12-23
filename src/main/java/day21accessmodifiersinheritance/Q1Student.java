package day21accessmodifiersinheritance;

public class Q1Student {

    /*

        INTERVİEW SORUSU OLABİLİR!!

       Access Modifier
       1)public    2)protected    3)default(package private)    4)privite   -->genişten dara doğru sıralanışı
                                  (Access modifier'ı default yapmak için access modifier yazılmaz

       note:Access Modifier'ları genişten dara doğru sıralayın:
            public>protected>default>private

       note:Access Modifier'ları birer birer açıklayın
            public olanlar her classs'tan kullanılabilir.(halk kütüphanesi gibi)
            protected olanlar başka package'lerden kullanılamaz.ancak başka package'te child içinden kullanılabilir.
            default olanlar başka package'ten kullanılamazlar.Aynı package'ten kullanılabilir.(sadece bir grup kullanabilir mesela sdece personel kullanabilir vs..)
            private olanlar sadece oluşturuldukları class içinde kullanılabilirler(mesele ehliyetler kişiye özeldir)

      note: protected ile default'un farkı nedir?
            protected olanlar başka package'lerden kullanılamaz.ancak başka package'te child içinden kullanılabilir.
            default olanlar başka package'ten kullanılamazlar.Aynı package'ten kullanılabilir.

      note:Class'lar için hangi Access Modifier'lar kullanılabilir?
           public-default kullanılır ama protected ve private kullanılamaz.yani class'lar protected ve private olamazlar

     */

    //public her classs'tan kullanılabilir.(nerede olursa olsun kullanabilirz)
    public String stdName = "Tom Hanks";

    //protected olanlar başka package'lerden kullanılamaz.Aynı package'tan kullanılabilirler.ancak başka package'te child içinden kullanılabilir.
    protected String adres = "Miami";

    //default olanlar başka package'ten kullanılamazlar.Aynı package'ten kullanılabilir.
    String email = "th@gmail.com";  //default access modifier'lar yazılmaz.hiçbir şey yazılmıyorsa default'tur.

    //private olanlar sadece oluşturuldukları class içinde kullanılabilirler
    private String stdID="20206517004";


}
