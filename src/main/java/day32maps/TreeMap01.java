package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public  class TreeMap01 {

    /*
      TreeMap bir map'tir
      TreeMap'ler entrySet'leri key'lere göre "natural order"da sıralar.
      Natural order'da sıralamak emek isteyen bir iştir.bu yüzden treemap'ler en yavaş map'lerdir
      TreeMap'ler thread-safe ve syncronized değildir.
      Eğer thread-safe ve syncronized lazımsa tek seçenek HashTable
      Eğer elemanları sıralı istiyorsak tek seçenek TreeMap
      Eğer hız çok önemliyse tek seçenek HashMap.

     */
    public static void main(String[] args) {

        TreeMap<String,Double> salaries = new TreeMap<>();
        salaries.put("Tom Hanks",3000.00);
        salaries.put("Mary Star",1000.00);
        salaries.put("Jimmy Jones",5000.00);
        salaries.put("Kevin Bridgeman",6000.00);
        System.out.println(salaries); //{Jimmy Jones=5000.0, Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0} ==>Alfabetik soraya koydu

        //tailMap() verilen key'den başlayarak sona kadar tüm entrySet'leri bize verir.
        SortedMap<String,Double> map1=salaries.tailMap("Kevin Bridgeman");
        System.out.println(map1); //{Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        // "tailMap(String,false)" verilen key'den başlayarak sona kadar tüm entrySet'leri bize verir.ama sizin verdiğiniz key'i hariç tutar
        NavigableMap<String,Double> map2=salaries.tailMap("Kevin Bridgeman",false);
        System.out.println(map2); //{Mary Star=1000.0, Tom Hanks=3000.0}

        NavigableMap<String,Double> map3 = salaries.subMap("Kevin Bridgeman",true,"Tom Hanks",false);
        System.out.println(map3); //{Kevin Bridgeman=6000.0, Mary Star=1000.0}

        //lowerEntry() mwthodu bir öncekini verir
        Map.Entry<String,Double> map4 =salaries.lowerEntry("Mary Star");
        System.out.println(map4);//Kevin Bridgeman=6000.0

        //illa var olan key ile çalışmamız gerekmez.var olmayan key'i yazarsak sanki varmış gibi sıralamaya koyar ve bir öncekini verir
        Map.Entry<String,Double> map5 =salaries.lowerEntry("Paris Hilton");
        System.out.println(map5);//Mary Star=1000.0

        //higherEntry() bir sonrakini verir.En sonuncuyu yazarsak null verir.çünkü en sonddaki key'den sonra eleman yok
        Map.Entry<String,Double> map6 =salaries.higherEntry("Mary Star");
        System.out.println(map6);//Tom Hanks=3000.0

        //ceilingEntry() var olan key ile kullanılırsa o key'i verir
        Map.Entry<String,Double> map7= salaries.ceilingEntry("Mary Star");
        System.out.println(map7); //Mary Star=1000.0

        //ceilingEntry() var olmayan key ile kullanılırsa bir sonrakini verir
        Map.Entry<String,Double> map8= salaries.ceilingEntry("Paris Hilton");
        System.out.println(map8); //Tom Hanks=3000.0

        //floorEntry()  varsa var olanı verir.yoksa bir öncekini verir
        Map.Entry<String,Double> map9 =salaries.floorEntry("Mary Star");
        System.out.println(map9); //Mary Star=1000.0

    }
}
