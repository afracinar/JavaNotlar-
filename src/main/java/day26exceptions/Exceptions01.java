package day26exceptions;

public class Exceptions01 {

    /*
        Exception=Beklenmedik problem.
     */

    public static void main(String[] args) {

        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5); //128==>Eğer string bir ifade olsaydı concat yapardı "1235" görürdük.int'e çevirdiğimiz için toplama işlemi yapıyor(128)

        String st = "1a2b";
        int r = convertStringToInteger(st); //NumberFormatException:Eğer i.inde rakamdan farklı karakter barındıran bir stringi valueOf() kullanarak Integer
                                            //çevirmek isterseniz NumberFormatException alırsınız
        System.out.println(r + 10); //NumberFormatException(sayı formatı hatalı).Çünkü r int bi ifade olmadığı için Java  toplama yapamıyor
    }

    //1  public static int convertStringToInteger(String str){  //String ifadeyi int ifadeye çeviren method oluşturduk)
    //       return Integer.valueOf(str);  //return type void'den farklıysa "return"demek zorundayız.valueOf() stringi int'e çevirir

    public static int convertStringToInteger(String str) {

        int i = 0;

        try {
            //herhangi bir satırda exception atılırsa Java direk catch bölümüne geçer.try içindeki sonraki kodları çalıştırmaz
            i = Integer.valueOf(str);
            System.out.println("Burası try bölümü");
        } catch (NumberFormatException e) {  //exception oluştuğu zaman catch bölümü çalışır.
            System.out.println("Rakam olmayan karakter içeren String'ler Integer'a çevrilemez..");
        }
        return i; //10 return edilir.çünkü i 0 dır değer atanmaz,+10 olduğu için ekranda 10 gösterir


    }
}