package day30collections;

import java.util.LinkedList;

public class LinkedList01 {
    //one method one extion ==yani methoduun içine bir tane action konulmalı

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names); //[Chris, Alexandre, Mark, Tom, Jeremy, Hans]


        /*
        Retrieves, but does not remove, first element of this list. (first elemanı alır ama silmez)
        Returns:the head of this list, or "null" if this list is empt (bu method sana ilk elemanı verir eğer list boş ise "null" verir.hata vermez)
         */
        String firtEl = names.peek();
        System.out.println(firtEl); //Chris
        System.out.println(names); //[Chris, Alexandre, Mark, Tom, Jeremy, Hans]
        LinkedList<String> myList = new LinkedList<>();
        String first = myList.peek();
        System.out.println(first); //null-boş listte peek methodu kullanılırsa null verir,exception vermez.

        /*
        Retrieves and removes first element of this list. (ilk elemanı silerek veriyor)
        Returns:the head of this list, or null if this list is empt (list boşken hata vermez pop da hata veriyor)
         */
        String firstElement = names.poll();
        System.out.println(firstElement); //Chris
        System.out.println(names); //[Alexandre, Mark, Tom, Jeremy, Hans]

        String f = names.element(); //ilk elemanı verir ama list'ten silmez,list boş ise exception atar
        System.out.println(f); //Alexandre
        System.out.println(names); //[Alexandre, Mark, Tom, Jeremy, Hans]

        //eleman silme ile ilgili çok fazla method var!! LİnkedList'ler de ilk elemanla ilgili birsürü method vardır.

        //Example 1 : A ile başlayan tüm isimleri "*****" e çeviriniz.

        LinkedList<String> students = new LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");
        System.out.println(students);

        for (String w : students){    //collectionlarda for-each loop en iyisi
            if (w.startsWith("A")){
                students.set(students.indexOf(w),"*****");
            }
            }
        System.out.println(students); //[Chris, *****, Mark, Tom, Jeremy, Hans]

        //INTERWİEW SORUSU!!!
        //Example 2: List'teki 4 harften çok harf içeren isimleri siliniz.

        for (int i = 0; i <students.size() ; i++) {  //burada eleman sayısını azaltacağımız için index'e ihtiyacımız olduğu için fori kullandık
            if (students.get(i).length()>4){
                students.remove(students.get(i));
                i--; //burada silinen elemandan sonra length uzunluğu değişeceği için artan indexi tekrar 0'a çektik
            }
        }
        System.out.println(students); //[Mark, Tom, Hans]

        }


    }


