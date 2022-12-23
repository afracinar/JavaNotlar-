package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Q1DataTime01 {

    public static void main(String[] args) {

        //iki tür obje oluşturulabilir 1 yoktan var etme new keyword ile, 2 dönüştürerek yapma new keyword kullanmadan

        //Example 1: "Anlık tarihi"(Current Date) ekrana yazdıran kodu yazınız.(current-anlık)
        LocalDate currentDate = LocalDate.now();  //yeni obje oluşturuyoruz(dönüştürerek)yani "new" keyword'ü kullanmadan.bulunduğun mekandaki anlık tarihi ver diyoruz
        System.out.println(currentDate); //2022-10-21

        //Example 2: "Anlık zamanı" (Current Time) ekrana yazdıran kodu yazınız.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); //20:45:28.833905400

        //Example 3: "Anlık tarihi (Current Date) ve anlık zamanı" (Current Time) ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); //2022-10-21T20:45:28.833905400 ==>aradaki "T" harfi date bitti time başladı onu belirtiyor

        //Example 4: Japonya'daki "Anlık tarihi (Current Date) ve "Anlık zamanı" (Current Time) ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo")); //tokyo'nun zon ıd'sine bak oradaki anlık tarih/zamanı ver
        System.out.println(currentDateTimeInJapan); //2022-10-22T02:50:51.835430800

        //Example 5: İstnabul'daki "Anlık tarihi (Current Date) ve "Anlık zamanı" (Current Time) ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul); //2022-10-21T20:52:31.932219600

        //Example 6: Bugünden 789 gün sonra emekli olacağınıza göre emeklilik tarihini hesaplayan kodu yazınız.
        LocalDate countdate = LocalDate.of(2022,10,21); //LocalDate.of() methoduyla değişik günlerde de hesap yapar.daha dinamiktir.
                                                                              //LocalDate.now() methodu sadece o günden hesap yapar dinamik değildir.
        LocalDate emeklitarihi = countdate.plusDays(789); //gün ekle dediği için plusDays() methodu seçtik-ay ekle deseydi plusMonth() eklerdik.
        System.out.println(emeklitarihi); //2024-12-18

        //Example 7: İki çocuğunuzun doğum tarihleri arasındaki farkı gün olarak hesaplayan kodu yazınız.
        LocalDate dobAli = LocalDate.of(2005,5,17); //tarihler sabit olduğu için "of" kullanılır.
        LocalDate dobVeli = LocalDate.of(2013,2,8);
           //between(dobVeli,dobAli) methodu fark bulmada kullanılır,kullanıldığında eski tarih önce yazılır.yoksa sonu. eksi(-) çıkar.
        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli); //bu kod alinin dg'si ile velinin dg'si arasındaki farkı gün olarak verir."Long"konteynırına koyarız
        System.out.println(diff); //2824

        //Example 8: Tom, Ali'den 3 yıl 8 ay 13 gün sonra doğdu.Ali ise Veli'den 1 yıl 15 gün önce doğdu.
        // Tom'un doğum tarihi 18 Kasım 2011 ise Veli ve Ali'nin doğum tarihlerini bulunuz.
        LocalDate tomBD = LocalDate.of(2011,11,18); //sabit tarih olduğu için "of" kullandık
        System.out.println(tomBD); //2011-11-18
        LocalDate aliBD = tomBD.minusYears(3).minusMonths(8).minusDays(13); //Alİ,Tom'dan önce doğduğu için geriye gideriz
        System.out.println(aliBD); //2008-03-05
        LocalDate veliBD = aliBD.plusYears(1).plusDays(15);
        System.out.println(veliBD); //2009-03-20

        //Example 9:İstanbulun fethi ile cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız.
        LocalDate cumhuriyet  = LocalDate.of(1923,10,29);
        LocalDate fetih = LocalDate.of(1453,5,29);

        Long aySayisi = ChronoUnit.MONTHS.between(fetih,cumhuriyet); //iki tarih arasındaki farkı "ay" olarak istediği için ChronoUnit.MONTHS.between() kullandık
        System.out.println(aySayisi); //5645      method içine ilk eski tarih yazılır.

        //Example 10: Verilen tarihin hangi burçta olduğunu gösteren kodu yazınız.
        LocalDate myDate = LocalDate.of(1989,12,7);

            // int yıl = myDate.getYear(); //1989 getYear() methodu yılı verir
        int day = myDate.getDayOfMonth(); //tarihteki gün değerini aldık
        int month = myDate.getMonthValue(); //getMonth() methodu ayın "ismini" vereceği için int kullanılmaz ama getMonthValue() bize ayın "sayısını" int verir
        System.out.println(day+ "-"+ month); //7-12

        if ((day>=21 && month==3) || (day<20 && month==4)){

            System.out.println("Koç Burcu");

        }else if ((day>=21 && month==4) || (day<=20 && month==5)){

            System.out.println("Boğa Burcu");

        }else if ((day>=21 && month==5) || (day<=21 && month==6)){

            System.out.println("İkizler Burcu");

        }else if ((day>=22 && month==6) || (day<=22 && month==7)){

            System.out.println("Yengeç Burcu");

        }

    }




}
