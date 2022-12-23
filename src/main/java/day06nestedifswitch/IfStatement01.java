package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Type a code, get age from user and decide which stage on it(kulllanıcıdan yaş değerini alan kodu yaz
        //yaşın hangi evrede olduğunu aşağıdaki tabloya göre ekrana yazdırın
        //0 - 4 => baby (bebek)
        //5 - 12 => child (çocuk)
        //13 - 20 => teenager (genç)
        //21 - 30 => adult (yetişkin)
        //else (not expected age)(tanımlanmamış evre)
        //Bu tarz sorularda küçükten büyüğe gitmeliyiz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz..");
        int yas = input.nextInt();

        if(yas<0){
            System.out.println("Lütfen geçerli yaş giriniz..");  // - değerler için hata mesajı oluşturmalıyız
        }else if(yas<5){                            //<= ifadesi iki değerli olduğu için kodu sadeleştirmemiz için < yapıyoruz
            System.out.println("Bebek");
        }else if(yas<13){
            System.out.println("Çocuk");
        }else if(yas<21){
            System.out.println("Genç");
        }else if(yas<31){
            System.out.println("Yetişkin");
        }else{
            System.out.println("Tanımlanmamış evre");
        }    //kod test edilirken kesinlikle kritik değerler kullanılmalıdır.-1,0,1,3,4,5,11,12,13,19,20,21,30

    }

}
