package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
    İlk giren elemanı ilk kullanmanız(First In First Out==FIFO) gerektiğinde Queue en iyi seçimdi (market deki ürünler örneği)
    Queue da elemanlar "insertion order"(giriş sıralamsı) a göre dizilirler
    Queue da peek();pool(); element(); gibi ilk elemanı ilgilendiren birçok method vardır.
    offer() methodu kapasite kontrolü yapıldıktan sonra eleman ekleme durumlarında kullanılır.
     */
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>(); //linkedlist'in constructor'ını kullandık
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomateos");
        System.out.println(wareHouse); //[Milk, Meat, Bread, Honey, Tomateos]

        //offer önce kapasity'e bakar müsaitse ekler değilse exception atar
        wareHouse.offer("Potatoes");
        System.out.println(wareHouse); //[Milk, Meat, Bread, Honey, Tomateos, Potatoes]
    }
}
