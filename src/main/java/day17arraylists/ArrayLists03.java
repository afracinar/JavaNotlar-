package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        //Example 1:Bir List'teki eLemanlarıdan birbirine en yakın olan ikisini bulunuz
        //          [12,15,19,30,21] ==> 19 ve 21
        //Önce en küçük farkı bulacağız sonra en küçük farkı veren sayıları yazdıracağız

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);  //[12, 19, 15, 30, 21]

        Collections.sort(a);  //Listteki elemanları küçükten büyüğe dizmek için kullanılır.
            //Array'lerde Arrays.sort kullanılıyordu.ArrayList'lerde Collections.sort kullanırız
        System.out.println(a);  //[12, 15, 19, 21, 30]

        int minFark = Integer.MAX_VALUE; //minFark'ı integer'ın en büyük değerini verdik,her verelien sayıyı sağlasın diye

        for (int i =1 ; i<a.size(); i++){  //2.sayıdan 1.sayıyı çıkaracağımız için i=1 yaptık

            minFark = Math.min(minFark,a.get(i) - a.get(i-1));
        }
        System.out.println(minFark);  //2





    }


}
