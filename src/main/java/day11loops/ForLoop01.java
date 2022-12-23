package day11loops;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: 3'ten 6'ya kadar tam sayıların toplamını bulan kodu yazınız.
           //"variable içindeki sayıyla variable toplama" sürekli bu döngü tekrar edilir bu yüzden loop kullanılır

        int sum = 0;   //0 toplama işlemi için etkisiz eleman olduğu için 0 kullandık.
        for(int i = 3 ; i<7 ; i++){

            sum = sum + i;

        }
        System.out.println(sum);  //loop bittikten sonra sout yazdırılmalı.loop içine konulursa her loop sonucunu yazdırır.(3-7-12-18 şeklinde yazdırır)
                                  //sadece son değeri görmek istersek sout loop dışına konulur.
          //sout loop dışına yazılırsa "sum"ın sadece son değeri ekrana yazdırılır
          //sout loop içine yazdırılırsa her bir loop için "sum"ın hangi değerleri aldığını yazdırır.


        //Example 2: 6'dan 3'e kadar tamsayıların çarpımını yazan kodu yaz

        int carp = 1;
        for(int i = 6 ; i>2 ; i--){   // 6'dan 2'ye gitmek için azalması lazım bu yüzden "i--" kullandık

            carp = carp * i;

        }
        System.out.println(carp);


        //Example 3: Size verilen bir tam sayının rakamları toplamını bulunuz.

       int num = 38512222;
       num = Math.abs(num);  //negatif sayılar için mutlak değer e çevirdik.
       int sonuc = 0; //yeni değeri koyacağımız variable oluşturuyoruz.0 kullandık çünkü 0 toplama için etkisiz eleman

       for(int i = num ; i>0 ; i=i/10){
          sonuc = sonuc + i%10;
       }
        System.out.println(sonuc);


       //Example 4: Size verilen bir stringi ters çeviren kodu yazınız.  ****interview sorusu
        //                "Kaba" ==> "abaK"

        String str = "Kabak gibi kabak";
        String ters = "";
        for(int i = str.length()-1; i>=0 ;i-- ){  //yazdırmaya son karakterden başlayacağımız için length()-1 yapıyoruz.
                                                  // 0.index dahil olduğu için >= yapıyoruz veya i>-1 yapabiliriz
            char c = str.charAt(i);

            ters = ters + c ;

        }
        System.out.println(ters);





    }


}
