package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    boolean flag = true;

    //kullanıcının hesap nosu ve pin numarası değerlerini eşleştirmek için:
    HashMap<Integer,Integer> data = new HashMap<>();

    public void login(){

        System.out.println("ATM'ye HOŞGELDİNİZ");

        do{
            data.put(12345,1234);
            data.put(23456,2345);
            data.put(34567,3456);
            data.put(45678,4567);


            try{
                System.out.println("Hesap numaranızı giriniz");
                setAccountNumber(input.nextInt()); //kullanıcının girdiği hesap numarasını atıyor
                System.out.println("Pin numaranızı giriniz");
                setPinNumber(input.nextInt());



            }catch (Exception e){
                System.out.println("Yanlış karakter girdiniz.Lütfen sadece rakam giriniz.Çıkmak için Q ya basınız");
                input.nextLine(); //işlemin arasına boşluk koyar çakışmaması için
                String exit = input.next();
                if (exit.equalsIgnoreCase("q")){
                    flag=false;
                }


            }

            int counter=0;
            for (Map.Entry<Integer,Integer> w : data.entrySet()){
                if (w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())){
                    getAccountTypes(); //hesap no ve şifre doğruysa sisteme giriiş yapabilir

                }else{
                    counter++;
                }
            }
            if (counter==data.size()){
                System.out.println("Yanlış hesap numarası veya pin numarası girdiniz");
            }

        }while(flag); //flag=true






    }





    //Vadesiz,Checking hesap işlemleri
    public void checkingOperations() {

      do {

          disPlayMessage();
        int secim = input.nextInt();
         if (secim==4){
              break;
         }

         switch (secim){
             case 1:
                 System.out.println("Checking hesabınızda kalan bakiye: "+moneyFormat.format(getCheckingBalance()));
                 break;
             case 2:
                 getCheckingWithdraw();
                 break;
             case 3:
                 getCheckingDeposit();
                 break;
             default:
                 System.out.println("Yanlış seçenek' lütfen 1,2,3 veya 4 ü giriniz");
         }

      }while (true); //döngü doğru olduğu müddetçe işlem yapılıyor

        getAccountTypes();
    }

    //vadeli hesap işlemleri
    public void savingOperations(){

        do {

            disPlayMessage();
            int secim = input.nextInt();
            if (secim==4){  //hesaptan çıkış yapmak istrse yani 4'e basarsa döngü sonlanır
                break;
            }
            switch (secim){
                case 1:
                    System.out.println("Saving hesabınızda kalan bakiye: "+moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("Yanlış seçenek' lütfen 1,2,3 veya 4 ü giriniz");
            }

        }while (true);
        getAccountTypes();

    }

    //ilgili hesap türünü seçtirme
    public void getAccountTypes(){
        System.out.println("İşlem yapmak istediğiniz hesabı seçiniz");
        System.out.println("1: Checking (Vadesiz Hesap)");
        System.out.println("2: Saving (Vadeli Hesap");
        System.out.println("3: Quit (Çıkış)");

        int secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Checking/Vadesiz Hesabınızdasınız");
                checkingOperations();
                break;
            case 2:
                System.out.println("Saving/Vadeli Hesabınızdasınız");
                savingOperations();
                break;
            case 3:
                System.out.println("ATM makinamızı kullandığınız için teşekkür ederiz");
                flag=false;
                break;
            default:
                System.out.println("Yanlış seçenek' lütfen 1,2,3 veya 4 ü giriniz");

        }

    }

    //kişi için seçenekleri görüntüle
    public void disPlayMessage (){

        System.out.println("Opsiyon seçiniz");
        System.out.println("1: View Balance (Hesap Özeti)");
        System.out.println("2: Withdrraw (Para Çekme)");
        System.out.println("3: Deposit (Para Yatırma)");
        System.out.println("4: Exit (Çıkış)");

    }
}
