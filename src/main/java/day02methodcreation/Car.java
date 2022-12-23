package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        //Object nasıl oluşturulur?
        //1)Class ismini yazınız   2)Objeye isim veriniz   3) =   4)new keyword'unu kullan   5)Class ismini parantezle beraber
             Car                      myHonda                 =        new                        Car();
        System.out.println(myHonda.marka);
        System.out.println(myHonda.fiyat);

        myHonda.hareketEt();
        myHonda.dur();

        //MethodCreation class'ından object oluşturduk.
        MethodCreation myPensil = new MethodCreation();
        System.out.println(myPensil.toplamaYap(12, 8)); //methodun olduğu class'tan obje yapıp,o class'taki methodları çağırabiliyoruz


    }

    //Ekrana sadece yazı yazdırıyorsak return type void yapılır
    public void hareketEt(){
        System.out.println("Honda güzel hareket eder...");
    }
    public void dur (){
        System.out.println("Honda güvenli olur... ");
    }



}
