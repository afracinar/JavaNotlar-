package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1:Bir sayının pozitif olup olmadığını ekrana yazdıran kodu yazınız.

        //1.YOL:  (çok parantez vardır,karışıktır)
        int a = 12;
        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif değil..");
        }

        //2.YOL:  (ternary)(parantez,süslü parantez yoktur daha kullanışlı)
                //condition      condition doğru ise uygulanacak kod    :  condition yanlış ise uygulanacak kod
       String sonuc = a>0    ?   "Pozitif"                              :        "Pozitif değil";
        //a,0'dan büyük mü büyükse pozitif değilse pozitif değil
        System.out.println(sonuc);

        //Example 2:İki sayıdan küçük olanı seçen kodu yazınız
        int b = 120;
        int c = 13;
        int min = b<c ? b : c;
        System.out.println(min);


        //Example 3: verilen bir sayının mutlak değerini hesaplayan kodu uazınız
        //pozitif sayıların ve sıfırın mutlak değeri kendileridir.negatif sayıların mutlak değeri -1 ile çarpılmış halidir

        int d = -152;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Example 4:İki tane sayı aynı işaretli ise bu sayıları çarpınız,farklı işaretli ise işlem yapamam mesajı veriniz.
        int e = 12;
        int f = 10;
         //ternary de farlı data tipinde sonuç alırsak sonucun data type'ını 'Object' yaparız.
        Object sonuc2 = (e>0 && f>0) || (e<0 && f<0) ? e*f : "İşlem yapamam";
        System.out.println(sonuc2);

        //Note:Java da her class'ın en az bir tane "parent" (aile) classı vardır.Sadece object class ın parent class ı yoktur.
    }

}
