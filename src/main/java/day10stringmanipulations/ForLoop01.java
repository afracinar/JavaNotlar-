package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {

        //loop-döngü demek
        //Tekrarlı işler için "loop" kullanırız
        //4 çeşit loop vardır: i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //Example 1:Ekrana 5000 kere "Hi" yazdırınız.
            //1.YOL
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //i)for-loop
            //2.YOL

         //for parantezi içinde 3 bölme olacak ve bölmeler ";" ile ayrılır
            //başlangıç değeri //loop hangi şart altında çalışacak //arttırma veya azaltma
        for( int i = 1         ;               i <6              ;         i = i+1                ){
            System.out.println("Hi");
        }

        //Example 3: 4'ten 7'ye kadar tüm tam sayıları ekrana yazdıran kodu yazınız.
        //tekrarlı işlem olduğu için loop kullanırız.

        for( int i = 4 ; i<8 ; i=i+1 ){  //birer birer artıyor
          //  System.out.println(i);  //i yi alt alta yazdırır
            System.out.print(i + " ");  //'print' olduğu için aynı satıra yazdırı. " " ekleyince de araya boşluk ekleyerek çalıştırır
        }
      // "i=i+3" ifadesi yerine "i+=3" ifadesi aynıdır. "i=i*3" ile "i*=3" ifadeleri aynıdır
        // "k=k-7" ile "k-=7" aynıdır . 1'er azaltmada "k--" kullanılabilir(bu tercih edilmelidir). "k=k/3" ile "k-=3" aynıdır
        //sadece 1 ile artırmada "i++" kullanılabilir
        System.out.println();

        //Example 4: 14 ten 5 e kadar tüm sayıları ekrana azdırın

        for(int i = 14 ; i>4 ; i--){   //birer birer azalttığımız için "i--" kullanıyoruz
            System.out.print(i + " ");
        }
        System.out.println();

        //example 5: 14 ten 5 e kadar tüm çift sayıları yazdırınız

           //1.YOL
        for(int i=14 ; i>4 ;  i=i-2){  // 14'ten 2 şer azaltıyoruz.12-10-8-6
            System.out.print(i+" ");
        }

           //***2.YOL***
        for(int i=14 ; i>4 ; i--) {

            if (i % 2 == 0) {  //eğer i çift ise yazdır
                System.out.print(i + " ");
            }

            System.out.println();
        }

            //Example 6 : 28 den 157 ya kadar tüm tek sayıları ekrana yazdıran kodu yazın
            for(int i = 28 ; i <158 ; i++ ){

                if(i%2!=0){
                    System.out.print(i+ " ");
                }

            }

        System.out.println();

            //Example 7 : "Java" String'ini "J*a*v*a*" stringine çeviren kodu yazınız.
        String str ="Java";
        for(int i =0 ; i<str.length() ; i++ ){                 //i index i temsil ediyor.bu yüzden 0 dan başlar
            System.out.print(str.charAt(i)+ "*");
        }

        System.out.println();

          //Example 8: Size verilen string'de tekrarsız karakterleri ekrana yazdırınız.
         //            "Hellooo Ali" ==> He Ai

        String s = "Hellooo Ali";
        for( int i =0 ; i<s.length() ; i++){

            char c = s.charAt(i);

            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }

        }



    }

}
