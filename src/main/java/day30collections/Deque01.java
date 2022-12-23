package day30collections;

import java.io.FilterOutputStream;
import java.util.Deque;
import java.util.LinkedList;

/*
         Deque:Double Ended Queue nin kısaltılmışıdır.Yani iki uçlu Queue demektir.methodlar da hep iki uçludur.first ve las methodlar çok fazladır
              FIFO ve LIFO beraber gerektiğinde kullanılır. (golf topunu hem alttan hem üstten alabilme örneği)
      */
public class Deque01 {

    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>(); //Deque constractur'ı sadece LinkedList class'ından seçebilir.
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck); //[Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

        //push() ile addFirst() aynıdır.yani yqzılan şeyi ilk sıraya ekler
        furnitureTruck.push("Refrigerator");
        System.out.println(furnitureTruck); //[Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]
    }
}
