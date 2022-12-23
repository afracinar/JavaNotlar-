package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
    NOTE:map'ler 3 türdür:HashMap-HashTable-TreeMap
        1)HashTable bir Map'tir.
        2)HashTable entrySet'leri herhangi bir sıralamaya tabi tutmaz.
        3)HashTable, HashMap'lerden daha yavaştır.Çünkü HashTable'lar thread-safe ve synchronized(çoklu işlerin zaman kazandıracak şekilde sıralanması'dır.
      **  4)HashTable'larda key "null" olamaz.key'i null yaparsanız "NullPointerException" atar
      **  5)HashTable'larda value "null" olamaz.null olursa "NullPointerException" atar

      //INTERWİEV SORUSU: HashMap ile HashTable arasındaki farklar nelerdir?
     ***  1) Hashmap thread-safe ve synchronized değildir.HashTable thread-safe ve synchronized'dır
     ***   HashMap'lerde null hem key hem value'larda kullanılabilir.HashTable'larda null key ve value de kullanılaamaz,exception atar

        NOTE: "toString()" methodu obje'leri console'da detayları ile birlikte görebilmek için class'ların içinde oluşturulur.
               "toString()" methodu oluşturmadan obje'leri console'a yazdırırsanız Java o objelerin adresinin console'a yazdırı
     */

    public static void main(String[] args) {
        Hashtable<String,Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",83000000);
        countryPopulations.put("Turkey",90000000);
        System.out.println(countryPopulations); //{USA=400000000, Germany=83000000, Turkey=90000000}

       // countryPopulations.put(null,90000000); //nullexceptionn atar
       // countryPopulations.put("France",null); //nullexception atar


        //kendi oluşturduğumuz clas'ı data type olarak  kullanılabiliriz
        //value'yı toString methodu yazdırır bundan dolayı "Student{name='Tom Hanks', email='th@gmail.com', age=21, success=true}" bu şekilde görürüz
        //nasıl görmek istiyorsak "toString"i o şekilde düzenleyebiliriz

        Hashtable<String, Students> myStudents =new Hashtable<>();
        myStudents.put("Math",new Students("Tom Hanks","th@gmail.com",21,true));
        System.out.println(myStudents); //{Math=Student{name='Tom Hanks', email='th@gmail.com', age=21, success=true}}

       Students name = myStudents.get("name");
        System.out.println(name); //null verdi çünkü get() key ile çalışır.burada key "Math"dir

        //HashTable'a yerleştirdiğimiz dataları istersek birer birer alabiliriz(bütün map'lerde bunu yapabiliriz)

        String name2 = myStudents.get("Math").name;  //key'si Math olan datanın sadece name'ini ver
        System.out.println(name2); //Tom Hanks

        int yas =myStudents.get("Math").age; //key'i "Math" olan datanın age'ini ver
        System.out.println(yas); //21
    }
}
