package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        /*
          Example 1 : kullanıcıdan bir sayi aliniz sayi 100 den kucuk ise ekrana kazandin yazdiriniz
            aksi halde ekrana kaybettin yazdiriniz
         kullanici kazandikca oyun devam etmeli
      */

        Scanner input = new Scanner(System.in);

 /*       int sayi = 0;

        do {
            System.out.println("Bir sayı giriniz");
            sayi = input.nextInt();
            if (sayi<100){
                System.out.println("Kazandınız");
            }
        }while(sayi<100);
        System.out.println("Kaybettin..");
*/

       // Example 2:Kullanıcıdan isimler alınız ilk harfinin büyük olup olmadığını kontrol ediniz..

 /*       do {
            System.out.println("Lütfen isminizi giriniz..");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf>='A' && ilkHarf<='Z'){
                System.out.println("İsmi başarıyla girdniz");
            }else{
                System.out.println("İsmi yanlış girdiğiniz için işleminiz iptal edilmiştir");
                break;
            }
        }while (true);

*/
        //Infinite Loop : Sonsuz döngü. loop oluştururken sonsuz olmamasına dikkat etmeliyiz.

        //Arttırma azaltma kısmında hata yaparsak infinite loop sorunsalı oluşur
  /*      for (int i = 1; i <4 ; i--) {
            System.out.println("Hi!");  //sonsuz döngüye girer
        }
*/
 /*       //Arttırma azaltma kısmını yazmazsak infinite loop sorunsalı oluşur
        for (int i = 1; i < 4; ) {  //arttırma azaltma kısmı olmadığı için sürekli 1<4 ifadesinin kontrol eder ve doğru olduğundan sonsuz döngüye girer
            System.out.println("Hi!");
        }
*/

        //Arttırma azaltma kısmını yazmazsak infinite loop sorunsalı oluşur
        int i =12;
        while (i<15){
            System.out.println("Hi!");
        }

    }
}