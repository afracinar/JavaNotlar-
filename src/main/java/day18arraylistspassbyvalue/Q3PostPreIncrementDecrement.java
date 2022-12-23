package day18arraylistspassbyvalue;

public class Q3PostPreIncrementDecrement {
    public static void main(String[] args) {

        //sertifika sınavlarında 2-3 soru gelir
        //Post = sonra
        //Pre = önce

        //PostIncrement (arttırmayı sonra yap)
        int a = 5;
        int b = a++; //== Java anlamlı bir cümle bulduğunda hemen uygular.bu yüzden "a" yı gördüğü anda bunu okur. ++ kısma gelmez.("a"yı arttıracak)
        System.out.println(b); //5 ==> Java arttırma kısmına gelmeden önce a yı okur
        System.out.println(a); //6

        //PreIncrement (arttırmayı önce yap)
        int c = 10;
        int d = ++c; //(arttıracak "c"yi)
        System.out.println(c); //11
        System.out.println(d); //11

        //Postdecrement
        int e = 20;
        int f = e--; //"e"yi azaltacak
        System.out.println(f); //20 ==> çünkü java soldan geliyor ve ilk "e"yi görüyor."e" java için anlamlı(20) olduğu için java bunu okur
        System.out.println(e); //19 ==>"e"yi 1 azalt

        //Pre Decrement
        int h = 30;
        int i = --h; //(azaltacak "h"yi)
        System.out.println(i); //29
        System.out.println(h); //29 ==> "h"yi 1 azalt

    }

}
