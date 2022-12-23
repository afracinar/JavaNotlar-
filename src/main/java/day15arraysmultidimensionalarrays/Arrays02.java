package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Size verilen pozitif ve negatif sayılar içeren bir int Array'deki en büyük negatif ve
        //en küçük pozitif elemanı bulunuz

        int arr[] = {-12, 18, -5, 23, -2, 0};
        Arrays.sort(arr);  // [-12, -5, -2, 0, 18, 23]
        System.out.println(Arrays.toString(arr));

        int maxNeg = arr[0]; //-12   //maximum negatif bize -12'yi verir
        int minPoz =arr[arr.length-1]; //23

        for(int w : arr){

            if (w<0){
               maxNeg = Math.max(maxNeg,w);
            }
            if (w>0){
                minPoz = Math.min(minPoz,w);
            }

        }
        System.out.println("Maximum Negatif:" + maxNeg + " " + "Minimum Pozitif:" + minPoz);



    }


}
