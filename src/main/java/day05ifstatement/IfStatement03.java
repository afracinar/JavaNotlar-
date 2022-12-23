package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    //iki tane string'in birbirine eşit olup olmadığını anlamak için "==" değil "equals()" kullanınız."Ali equals Ali"
    /* iki tane string in birbirine eşit olup olmadığını kontrol etmek için 2 tane method kullanılabilir
       i)"equals() ==> büyük harf ile küçük harfi önemser. "A" ile "a" farklıdır
       ii)"equalsIgnoreCase() ==> büyük harf küçük harfi önemsemez. "A" ile "a" aynıdır
                 Ignore-umursamamak case-büyük,küçük harf
     */
    public static void main(String[] args) {

        //Example 1: Kullanıcıdan gün isimlerini alınız.o günü hafta sonu mu hafta içi mi olduğunu kullanıcıya söyle.

        Scanner input = new Scanner(System.in);

        System.out.println("Bir gün ismi giriniz...");

        String days = input.next();  //gün isimlerinin tamamı tek kelime olduğundan next kullanıldı

        //1.YOL
        if (days.equalsIgnoreCase("Pazar")){   //equals methodunu iki string i karşılaştırmak için kullanılır.
            System.out.println("Hafta sonu...");
        }else if(days.equalsIgnoreCase("Pazartesi")){  //equalsIgnorecase ise büyük küçük harfe dikkat etmez
            System.out.println("Hafta içi...");
        }else if (days.equalsIgnoreCase("Sali")){
            System.out.println("Hafta içi..");
        }else if (days.equalsIgnoreCase("Çarşamba")){
            System.out.println("Hafta içi..");
        }else if (days.equalsIgnoreCase("Perşembe")){
            System.out.println("Hafta içi..");
        }else if (days.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta içi..");
        }else if (days.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else{   //sayılan 7 ihtimal dışında yazılan her şey için "else" ifadesi kullanlır.
            System.out.println("Geçerli bir gün ismi giriniz...");
        }

      //2.YOL
        if(days.equalsIgnoreCase("pazar") || days.equalsIgnoreCase("cumartesi")){
            System.out.println("HAFTA SONU..");
        }else if(days.equalsIgnoreCase("pazartesi") ||
        days.equalsIgnoreCase("salı") ||
        days.equalsIgnoreCase("çarşamba" )||
        days.equalsIgnoreCase("perşembe")||
        days.equalsIgnoreCase("cuma")){
            System.out.println("Hafta içi..");
        }

        //3.Yol  standartlara en çok uyan yoll çünkü parantez içleri sadedir daha az karmaşıktır
        boolean haftaSonu = days.equalsIgnoreCase("Pazar") || days.equalsIgnoreCase("Cumaretsi");
       boolean haftaİci = days.equalsIgnoreCase("pazartesi") ||
                          days.equalsIgnoreCase("salı") ||
                          days.equalsIgnoreCase("çarşamba" )||
                          days.equalsIgnoreCase("perşembe")||
                          days.equalsIgnoreCase("cuma");
       if(haftaSonu){
           System.out.println("Hafta sonu..");
       }else if(haftaİci){
           System.out.println("Hafta içi..");
       }else{
           System.out.println("Geçerli bir gün ismi giriniz..");
       }

    }

}


