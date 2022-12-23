package day20stringbuilderstringbuffer;

import java.time.LocalDate;
import java.time.Month;

public class Q1DateTime01_minusDays {

    public static void main(String[] args) {

        //Example 1: Tom, Ali'den 3 yıl 8 ay 13 gün sonra doğdu.Ali ise Veli'den 1 yıl 15 gün önce doğdu.
        // Tom'un doğum tarihi 18 Kasım 2011 ise Veli ve Ali'nin doğum tarihlerini bulunuz.

        LocalDate tomBD = LocalDate.of(2011, Month.NOVEMBER,18);
        System.out.println("Tom'un doğum tarihi :" +tomBD); //2011-11-18

        LocalDate aliBD = tomBD.minusYears(3).minusMonths(8).minusDays(13);
        System.out.println("Ali'nin doğum tarihi :"+aliBD); //2008-03-05 minusDays() methodu çıkartır

        LocalDate veliBD = aliBD.plusYears(1).plusDays(15);
        System.out.println("Veli'nin doğum tarihi :"+veliBD); //2009-03-20 Velinin doğum tarihi Ali'den ileri olduğu için ekleme yapıyoruz




    }


}
