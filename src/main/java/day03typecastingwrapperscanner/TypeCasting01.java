package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric data type'ini diğer numeric data type'ne çevirmek demektir
    //Numeric Data Type'leri: byte < short < int < long < float < double

    // Küçük data type'ini büyük data tipine çevirmeye 'Auto Widening' (otomatik genişletme) denir.
    //Büyük data type'ini küçük data type'ne çevirmeye 'Explicit Narrowing' (Açıkça daraltma) denir.

    public static void main(String[] args) {

        byte age = 23;  //main method içindeyken 'public'yazmasak da olur
        int newAge = age;

        //Büyük data type küçük data type çevirilirken Java hata verir bu nedenle riski bizim aldığımızı belirtmek için
        // '(int)' ifadesini ekleriz.
        long population = 1234;
        int newPopulation = (int)population;

        //Example 1: short'u double'a çeviren kodu yazınız.

        short height = 160;
        double newHeight = height;     //Auto Widening-java bunu otomatik olarak yapar

        //Example 2: float'ı byte te yapan kodu giriniz.

        float price = 12.99F;
        byte newPrice =(byte)price;   //Explicit Narrowing-açıkça daraltma
        System.out.println(newPrice);    //ekrana sonuç 12 olarak yansır.küsüratı sistem okumaz çünkü byte tam sayıdır,
                                         //Java ondalık sayıyı tam sayıya çevirirken yuvarlama işlemi yapmaz.
                                        //Java ondalık kısmı tam sayıya çevirirken ondalık kısmı siler.

        int number = 515;
        byte newNumber = (byte)number;
        System.out.println(newNumber);  //cevap 3 çıkar nedeni Java 515 i 256(byte içindeki sayıların sayısı)ya
                                        // böldü kalanı return etti.
                                        //256 ise byte değeri -128,127 arasında 256 sayı olduğu için

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);     //cevap -2 çıkar nedeni sonucun byte değer aralığında çıkmasını sağlamak.

    }




}
