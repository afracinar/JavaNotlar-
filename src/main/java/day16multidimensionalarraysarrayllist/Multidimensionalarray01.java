package day16multidimensionalarraysarrayllist;

import java.util.Arrays;

public class Multidimensionalarray01 {

    public static void main(String[] args) {

        //Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
        //Array veya Collection var ama "index" kullanmak zorundasınız o zaman "for-each-loop"çalışmaz, "for-loop" veya "while-loop" veya "do-while-loop" kullanmalısınız
        //index kullanacaksak for-each-loop kullanamayız.


        //Example 1:Bir tane integer multidimensional array oluşturunuz
        //bu Array'daki tüm sayıların toplamını veren kodu yazınız.

        int arr[][] = { {2,5,1} , {32,75} , {13,21,43,56} };

        int sum = 0;  //toplam bulmamız gerektiği için bunu oluşturmalıyız.

        for (int[] w : arr){  //{2,5,1} ==> bir Array'dir.

            for (int k : w){

                sum = sum + k;

            }
        }
        System.out.println(sum); //248


        //Example 2: Bir multidimensional array'i normal array'e çeviren kodu yazınız.
        //{ {2,5,1} , {32,75} } ==> {2,5,1,32,75}

        //İlk olarak multidimensional array'deki eleman sayısı bulunur çünkü yeni array'in uzunluğu orijinal array uzunluğuna eşit olmalıdır

        int brr[][] = { {2,5,1} , {32,75} };
        int toplam = 0 ;

        for ( int[] w : brr){

            toplam = toplam + w.length;
        }
        System.out.println(toplam); //5

        int crr[] = new int[toplam]; //yeni Array'i oluşturduk

        int idx = 0;

        for (int[] w : brr){

            for (int k : w){
                crr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));  //[2, 5, 1, 32, 75]



















    }

}
