package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        //Hatırlatma:
        //ArraList'ler eleman sayısında esneklerdir,kaç eleman koyacağımızı söylemek zorunda değiliz
        //Array oluştururken ise eleman sayısını söylemek zorundayız,söylediğimizden daha fazla eleman koyamayız
        //ArrayList içinde çok sayıda method vardır,Array'lerde az sayıda method vardır.List'ler Array'lerin geliştirilmiş halidir
        //ArrayList'lere sadece non-primitive'ler konulabilir,Array'lere primitive data type'lerini ve reference koyabiliriz
        //Array'lerin basit yapısı vardır bu nedenle memory'de az yer kaplarlar ve daha hızlı çalışırlar
        //Eleman sayısının değişmeyeceğinden eminsek Array kullanmalıyız,eleman sayısının değişmeyeceğinden emin değilsek ArrayList'ler kullanılmalıdır


        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);   //[Tom, Thomas, Tahsin, Trump, Taceddin]==> isimler list'e eklenme sırasına göre sıralandı

        List<String> cities = new ArrayList<>();  //çok elemanı bir anda silmek istiyorsak yeni list oluştururuz ve removeAll kullanırız.
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        //removeAll(Collection<?> c) methodu bir list den birden fazla eleman silmek istiyorsak kullanılır.
        //removeAll() kullanırsak parantez içine mutlaka list koymalıyız
        //removeAll kullandığımızda sadece ilk list değişir,parantez içindeki ikinci list değişmez

        names.removeAll(cities);  //names listi değişiyor.isimler list'inden şehirler list'inin hepsini sil demek
        System.out.println(names);  //[Thomas, Tahsin]
        System.out.println(cities); //[Trump, Tom, Taceddin]


        //containsAll() methodunda bir listin içinde çoklu elemanların var mı yok mu diye kontrol etmek istediğimizde kullanılır.
        // parantez içine list konulmalıdır
        //hepsi varsa ture alınır,biri eksikse false verir

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");
        boolean sonuc1 = names.containsAll(myNames); //true verir.çünkü myNames listinin içinde ikisi birden vardır
        System.out.println(sonuc1); //ture



        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //Example 1: "a" listinde "Shoes" elemanının ilk görünümünü silin
        //İlk görünümü silmekten bahsettiğimiz için remove kullanırız.direk shoes'ı sil dediği için parantez içine "Shoes" yazarız
        a.remove("Shoes");
        System.out.println(a);  //[TV, Radio, Laptop, Shoes, Book, Shoes]

        //Example 2:"Shoes elemanının tüm görünümlerini siliniz
        //Tüm görünümleri silin dediği için removeAll() kullanırız.removeAll() list ile kullanılır.kullanacağımız zaman yeni bir list oluşturmak zorundayız.
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);  //a list'inden silinecekler list'inin hepsini sil
        System.out.println(a);  //[TV, Radio, Laptop, Book]


        //Example 3:Bir tane salary listi oluşturun,eğer salary 10000'den az ise %20,10000 ve 10000'den çok ise %10 zam yapınız.

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary); //[12345.0, 8674.5, 15000.75, 9500.0, 20500.0]

        for(Double w :salary){

            if (w < 10000){
                       //zam yapmak değeri değiştirmek demektir bu yüzden "set()" methodu kullanılır.set methodu değişimlerde kullanılır
                salary.set(salary.indexOf(w),w*1.2); //w nın indexi bulunur oraya yeni değeri koyar.


            }else{

                salary.set(salary.indexOf(w),w*1.1 );

            }

        }
        System.out.println(salary);  //[13579.500000000002, 10409.4, 16500.825, 11400.0, 22550.000000000004]

        //Example 4:İki arraylist'in eşit olup olmadığını kontrol eden kodu yazınız
        //NOTE:iki ArrayList'in eşit olabilmesi için elemanlar eşit olmalı,aynı elemanlar aynı index'te olmalı
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

           //1.YOL:  index kullanacağımız için forloop kullanmalıyız
        int counter = 0;
        for (int i = 0; i<m.size(); i++){

            if (m.size()!=n.size()){
                counter++; //bunu ekledik çünkü list sayıları eşit değilse counter artar ve 0'a eşit olmaz
                System.out.println("Listler eşit değildir");
                break;
            }else if((m.get(i) != n.get(i))){    //m den alacağımız eleman n den alacağımız elemana eşit mi?
                counter++;
                System.out.println("Listler eşit değildir");
                break;

            }
        }
        if (counter==0){
            System.out.println("Listler eşittir");

        }

        //2.YOL
        boolean esitMi = m.equals(n);
        if (esitMi){
            System.out.println("Listler eşittir");
        }else{
            System.out.println("Listler eşit değildir");
        }
        }
    }



