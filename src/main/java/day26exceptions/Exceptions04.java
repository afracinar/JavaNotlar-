package day26exceptions;

public class Exceptions04 {

    /*
       Exception'lar ikiye ayrılır:Run Time Exception(Unchecked Exception)-Compile Time Exception(Checked Exception).
     */
    public static void main(String[] args) {

        int age =-25;
        try{
            printAge(age);
        }catch(IllegalArgumentException e){ //kullandığımız kod hangi exceptionu atarsa catch içine o yazılır.
            System.out.println(e.getMessage());
        }
    }

    //yaşı ekrana yazdıran bir method oluşturunuz
    //bu methodda exception ürettik.
    public static void printAge(int age){  //ekrana bir şey yazdırdığı ve yeni bir data üretmediği için "void" kullandır
                                 // yanlış data kullanımlarında(mesela kullanıcı yaşı - girdi) hata try-catch ile çözülür.çünkü kod çalışmayı durudurmalı
        if (age<0){
            throw new IllegalArgumentException("Yaş negatif olamaz."); //("uygun olmayan değer hatası at" dedik) hata atıldıktan sonra kod çalışmaz durur
        }
        System.out.println(age);
    }
}
