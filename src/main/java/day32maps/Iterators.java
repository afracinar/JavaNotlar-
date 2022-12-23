package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //For-each kullanarak her elemanın sonuna ! işareti ekleyiniz
          //NOTE:loop'lar kendi başlarına collection'ları update edemiyorlar,yani değiştiremiyorlar.Bu yüzden java iterator'ları oluşturdu.
        //Iterator'lar collection'ları update etmek için kullanılır

        for (String w : myList){
            w=w+"!";
        }
        System.out.println(myList); //[Z, K, A, J, M] değiştirmedi

        //obje oluşturmanın 2 yolu vardır:1) "new" keyword'ü kullanarak yoktan var etme 2)var olandan oluşturma.ListIterator<String> itr = myList.listIterator(); şeklinde
        ListIterator<String> itr = myList.listIterator();
        while (itr.hasNext()){  //iteratorlarda genelde while kullanılır. .hasNext() method bir sonraki eleman var mı diye kontrol eder
               String el = itr.next();
               itr.set(el+"!");
        }
        System.out.println(myList); //[Z!, K!, A!, J!, M!]
    }
}
