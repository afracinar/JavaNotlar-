package day32maps;

public class StaticBlocks01 {

    static {
        System.out.println("Static block 2");
    }


    public static void main(String[] args) {
        System.out.println("Main method");

    }

    public static double pi; //static variable class'la beraber varolur class'a yapışır

    //static block'lar ihtiyacımız olan variable'ların class oluşturma safhhasında elimizde olmasını sağlar
    //static block'lar Class içindeki herşey'den önce çalıştırılır."main method" dan ve diğer tüm method'lardan önce çalıştırılır.
    //static block'lardan içinde sadece "static variable" lara değer atanabilir
    //1'den fazla static block varsa üstteki önce çalıştırılır
    static {
        pi=3.14;
        System.out.println("Static block 1");
    }
}
