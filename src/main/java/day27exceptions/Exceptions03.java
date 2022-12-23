package day27exceptions;

public class Exceptions03 {
    /*
       1)Java exception'lar oluşturarak developerların Java kurallarına uymalarını temin etmiştir.
       2)Biz de Application üretirken kendi exceptionlarımızı oluşturarak diğer developerların bizim ortaya koyduğumuz kurallara uymalarını temin ediriz
       3)Bizim ürettiğimiz exception'lara "Custom Exception" denir.(Javanın değil dev lerin ürettiği exceptionlardır)
       4)Custom Exception'larda "Runtime Exception" ve "Compile Time Exception" olabilir.
       5)Custom "Run Time Exception"(unchecked exception) üretmek için extends "RunTimeException" deriz
       6)Custom "Compile Time Exception"(checked exception) üretmek için "extends Exception" deriz
     */

    /*
            ****** INTERWİEV SORUSU *****
             "throw" ile "throws" arasındaki farklar nelerdir?
             1)"throw" methodun budy'si içinde kullanılır."throws" ise methodun isminden sonra kullanılır.(signiture ile curly bracces arasına
             2)"throw" dan sonra obje oluşturulur."throws" dan sonra ise sadece Exception Class'ın ismi yazılır
             3)"throw" methodun içinde istediğimiz yerde exception üretmek için kullanılır."throws"ise var olan checked(compile) Exception'ı atmak için kullanılır
             4)"throw"dan sonra sadece bir tane exception olabilir."throws"tan sonra birden fazla exception olabilir.(virgül koyup exception atayabiliriz)
             * runtimeexception'larda throws kullanılmaz.compiletime exception'larda throws veya try-catch kullanılır
           */

    public static void main(String[] args) throws IllegalGradeException {

       printGrades(120);
       checkNameFormat("ali");
    }

    //Oğrenci notlarını yazdıran bir method oluşturunuz.
    public static void printGrades(double grade) throws IllegalGradeException {

        if (grade<0 || grade>100){
            throw new IllegalGradeException("Grade 0'dan az 100'den çok olamaz.");
        }else{
            System.out.println(grade);
        }
    }

    //Verilen ismin ilk harfinin büyük harf olmaması durumunda exception atan method yazınız.
    public static boolean checkNameFormat(String name){
        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else{
            throw new IllegalNameException("İsimler büyük harfle başlamalıdır");
        }
    }
}
