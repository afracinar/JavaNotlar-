package day26exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

       char ch1 = getCharFromString("Java",2);
        System.out.println(ch1); //v

        char ch2 = getCharFromString("Selenium",8);
        System.out.println(ch2);//StringIndexOutOfBoundsException(String indexi'inin sınırları dışındasın): Eğer bir string'den character/ler alırken olmayan bir
                                                      //index kullanılırsa  StringIndexOutOfBoundsException alır

    }
    public static char getCharFromString(String str,int idx){

        char c =' ';
        try {
            c = str.charAt(idx);

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("İndex ile ilgili bir problem oluşur");

            System.out.println(e.getMessage()); //teknik mesaj

            //System.out.println("İndex ile ilgili bir problem oluştu"+ e.getMessage());//bu şekilde aynı satıra da yazılabilir

            e.printStackTrace(); //detaylı hata raporu verir. ("log" applicationun adım adım neler yaptığını gösterir.adım adım hataları gösterir.
                        //****INTERWİEW SORUSU:Hata aldığınızda ne yaparsınız?- log'lara bakarız
        }

        return c;

    }

}
