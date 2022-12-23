package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
    Collection diyince birden fazla data'nın depolanmasını anlamalıyız
    Biz birden fazla datayı depolamak için array ve arraylist'leri gördük.List'ler collection'lara dahildir.Array'ler değildir
    Collection diyince 3 temel yapıyı anlamamız lazım: 1)list(ArrayList ve LinkedList olarak ayrılır) 2)Queue(kiyu 3)Set
    Collection interface'tir.içinde hep abstract methodlar olur.Collection'dan object oluşturulamaz.
    ArrayList'ler 3 şekilde oluşturulur:
       ArrayList<Integer> myList = new ArrayList<Integer>();
       List<Integer> myList = new ArrayList<Integer>();
       List<Integer> myList = new ArrayList<>(); ==>data type arraylist'te olabilir,parent'ı olan lis'te olabilir,collection da yapabilirizçünkü parent

    List'lere çoklu ve tekrarlı data depolamak istediğimizde ihtiyaç duyarız(okuldaki öğrenci isimleri-çokludur ve tekrarlı isimler olabilir)
    Set'lere çoklu ama tekrarsız data depolamak için ihtiyaç duyarız(bir okuldaki öğrenci ID'lerini depolamak için-çoklu ve tekrarsızdır)
    Queue'lere (FIFO-first in first out-ilk giren ilk çıkar veya LIFO-last in first out) gerektiğinde queue kullanılır-bir bankadaki sıra application'u FIFO çalışır
       queue kuyruk demek yani sıra
     */
     //BENİM NOTLARIM
    /*ArrayList'ler index kullanır ama index kullanmak eleman ekleme ve eleman silme işlemlerinde bize zaman kaybettirir.Çünkü birçok elemanın "re-index"
       edilmesi gerekir.Yani bir eleman silinse veya eklense diğer elemanların index'leri değişir.Bu dezavantajdır.
       Avantajı:Eleman bulmada çok başarılıdır.index adresi verir direk elemanı bulur
      Java bu sorunu yeni bir yapı oluşturarak çözmüştür: LinkedList (Linked-birbirine bağlanmış demek)

     *LinkedList'teki her eleman iki bölümden oluşur.ilk bölümde "değer" olur.bu bölümde data olduğu için ilk bölüme "data bölümü" denir
     *İkinci bölümler ise "pointer bölümleri"dir.pointer bir sonrakini gösterir.Bu iki bölüme "Node" denir.En son node'ın pointer kısmı "null" gösterir
     *En son "node"un özel bir ismi vardır: "Tail"(kuyruk) demek.En başta ise "Head" içinde sadece pointer kısmı vardır data bölümü yoktur.
     *Eleman silme ve eleman ekleme LinkedList'te çok kolaydır.bu yüzden eleman ekleme ve eleman silme işlemlerini çokça yapacağınız durumlarda
       LinkedList kullanılmalıdır.(mesela müzeye gelen ziyaretçiler-sürekli eleman eklenir ve silinir)
     *ArrayList eleman bulma(search) işlemlerinde çok başarılıdır.Çok fazla arama yapmamız gereken durumlarda kullanırız(sözlükte arrayList kullanmak iyidir)
     *LinkedList node bulma(search) işlemlerinde başarısızdır.çünkü index ile çalışmaz Çok fazla ekleme çıkarma yapmak durumunda kalırsak kullanırız
     *ArrayList'i çok fazla arama yapmamız gerekn durumlarda,LinkedList'i ise çok fazla ekleme silme yapmamız gereken durumlarda kullanırız
     */
    /*
       1) LinkedList'teki her eleman iki bölümden oluşur:   1)Data Bölümü   2)Pointer Bölümü
       2) LinkedList'teki herbir eleman "Node" olarak adlandırılır.
       3) LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.(Array ise çok başarısızdır)
       4) LinkedList'ler eleman arama işlemlerinde başarısızdırlar. (Array'de ise index'ten dolayı çok başarılıdır)
       5) 3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdr
       6) ArrayList'ler index kullanır,LinkedList'ler index kullanmaz
       7) İndex kullanmak eleman bulma işlemlerinde çok başarılıdır,bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız
     */

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();     //bütün collectionlarda data type'ı yazmalıyız "<>" arasına
        visitors.add("Tom");   //ArrayList'lerde de "add()" methodu vardı.add() methodu ArrayList ve LinkedList için ortak methoddur.
        visitors.add("Hanks");  //ortak methodlar parent'a konur."Parent List" interface olduğu için "add()"methodu abstract methoddur
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add("Brad Pitt"); //son ikisisondadan yazıldı
        visitors.add("Tom Hanks");

        System.out.println(visitors); //[Tom, Hanks, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.add(2,"Angelina Julie"); //2.index'e ekleme yapar.LinkedList index varmış gibi yazdırır.normalde index LinkedList'te çalışmaz
        System.out.println(visitors);  //[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        //LinkedList'ler ekleme ve silme işlemlerinde çok başarılı olduğu için ekleme ve silme ile alakalı bir sürü method içerir
        visitors.addLast("Ajda Pekkan"); //en sona ekler bu method
        visitors.addFirst("Cüneyt Arkın"); //bu method en başa ekler
        System.out.println(visitors); //[Cüneyt Arkın, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Ajda Pekkan]

        visitors.removeLast(); //sondaki elemanı siler
        System.out.println(visitors); //[Cüneyt Arkın, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.removeFirst(); //ilk elemanı siler
        System.out.println(visitors); //[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.removeFirstOccurrence("Brad Pitt"); // bu method "Brad Pitt" in ilk görünümünü siler
        visitors.removeLastOccurrence("Tom Hanks"); // bu method "Tom Hanks" in son görünümünü siler

        /*
       removes and returns the first element of this list. (siler ve verir)
       This method is equivalent to removeFirst().
       Throws:NoSuchElementException – if this list is empty (eğer list boş ise hata verir)
         */

        //pop() methodu 2 işlem yapar:ilk elemanı siler ve sildiği elemanı bize verir.
        String firstEl = visitors.pop(); //Cut + Paste e benzer "kes-yapıştır"
        System.out.println(firstEl); //Tom
        System.out.println(visitors); //[Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        //LinkedList boş ise NoSuchElementException atar
        LinkedList<String> myList = new LinkedList<>();
        myList.pop(); //NoSuchElementException atar.çünkü boş bir list'tir  


    }
}
