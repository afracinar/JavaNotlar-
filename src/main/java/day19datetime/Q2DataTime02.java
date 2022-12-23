package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q2DataTime02 {

    public static void main(String[] args) {

        //Example 1: Java'dan aldığınız Date'i ay,gün,yıl olarak yazınız.

        LocalDate currentDate = LocalDate.now(); //şuanki tarihi aldık
        System.out.println(currentDate); //2022-10-21

        //date ve time formatını değiştirmek için Java bir class oluşturmuş:  "DateTimeFormatter"(tarih ve zamana format atıcı)
        //uzun class isimlerinde baş harfi obje ismi yazarlar
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");  //"MM" 10'dan küçük ayları 01,02,03 .. şeklinde yazar
        String formattedDate1 = dtf1.format(currentDate);  //formatı bizim verdiğimiz tarihe uyguladık.Format methodu "String" verir
        System.out.println(formattedDate1); //10/21/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM-dd-yyyy"); //eğer ayı kısaltma olarak görmek istiyorsak "MMM" yazmalıyız
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2);// Eki-21-2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy"); //eğer ayın full imini görmek istiyorsak "MMMM" yazmalıyız
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);// Ekim/21/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy"); //eğer tek "M" koyarsak 10'dan küçük ayları 1-2-3-4-5.. diye yazdırır
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4);// 10/21/2022

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy"); //eğer "yy" yaparsak yılın son iki hanesini gösterir
        String forttedDate5 = dtf5.format(currentDate);
        System.out.println(forttedDate5);// 10/21/22

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy"); // "d" 10'dan küçük günleri 1,2,3 .. şeklinde yazar.01,02,03.. kullanmaz
        String forttedDate6 = dtf6.format(currentDate);
        System.out.println(forttedDate6);// 10/21/22


        //Example 2: Java'dan aldığınız time'ın formatını değiştiriniz.

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime); //16:23:54.000002345

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("hh:mm");  //time'ı formatlıyoruz.
        String formattedMyTime = dtf7.format(myTime); //format methodu string verir
        System.out.println(formattedMyTime); //04:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("HH:mm");  //"HH" 24 saat sistemini,"hh" 12 saat sistemini kullanır
        String formattedMyTime1 = dtf8.format(myTime);
        System.out.println(formattedMyTime1); //16:23

        DateTimeFormatter dtf9 = DateTimeFormatter.ofPattern("hh:mm a"); //boşluk bırakıp "a" koyarsak gece mi gündüz mü (AM-PM) onu belirtir
        String formattedMyTime2 = dtf9.format(myTime);
        System.out.println(formattedMyTime2); //04:23 PM


    }

}
