package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber; //hesapnumarası
    private int pinNumber; //şifre

    private double checkingBalance; //vadesiz hesap bakiyesi
    private double savingBalance; //vadeli hesap bakiyesi
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }



    //para çekme ==>azalma olacak - return edecek-küsürat olacağından double kullandık
    //para cekme = paraCekmeIslemindenSonraKalanMiktar    amount=miktar
    private double calculateCheckingBalanceAfterWithdraw(double amount){

        checkingBalance=checkingBalance-amount;

        return checkingBalance;

    }

    //para yatırma ==> para yatırma işleminden sonra kalan bakiyeyi hesapla
    private  double calculateCheckingBalanceAfterDeposit(double amount){

        checkingBalance = checkingBalance+amount;

        return checkingBalance;

    }

    //para çekme: saving hesabından para cekildikten sonra kalan bakiye
    private double calculateSavingBalanceAfterWithdraw(double amount){

        savingBalance=savingBalance-amount;
        return savingBalance;

    }

    //para yatırma: saving hesabından para yatırdıktan sonra geri kalan bakiyeyi hesaplayınız
    private  double calculateSavingBalanceAfterDeposit(double amount){

        savingBalance = savingBalance+amount;
        return savingBalance;
    }

    //Müşteri ile para çekmek için etkileşime geçelim -checking hesap
    public void getCheckingWithdraw(){ //checking hesabından para çekme

       // System.out.println("Checking hesabınızda bulunan bakiye: "+moneyFormat.format(checkingBalance));
        displayCurrentAmount(checkingBalance);
        System.out.println("Çekeceğiniz miktarı giriniz");
        double miktar = input.nextDouble();

        if (miktar<=0){
            System.out.println("sıfır ve eksi miktarlar geçersizdir");
            getCheckingWithdraw(); //recursive method denir==>methoduu tekrar çağırarak aynı işlemi tekrarladık.burası çokomelliiii!!!
        }else if(miktar<=checkingBalance){
            calculateCheckingBalanceAfterWithdraw(miktar);
          //  System.out.println("Checking hesabınızda bulunan bakiye: "+moneyFormat.format(checkingBalance));
            displayCurrentAmount(checkingBalance);
        }else{
            System.out.println("Yetersiz bakiye!!");
        }
    }

    //Para yatırma  (checking hesap ) işlemii için müşteri ile etkileşime geçelim

    public void getCheckingDeposit(){

      //  System.out.println("Checking hesabınızda bulunan bakiye: "+moneyFormat.format(checkingBalance));
        displayCurrentAmount(checkingBalance);
        System.out.println("Yatırmak istediğiniz miktarı giriniz");
        double yatırılanMiktar = input.nextDouble();

        if(yatırılanMiktar<=0){
            System.out.println("Sıfır ve eksi miktar yatıramazsınız");
            getCheckingDeposit(); //aynı methodu tekrar çağırdık başa döndürdük
        }else{
            calculateCheckingBalanceAfterDeposit(yatırılanMiktar);
            System.out.println();
          //  System.out.println("Checking hesabınızda bulunan güncel bakiyeniz: "+moneyFormat.format(checkingBalance));
            displayCurrentAmount(checkingBalance); //kapattığımız kodu aşağıda method haline getirip kullandık
        }
    }

    //Müşteri ile para çekmek için etkileşime geçelim -saving hesap
    public void getSavingWithdraw() { //saving hesabından para çekme

        // System.out.println("Checking hesabınızda bulunan bakiye: "+moneyFormat.format(savingBalance));
        displayCurrentAmount(savingBalance); //yukarıda kapattığımız kodu method haline getirdik daha dinamik olsun diye.güncel bakiyeyi method çağırarak görüyoruz
        System.out.println("Çekeceğiniz miktarı giriniz");
        double miktar = input.nextDouble();

        if (miktar<=0){
            System.out.println("Sıfır ve eksi miktar çekemezsiniz");
            getSavingWithdraw(); //müşteri yanlışgirerse diye methodu tekrar çağırdık ve işlemi başa döndürdük
        }else if (miktar<=savingBalance){
            calculateSavingBalanceAfterDeposit(miktar);
            displayCurrentAmount(savingBalance);
        }else{
            System.out.println("Yetersiz bakiye");
        }
    }

    //Para yatırma  (saving hesap ) işlemii için müşteri ile etkileşime geçelim

    public void getSavingDeposit() {

      //  System.out.println("Saving hesabınızda bulunan bakiye: " + moneyFormat.format(savingBalance));
        displayCurrentAmount(savingBalance);

        System.out.println("Yatırmak istediğiniz miktarı giriniz");
        double yatırılanMiktar = input.nextDouble();

        if (yatırılanMiktar<=0){
            System.out.println("Sıfır veya eski miktarlar geçersizdir");
            getSavingDeposit();
        }else{
            calculateSavingBalanceAfterDeposit(yatırılanMiktar);
            displayCurrentAmount(savingBalance);
        }


    }

    public void displayCurrentAmount(double blance){ //bu method ile checking ve saving işlemlerinden sonra yazdırdığımız güncel bakiye dinamik hale getirdi
        System.out.println("Hesabınızda bulunan güncel bakiyeniz: "+moneyFormat.format(blance));
    }


}
