package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {

        //Bir Array'in elemanları Array ise bu Array'ler "Multidimensional Array"dir.

        //Multidimensional Array nasıl oluşturulur ?
        //iki boyutlu Array ise 2 köşeli parantez açıyoruz
        int arr[][] = new int [3][2];
        System.out.println(Arrays.deepToString(arr)); //[[0, 0], [0, 0], [0, 0]]

        //Multidimensional Array'lere eleman ekleme nasıl yapılır?
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][0] = 6;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        //Multidimensional Array console'a nasıl yazdırılır?
        System.out.println(Arrays.deepToString(arr)); //[[3, -4], [6, 18], [-7, 0]]  //dibine kadar yazdır

        //Multidimensional Array'lerde Array elemanlardan biri nasıl yazdırılır? --mesela [6,18]
        System.out.println(Arrays.toString(arr[1]));  //[6,18]

        ////Multidimensional Array'lerde iç Array'lerdeki elemanlardan biri nasıl yazdırılır? --mesela sadece 6 yı yazdıralım
        System.out.println(arr[1][0]); //6

        //Example 1: String bir multidimensional Array oluşturunuz,elemanları ekleyiniz,sonrada toplam eleman sayısını ekrana yazdıran kodu yazınız.

        String brr [][] = new String[4][3];
        brr[0][0] = "A";
        brr[0][1] = "B";
        brr[0][2] = "C";

        brr[1][0] = "D";
        brr[1][1] = "E";
        brr[1][2] = "F";

        brr[2][0] = "G";
        brr[2][1] = "H";
        brr[2][2] = "I";

        brr[3][0] = "J";
        brr[3][1] = "K";
        brr[3][2] = "L";

        System.out.println(Arrays.deepToString(brr));  //[[A, B, C], [D, E, F], [G, H, I], [J, K, L]]
        int sum = 0;

        for (String[] w : brr ){  //data tipi olarak String[] yazılır.

            sum = sum + w.length;

        }

        System.out.println(sum); //12

    }

}
