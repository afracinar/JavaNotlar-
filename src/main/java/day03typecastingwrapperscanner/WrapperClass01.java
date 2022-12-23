package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
           Java ptimitive'lere method'lar ekleyerek yeni bir yapı oluşturdu.bu yapıya "Wrapper class" denir.

           Primitive          Wrapper
              byte      ==>    Byte
              short     ==>    Short
             ** int     ==>    Integer
              long      ==>    Long
              float     ==>     Float
              double    ==>     Double
              bloolean  ==>    Bloolean
             ** char    ==>    Character

            küçük harfi büyük harfe çevrimesinin sebebi:Wrapper bir class olduğu için büyük harfe dönüşür.

            Note: wrapper class'lar da non- primitive dir
        */

        byte primitiveByte = 12;  //primitiveByte. yazdığımızda hiç method göremeyiz çünkü primitive ler method içermez,değer içerir
        Byte wrapperByte =12;  //wrapperByte. yazdığımızda birçok method çıkar çünkü wrapper method içerir.
        //wrapperByte.hashCode(); --> örnek

         //Example 1: byte data type lerinin en küçük ve en büyük değerlerini ekrana yazdırın.
            //Byte. yazdığımızda en küçük en büyük değer çıkıyor.ekrana yazdırmak için sout yapıyoruz
        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Byte.MAX_VALUE); //127

        //Example 2: short , int , long data type'lerinin en büyük ve en küçük değerlerini ekrana yazdırınz.
            //Short. - Integer. - Long. yazdığımızda en büyük ve en küçük değerler çıkıyor
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //Primitive'ler nasıl wrapper lara çevrilir. (Autoboxing) (otomatik kutulama)
        float f1 = 13.99F;
        Float wrapperF1 = f1;  //primitive wrapper içine otomatik konulur Java hata vermez

        //Wrapper lar primitive lere nasıl çevrilir.  (unboxing)
        Character w1 = 's';
        char primitiveW1 = w1;

        //ne işimize yarayacak? primitive'i wrapper'a çevirip methodları kullanıp tekrar primitive dönüştürmede işe yarar.

        //Note: Aoutoboxing ve unboxing Java tarafından otomatik olarak yapılır.kod yazmaya gerek yoktur.
    }

}
