package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {

    public static void main(String[] args) {

        //INTERWİEW SORUSU****

        //Size verilen bir kelime de kullanılan harflerin kaçar kere kullanıldığını gösteren kodu yazınız
        //abbcaa ==> a=3, b=2, c=1,

        String kelime = "abbcaa";
        HashMap<String,Integer> gorunum = new HashMap<>();

        String[] arr = kelime.split("");
        System.out.println(Arrays.toString(arr)); //[a, b, b, c, a, a]

        for (String w : arr){
            Integer gorunumSayisi = gorunum.get(w); //get() value verir.sonucu Integer olur
            if (gorunumSayisi==null){
                gorunum.put(w,1);
            }else{
                gorunum.put(w,gorunumSayisi+1);
            }
        }
    }
}
