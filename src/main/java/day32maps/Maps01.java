package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps01 {

    public static void main(String[] args) {

        //INTERWİEV SORUSU

        //Size erilen bir cümledeki her kelimenin kaç kere kullanıldığını gösteren kodu yazınız.
        //"I like to move it, move it." ==> I=1, like=1, to=1, move=2, it=2

        String str = "I like to move it, move it.";
        //ilk olarak noktalama işaretlerini silmemiz gerekir.çünkü Java dilinde it, ile it. farklıdır.

        str = str.replaceAll("\\p{Punct}","");
        System.out.println(str); //I like to move it move it

        //Kelimeleri almak için split methodunu kullanırız.split() methodu size array verir
        String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[I, like, to, move, it, move, it]

        //key-value yapısı oluşturacağımız için map kullanırız.eğer alfabetik sırada göster deseydi "treemap" kullanırdık.hızlı olması için hashmap kullanırız
        HashMap<String,Integer> gorunum = new HashMap<>();
        for (String w : kelimeler){  //array'lerde for-each kullanmak iyidir
            Integer gorunumSayisi = gorunum.get(w);  //gorunum map'inde w var mı diye kontrol ediyor.yoksa null veriyor,varsa değerini verir
            if (gorunumSayisi==null){
                gorunum.put(w,1);
            }else{
                gorunum.put(w,gorunumSayisi+1);
            }
        }
        System.out.println(gorunum); //{move=2, like=1, I=1, to=1, it=2}


    }
}
