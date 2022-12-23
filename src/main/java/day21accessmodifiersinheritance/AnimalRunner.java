package day21accessmodifiersinheritance;

public class AnimalRunner {

    /*
      1) "Inheritance" sayesinde (inheritance==> child class'ın parent class'taki method ve variable'ları kullanabilmesidir.
         i)Code tekrarlarından kurtuluruz.
         ii)Code tamiri kolay olur.
         iii)Child class'ları daha atomik yapmış oluruz.Bu sayede de application'u  hızlandırmış oluruz.

         Note:Child class'taki ortak methodlar parent class'a konulur.Child class'lara özel methodlar parent'a konulmaz,child class içinde kalır

      2)Bir class'ı başka bir class'ın child class'ı yapmak için "extends" keywordu kullanılır.İlk yazılan Class Child,ikinci yazılan Class parent olur.

      3)Child Class object'leri,Parent Class'tan method ve variable'ları kullanabilirler.(çocuk babanın yazlığını kullanabilir.)

      4)Parent Class object'leri Child Class'tan method ve variable'ları kullanamazlar.(baba çocuğunun yazlığını kullanamaz)

      5)Object class her class'ın parent'ıdır.(tüm class'ların ortak babası olan class : Object Class'tır.(object class-->hz.adem)
        Java'da object class hariç her class'ın parent'ı vardır.
        Java'da parent'ı olmayan tek class object class'tır.

      6)Private method ve variable'lar,child class'lar tarafından kullanılamazlar.(inherite edilemezler)
        protected method ve variable'lar,child class'lar tarafından kullanılabilir.Çünkü aynı package içindeler ve child-parents ilişkisi kurulmuş
        Bir method private ise inherite edilemezler.
        "default" method ve variable'lar,aynı packege'deki child class'lar tarafından kullanılabilir.
        "public" method ve variable'lar,child class'lar tarafından kullanılabilir.

        NOTE:Inherite yapabilmek için oluşturduğumuz method'un acces modifier'i "public ve protected" ise bir sorun olmaz."default" olursa başka package'den
             kullanılamaz

        NOTE: "child class'lar tarafından kullanılabilir" olmak "inherit edilebilir" demektir

       7) 4 tip interitance vardır:
          i)Multilevel Inheritance: Java bunu kabul eder
          ii)Hierarchial Inheritance : Bir parent için çoklu child,Java bunu kabul eder
          iii)Multiple Inheritance: Bir child'a çoklu parent,Java bunu desteklemez
          vi)Single Inheritance: Bir child class için bir parent class demektir, Java bunu destekler
     */

    public static void main(String[] args) { //Runner'lar içine main method konur

        Q4Cat c1 = new Q4Cat();  //Q4Cat objesi oluşturduk

        //normalde Q4Cat Class içinde sadece meow methodu vardır ama biz Q4Cat'i Q3Animal'ın child'ı yaptığımız için Q4Animal'daki methodlaı da kullanabiliriz

        c1.eat(); //Animals eat...
        c1.drink(); //Animals drink...
        c1.meow(); //Cats meow...
        c1.hashCode(); //mesela bu method animal class'ta tanımlı değildir.Object class'ın içinde vardır.bu nedenle gözükür

        Q5Dog d1 = new Q5Dog();  //Dog objesi oluşturduk

        d1.eat(); //Animals eat...
        d1.drink(); //Animals drink...
        d1.bark(); //Dogs bark...

        Q6Bird b1 = new Q6Bird();

        b1.eat();
        b1.drink();
        b1.tweet();


    }
}
