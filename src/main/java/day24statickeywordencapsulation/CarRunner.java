package day24statickeywordencapsulation;

public class CarRunner {

    //static olmayanlar objeye bağlanır,static olanlar class'a bağlanır
    /*
    static keyword,class'a bağlanmış class elemanlarıdır.(class da method ve variable lar olur) yani static variable,static methodlar olur
    statik class elemanları bütün objelerin ortak elemanıdır(gökteki ay)
    staticler üzerinde yapılan her değişiklik bütün objeleri etkiler,bütün objeler tarafından görülür
    static class elemanlarına class üzerinden ulaşılır,objeler staticlere ulaşmak için kullanılmaz.kullanılırsa hata vermez ama tavsiye edilemez
    static'ler override edilemez.
     */

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //INTERWİEW SORUSU
        //static variable'lara objeleri kullanarak ulaşmak mümkün ama tavsiye edilmez çünkü uzun yoldur

        System.out.println(car1.counter); //4

        //static variable'lara Class ismi kullanarak ulaşılmaktadır
        System.out.println(Car.counter); //4
        System.out.println(car1.price); //20001 ==>price variable'ı static olmadığı için obje ile çağırabiliyoruz

        System.out.println(Car.counter); //4
        System.out.println(car2.price); //20001

        /*
        static lerde yaptığımız her değişiklik bütün objeler tarafından görülür.ancak objede yapılan değişiklik sadece o objeyi etkiler
         */

    }

}
