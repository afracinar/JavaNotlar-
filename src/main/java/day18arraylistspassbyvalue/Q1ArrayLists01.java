package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class Q1ArrayLists01 {
    public static void main(String[] args) {

        //Example 1: Bir Integer Arraylist'teki 7 hariç tüm elemanları 2 arttırınız.

        List<Integer> ages = new ArrayList<>(); //List ismi verilirken genelde çoğul isim verilir.
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        //elimizde array veya arraylist varsa en iyi loop "for-each loop"tur  tercih edilmeli.tekrarlı işlem olduğundan loop kullanılmalı

        for (Integer w : ages){

           if (w==7){  //eğer w =7 ise
               continue; //boşver
           }
           // w=w+2;      //list'ler böyle değiştirilemezler.Bu int değiştimek içindir.

           ages.set(ages.indexOf(w), w+2); //ages list'ine git w'nun indekini bul,2 arttır
        }
        System.out.println(ages);  //[14, 7, 23, 80, 11]

        //Listteki elemanları değiştirmek için "set" methodu kullanmak zorundayız

        //Example 2: Size verilen ArrayList'te 8(inclusive) ve 8'den önceki tüm elemanları 2katına çıkarınız.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for (Integer w : nums){

            nums.set(nums.indexOf(w),w*2); //8'i de dahil edeceğimiz için if üstüne koyduk.ilk kontrol edecek sonra break çalışacak
                                           // .8 dahil edilmeseydi if üstte olmalıydı.

            if (w==8){
                break;
            }

        }
        System.out.println(nums);  //[24, 14, 42, 16, 9]

    }

}
