package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {

        //Example 1:Asagidaki sekli ekrana yazdiran kodu yazinin
         // ****
         // ****
         // ****  --tekrarlı bir hareket olduğu için loop kullanılmalı.bir diğer loop saoldan sağa buda tekrarlı olduğu için yine loop kullanırız
                  //yukarıdan aşağı olan dış loop,soldan sağa olan iç loop

        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz.." );
        int satir = input.nextInt();

        System.out.println("Sütun sayısını giriniz..");
        int sutun = input.nextInt();

        System.out.println("karakter seçiniz..");
        char ch = input.next().charAt(0);

        for (int i = 1; i <= satir ; i++) {

            for (int k = 1 ; k<=sutun ; k++){///soldan sağa yazdırılan * işareti 4 tane olduğu için k<5 dedik
                System.out.print(ch);
            }
            System.out.println();
        }
        
        
        /*Example 2 : Aşağıdaki şekli çizen kodu yazınız.
                      1
                      1 2
                      1 2 3
                      1 2 3 4
                      1 2 3 4 5
       */

        for (int i = 1; i < 6 ; i++) {

            for (int k = 1 ; k <= i ;k++){  //satır sayısı 1 iken 1 tane , 2 iken 2 tane rakam olduğu için k<= i dedik
                System.out.print(k + " ");
            }
            System.out.println();
        }

        /*Exampple 3: Aşağıdaki şekli çizen kodu yazınız.

              * * * *
              * * *
              * *
              *
        */
        int row = 4;


        for (int i = 1; i <= row ; i++) {

            for(int k = row ; k>=i ; k--){   //kaç satır varsa ilk başta o kadar * var
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}
