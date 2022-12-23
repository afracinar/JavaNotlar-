package day04ifstatement;

public class ifStatement01 {

    public static void main(String[] args) {

        //If it rains I will cancel the picnic
        //If statement belli kodları belli şartlara bağlı olarak çalıştırmaya yarar

        //Example 1:Sayı pozitif ise ekrana pozitif yazdırın.
        int s = 12;

        if(s>0){
            System.out.println("Positive");

        }

        //Example 2: Verilen karakter büyük harf ise ekrana 'büyük harf'yazdırın.
        char ch = 'S';

        if(ch>='A' && ch<='Z'){  //Java da ve yazılamadığı için && bu ifade kulllanılır  //ASCII değerlerine bakılır.
            System.out.println("Büyük Harf");
        }

        /*
              && işlemi sadece boolean'larda kullanılır.iki tane kullanılmasının sebebi:
              mantıksal ifadelerin birinde yanlış bulursa diğerlerini kontrol etmeye ihtiyaç duymaz bu da kodu hızlandırır.
              tek & kullanılırsa mantıksal ifadelerin hepsini kontrol eder yanlış bulsa bile kontrole devam eder bu da kodu yavaşlatır
                 true && true = true
                 true && false = false
                 false && true = false
                 false && false = false
             true almanın tek yolu hepsinin true olmasıdır.
             && işlemi mükemmelliyetçidir.true sonucunu alabilmek için herşey true olmalıdır
         */

        //Example 3: Verilen bir sayı 3 basamaklı ise ekrana "üç basamaklı" yazdırınız.
        int x = -123;
        x = Math.abs(x);  // Math.abs() ifadesi sayıyı pozitife çevirir.absolute value (abs) mutlak değer demektir.
        if (x>99 && x<1000){  //x>=100 && x<=999 diye de yazılabilir genelde hangisinde az karakter kullanılıyorsa o tercih edilir
            System.out.println("Üç Basamaklı");
        }

        //Example:4 Verilen sayı çift sayı ise ekrana "çift sayı" yazdırınız.
        int a = -10;
        a = Math.abs(a); //Math.abs() ifadesi yazılmasa bile Java sonucu bulur çünkü matematik bilir
        if (a%2==0){
            System.out.println("Çift Sayı");
        }
            /*
               "=" işareti atama operatörüdür.matematikteki eşittir anlamına gelmez
               Matematikteki eşittir sembolü Java da "==" şeklindedir.
             */

        //Example 5:Verilen sayı 300 den büçük veya 1200 den büyükse ekrana "Harika Sayı" yazdırın.
        int r = 350;
        if (r<300 || r>1200){  //Java veya yazmayı bilmez bunun yerine || ifadesi kullanılır.
            System.out.println("Harika Sayı");
        }
          /*
             || (veya) sadece boolean ile kullanılır
             true  || true  =  true
             true  || false =  true
             false || true  =  true
             false || false =  false
           Note:|| işleminde false alabilmek için her şeyin false olması gerekir
                || işleminde sadece bir tane true sonucu true yapmaya yeter.
           */
    }
}
