package day16multidimensionalarraysarrayllist;

import java.util.Arrays;

public class Multidimensionalarray02 {

    public static void main(String[] args) {

        //Example 1:  Bir multidimensional Array'deki en büyük ve en küçük elemanın toplamını veren kodu yazınız

        int arr[][] = { {2,5,1} , {83,75} };

        int maxElement = arr[0][0];  //Arrayden herhangi birini koyabiliriz.zaten diğer elemanlarla karşılaştıracağız

        int minElement = arr[0][0];

        for ( int [] w : arr){

            for (int k : w){

               maxElement = Math.max(maxElement,k);
               minElement = Math.min(minElement,k);

            }
        }
        System.out.println(maxElement); //83
        System.out.println(minElement); //1

        System.out.println(maxElement+minElement); //84


    }

}
