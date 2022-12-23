package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    /*
       1)FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
         "new"den sonraki "FileInputStream" hata verir.Çünkü biz Java'ya verilen adresteki dosya'ya git dedik.Java iki endişeye kapıldı:
          i)ya adres yanlışsa ii)ya verilen adresteki dosya yoksa.
          Biz method isminden sonra, "throws FileNotFoundException" yazarak,Java'ya bu iki endişe duyduğun durum oluşursa "Exception At" dedik

       2) while ((k= fis.read())!= -1){} yazdığımızda "read()" methodu hata verir.Çünkü biz Java'ya dosyadaki karakterleri oku dedik.Java bir endişeye kağıldı.
         i)ya okuması gereken karakterler Java'nın bilmediği karakterlerse Biz method isminden sonra "throws IOExceptions" yazarak Java'ya bu durumla karşılaştığında
         "Exception At" dedik

       3)method isminden sonra "throws IOExceptions" yazarsanız Java "throws FileNotFoundException" ı siler.Çünkü; "IOExceptions", "FileNotFoundException"ı kapsar
          "IOExceptions", "FileNotFoundException"ın parent'ıdır.onun yaptığı her şeyi yapabilir.o yüzden "IOExceptions"varken "FileNotFoundException"a gerek yok

          "IOExceptions","Input Output Exception" demektir

       4)Gördüğünüz gibi "IOExceptions" ve "FileNotFoundException" biz kod yazarken daha "run" butonuna basmadan ortaya çıktı.Bu tarz exception'lara
         "Compile Time Exception" denir,diğer adları "Checked Exception"dır

         "Compile Time Exception"lar kesinlikle halledilmelidir(Exception Handling).Halletmeden kod yazmaya devsm etmeyiniz.


     */
    public static void main(String[] args) throws IOException {
        readTheTextFromTheFile();
        readTheText();
    }

    //1.Yol
    //Bir text file'deki text'i okuyan kodu yazınız.
    public static void readTheTextFromTheFile() throws IOException { //IO,FileNotFound'un parent'ıdır

        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

        int k =0;
        while ((k= fis.read())!= -1){
            System.out.print((char)k);
        }
    }

    //2.yol--genelde daha çok kullanılır
    public static void readTheText(){
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

            int k =0;
            while ((k= fis.read())!= -1){
                System.out.print((char)k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosyanın adresi veya varlığı ile ilgili bir problem var");
        } catch (IOException e) {
            System.out.println("Dosyada okunamayan bir karakter var");
        }
    }
}
