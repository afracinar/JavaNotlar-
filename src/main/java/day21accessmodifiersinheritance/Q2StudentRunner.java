package day21accessmodifiersinheritance;

public class Q2StudentRunner {

    public static void main(String[] args) {

        //Normal applicationlarda 1 tane "main method" olur.Bir sürü class olur.Her class'a main method konulmasına gerek yoktur.
        //1 tane main method diğer class'lardaki kodların çalışması için yeterlidir
        //Runner Class,içinde "main methodu" olan class'tır.
        //Runner Class'tan diğer class'lara ulaşıp kodları çalıştırabilmek için ilk önce obje oluşturmamız lazım.
        // Ulaşmak istediğimiz class'tan obje oluştururz (class ismi+obje ismi+ new keyword+constrocter


        Q1Student std1 = new Q1Student() ;  //obje oluşturduk
        System.out.println(std1.stdName); //Tom Hanks

        System.out.println(std1.adres); //protected --aynı package içinde başka class'tan ulaşabiliriz

        System.out.println(std1.email); //default --aynı package içinde başka classtan ulaşabiliriz


    }


}
