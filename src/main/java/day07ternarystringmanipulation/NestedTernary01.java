package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

    /*
        Verilen yılın "Leap Year" (Artık yıl) olup olmadığını kontol eden kodu yazınız.
        bu kural mülakatlarda çıkabilir:::
     i)yıl 100 e bölünürse 400 e de bölünmelidir.örn==> 1600(artık yıl)  1800(artık yıl değil)
     ii)yıl 100 e bölünmezse 4 e bölünmelidir. örn==>  1996(artık yıl)   2001(artık yıl değil)
     */

        int year = 2022;

        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year değil") : (year%4==0 ? "Leap year" : "Leap year değil");
        System.out.println(leap);

        /*
          aşağıdaki kurallara göre password ün geçerli olup olmadığığnı kontrol eden kodu yazınız
          i-8karakter ve 8 karakterden fazla karakter varsa ilk harfi 'i' olmalıdır
          ii-8 karakterden az karakter varsa ilk harfi 'K' olmalıdır
         */

        String pwd = "K2a3ed54";        //lenght. methodu kaç karakter olduğunu sayar
        String gecerli = pwd.length()<8 ? (pwd.charAt(0)=='K' ? "Geçerli" : "Geçersiz") : (pwd.charAt(0)=='i' ? "Geçerli" : "Geçersiz");
        System.out.println(gecerli);

    }
}
