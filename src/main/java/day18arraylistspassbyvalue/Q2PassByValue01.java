package day18arraylistspassbyvalue;

public class Q2PassByValue01 {

    public static void main(String[] args) {
        /*
        Gömlek-öğrenci-gazi örneği

       1)Java variable'ların orijinal değerlerini korumak ister
       2)Variable,methodlar içinde kullanıldığında Java methodun içine orijinal değeri koymaz,o değerin kopyasını üretir ve methoda o kopyayı yollar.
           Method kopya üzerinde çalışır,kopya üzerinde değişiklik yapar dolayısıyla variable'ın orijinal değeri korunmuş olur.
           Bu sisteme "Pass By Value"(Değeri Yolla) denir.(Yani variable'ın kendisini değil değerini yolluyor)
           Note:Java "Pass By Value" kullanır."Pass by Reference" kullanmaz.
           Note:Bazı programlama dilleri orijinal değeri koruma altına almamıştır.Bu işi developer'lara bırakmıştır.
           Bu tarz diller "Pass by Reference" kullanır

         */

        //Methodlar main methodun dışında oluşturulur.(accsess modifier/return type/method ismi/method parantezi/süslü parantez
        //void-->hiçbir data üretmez sadece aksiyon yapar yani ekrana bir şey yazdırıyoruz

        int x=5;

        System.out.println(x); //5

        //"main method" static olduğu için içindeki her şey static olmalıdır.static yapmazsak hata verir.
        // static yapmak için accsses modifier ile retrun type arasına static yazılır.
        change(x); //15 ==> Java orijinal değerin kopyasını oluşturuyor ve kopya üzerinden işlem yapıyor
        System.out.println(x); //5==> java orijinal değeri koruyor.

        int ucret = 100;
        int kopya = indirim(ucret); //int değer return edeceği için int container'a atadık.
        System.out.println(kopya); //90
        System.out.println(ucret); //100 ==> orijinal değer korunuyor.

        ucret=indirim(ucret); //== burada orijinal değeri değiştirdik.ücreti 90 yaptık
        System.out.println(ucret); //90
    }

    public static void change (int a){
        System.out.println(a*3);
    }

    //void dışındaki "return" type'larda method buddy'si içinde "return" keyword kullanılmalıdır
    //"main method" içinde kullanacağımız tüm methodlar "static" olmalıdır.Çünkü main method statictir
    public static int indirim(int gömlekUcreti){
        return gömlekUcreti-10;
    }

}
