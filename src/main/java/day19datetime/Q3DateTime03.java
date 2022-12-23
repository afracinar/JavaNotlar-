package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Q3DateTime03 {

    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasındaki zaman farkını saat olarak hesaplayan kodu yazınız.

        LocalDateTime jpn = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime alm = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark = ChronoUnit.HOURS.between(alm,jpn); //almanyanın tarihi daha geride olduğu için önce alm yazılır
        System.out.println(fark); //6

        //Example 2: Sabit bir tarih oluşturunuz

        LocalDate myDate = LocalDate.of(2011, Month.JULY,13); //Java ay isimleri için bir data tipi oluşturmuş: "Month".okunabilirlik açısından bu daha iyi
        System.out.println(myDate); //2011-07-13

        /*
            1)Java'da sabit data'ları(Gün İsimleri,Ay İsimleri,Amerika'daki eyalet isimleri..)depolamak ve gerektiğinde kullanmak için depolar oluştururuz
            Bu depolara "Enum" denir."Enum" içine sabit datalar konur,değişken datalar kullanılamaz.
         */

        //Example 3: USA için "Woow!", UK için "Big" , CANADA için "Cold" , TURKEY için "Vatan , GERMANY için "Araba" , RWANDA için "Çay" yaz

        Countries country = Countries.TURKEY; //Enum'dan alır dataları."enum" oluşturup içine data koyduğumuzda data tipi "enum" olur string olmaz

        switch (country){
            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                 break;
            case TURKEY:
                System.out.println("Vatan");
                 break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Çay");
                break;
            default:
                System.out.println("Tanımlanmamış ülke");
        }




    }
}
