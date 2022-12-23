package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    /*                                 bu iki kavrama "Natural Order" denir
         TreeSet tekrarsız elemanları "alfabetik sıra" veya "küçükten büyüğe"(sayısal değer ise) dizer
         TeeSet çoook yavaş çalışır.Bu yüzden treeset'i kullanırken iyi düşünmek gerekir:
           alfabetik sıraya göre sıralamak şart mı ?
           küçükten büyüğe doğru sıralamak şart mı ?

           NOTE:Tekrarsız elemanları natural order'da depolamak için TreeSet kullanmak mantıklıdır ama TreeSet'ler çoook yavaş çalıştığı için biz
                elemanlari once HashSet depolariz sonra HashSet'i TreeSet e cevirerek TreeSet in yavas olma problemini asmis oluruz.

     */

    public static void main(String[] args) {

        //Example 1: Sekiz tane unique String elemanı alfabetik sırada depolayınız.
           //unique dediği için set,alfabetik dediği için treeset kullanırız

        //1.YOLL-treeset ile işlem yaptık ama bu çok yavaştır
        Long start1 = LocalTime.now().toNanoOfDay();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails); //[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1); //aradaki fark işlemin kaç nanosecond sürdüğünü gösterir

        //2.YOL-hashset ile yaptık hızlı olduğu için
        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");
        TreeSet myEmailsSorted = new TreeSet(myEmails); //hashset'i treeset'e çevirdik hashset'in hızından,treeset'in sıralamasını kullandık
        System.out.println(myEmailsSorted); //[b@gmail.com, k@gmail.com, c@gmail.com, y@gmail.com, m@gmail.com, z@gmail.com, d@gmail.com, a@gmail.com]

        Long end2 = LocalTime.now().toNanoOfDay();

        System.out.println(end2-end1);

    }

}
