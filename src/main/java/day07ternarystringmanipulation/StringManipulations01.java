package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*                   String Class Methodları:
           1)equals() : i) iki tane string in aynı olup olmadığını anlamamıza yarar.
                        ii) equals() methodu 'boolean'(true/false) return eder.

           2)equalsIgnorecase() : i) iki tane string in aynı olup olmadığını büyük,küçük harfe dikkat etmeden anlamamıza yarar
                                  ii) equalsIgnorecase() methodu "boolean" return eder

           3)toLowerCase() : i) bir string deki tüm harfleri küçük harfe çevirmek için kullanılır
                             ii)toLowerCase() methodu "String" return eder

           4toUpperCase() : i) bir string deki tüm harfleri büyük harfe çevirmek için kullanılır
                            ii)toUpperCase() methodu "String" return eder

           5)charAt() : i) bir string den belli bir index'deki characteri almak için kullanılır
                        ii) charAt() methodu "char" return eder

           6)lenght() : i) bir string de kaç tane character kullanıldığını öğrenmek için kullanılır.
                        ii) lenght() methodu "int" return eder

           7)contains() : i) bir string de belli bir characterin veya characterlerin var olup olmadığını anlamak için kullanılır.
                          ii) contains() methodu "boolean" retun eeder

           8)split() : i) bir string'i istediğimiz character den parçalamaya yarar.
                       ii)split() methodu "Array" return eder.
         */

        /* Example 1: Bir password'un geçerli olup olmadığını aşağıdaki kurallara göre kontrol eden kodu yazınız.
                       i)en az 8 karakter içermeli
                       ii)Space karakteri içermemeli
                       iii)ilk harfi "M" veya "m" olmalı
                       vi)son karakteri "?" olmalı
         */

        String pwd = "Manisa12?";

        //i)En az 8 karakter içermeli
        boolean first = pwd.length()>7;   //karşılaştırma işlemleri her zaman boolean verir

        //ii)Space characteri içermemeli
        boolean second = !pwd.contains(" ");

        //iii)İlk harfi "M" veya"m" olmalı
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

        //vi)Son characteri "?" olmalıdır   lenght()-1 ==> son index demektir
        boolean fourth = pwd.charAt(pwd.length()-1) =='?';

        System.out.println(first&&second&&third&&fourth);


    }

}
