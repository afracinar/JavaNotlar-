package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.io.* ==>io. daki her şeyi import eder

//readLine() methodu file'ı satır satır okur.Bu methodu kullanabilmemiz için "new BufferedReader" objesine ihtiyacımız vardır.çünkü method objenin içindedir

public class ReadFileLineByLine {    //ReadFileLineByLine== dosyayı satır satır oku

    public static void main(String[] args) {

        readFileLineByLine();
    }
    public static void readFileLineByLine(){ //bu method file'ı satır satır yazdırır bundan dolayı void kullandık
      ////BufferedReader file'ı satır satır okutur.input işlemidir bu yüzden Java onu io. kütüphanesine koymuştur
        try {                    //obje oluşturduk.BufferedReader constructor'ı şikayet eder çünkü parametre ile çalışır.bu cons "new FileReader" objesi ile çalışır
                                //BufferedReader() bir constructordır,bu constructor ise "FileReader" objesi ile çalışır.okutacağımız dpsyanın adresini gireriz
                               //sonra "FileReader" kısmı kızarır çünkü Java endişeye kapılır: ya adres yanlışsa, ya da adreste doya yoksa
                               //bu endişeyi gidermek için ya "try-catch" yaparız ya da method signiture'a "throws" ekleriz

            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\day27exceptions\\File1.txt")); //Java burda dosyaya ulaştı

           String line = br.readLine(); //burda da dosyayı okuttuk.readLine dosyaya gider ilk satırı alır.String vereceği için string'e atadık
            //"readLine"da kızarır endişeye kapılır:ya satırda bilmediğim karakter varsa .bunun için "more.." diyip catch "ıo exception" kullandık

            //diğer satırları da almalı,tekrarlı işlem olur
            while(line!=null){   //satır null değilse
                System.out.println(line); //yazdır
                line = br.readLine();  //br.  readLine() ile diğer satırı okur ve line'a atar
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlış ya da dosya silinmiş-"+ e.getMessage());
        } catch (IOException e) { //çoklu catch kullanacaksak child önce parent en sona yazılmalı
            System.out.println("okunamayacak karakter veya karakterller var-"+e.getMessage());
        }
    }

}
