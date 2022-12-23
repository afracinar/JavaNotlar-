package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        double r1 = compareNumOfCharacters("Java","xy");
        System.out.println(r1);//2.0
        double r2 = compareNumOfCharacters(null,"xy");
        System.out.println(r2); //NullPointerException
        double r3 = compareNumOfCharacters("Selenium","");
        System.out.println(r2); //ArithmeticException

    }

    //Verilen iki String'den birinin karakter sayısının diğerinin kaç katı olduğunu veren methodu oluşturunuz
    public static double compareNumOfCharacters(String s,String t){

        double result =0;
        try{
            result = s.length()/t.length();
        }catch (NullPointerException e){
            System.out.println("length() methodu null ile kullanılamaz");
        }catch (ArithmeticException e){
            System.out.println("Herhangi bir sayı 0 ile bölünemez");
        }finally { //her durumda connection kesilir.her durumda bir fiilin yapılmasını istiyorsak "finally" kullanılmazlı
            System.out.println("Database ile connection kesilde");
        }

        return result;

    }

    /*  ***INTERWİEV
        Java'da birbirine benzeyen 3 tane keyword vardır: "final","finally","finalize".
        finally try-catch'lerle birlikte kullanılır.exception olduğu zaman veya olmadan kullanılabilir.
        1)"final" bir keyword'dür.Variable,Class ve Method'lar için kullanılır...
        2)"finally" bir "kod block"tur.
           "try-catch" veya sadece "try" ile kullanılır.
           "finally" code block içine yazılan code'lar her halükarda çalıştırılır.ve en sonda kullanılır.
           Mesal database ile connection'u kesmek her halükarda yapılması gereken bir fiildir.Bunu "finally" ile yapabilirz.
        3)"finalize" bir method'dur.Bu method Java tarafından data'lar imha edilmeden önce çağırılır,bu method data'ları imha edilecek hale getirir ve
           daha sonra "Garbage Collector" bu data'ları imha eder.

           NOTE:"finalize" methodunu Java developer'lar da çağırabilir ama Java kendi bildiğini yapar
     */

}
