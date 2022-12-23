package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

    /*
         LinkedHashSet'ler elemanlaı ekleme sırasına(Insertion Order) göre yerleştirirler.
         LinkedHashSet sıralamaya önem verdiği için hızı HashSet'e göre yavaştır

     */
    public static void main(String[] args) {

        LinkedHashSet<String> emails = new LinkedHashSet<>();
        emails.add("abc@gmail.com");
        emails.add("bca@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("bde@gmail.com");
        emails.add("axy@gmail.com");
        System.out.println(emails); //[abc@gmail.com, bca@gmail.com, asc@gmail.com, bde@gmail.com, axy@gmail.com]




    }
}
