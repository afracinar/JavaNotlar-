package day31maps;

import java.util.HashMap;

public class HashMap02 {
    //HashMap,bakıt'ların içinde LinkedList kullanıyor.
    //HashMap'ler interview sorusu olabilir
    /*
      1)Siz "HashMap<String,Double> salaries = new HashMap<>();" bu kodu yazdığınızda Java memory'de 16 kutu (bucket) içeren bir yapı oluşturur ve bu
          yapıdaki herbir kutuya index verir.index'ler 0 dan 15 kadardır
       2)Siz "salaries.put("QA",110000.00);" kodunu yazdığınızda Java key için bir HashCode oluşturur.Bu HashCode'u 16'ya böler ve kalanı index olarak kullanır
        ve bu elemanı o index'e yerleştirir
       3)Yerleştirirken 4'lu bir yapı oluşturur:
              ilk bölüm = HashCode
              ikinci bölüm = Key
              üçüncü bölüm = Value
              dördüncü bölüm = pointer
              Bu çok bölümlü yapı LinkedList'lerdeki "Node"'dur.Yani HashMap bucket'lara koyduğu data'yı LinkedList olarak depolar
      4)Java "null" için hep HashCode olarak "zero" üretir.o yüzden key null olduğunda eleman ilk bucket'a yerleştirilir.Bundan dolayı key'si null olan
            elemanlar Map'in içinde genellikle ilk sırada gözükürler.
      5)Java normalde HashCode'ları unique yapar ama bazen trafik kazası gibi farklı iki eleman için aynı HashCode üretilebilir. Buna "HashCollision" denir.
      HashCollision meşhur bir Java development problemidir. Bu problemle karşılaşıldığında developer'lar bu problemi çözmek için kodlar yazarlar, ama bu
      Core Java'nın konusu değildir.
*/
    public static void main(String[] args) {

        HashMap<String,Double> salaries = new HashMap<>();
        salaries.put("QA",110000.00);
        salaries.put("Dev",130000.00);
        salaries.put(null,0.0); //key null olduğunda hashcode 0 verir.en üst bakıta yerleştirilir

    }
}
