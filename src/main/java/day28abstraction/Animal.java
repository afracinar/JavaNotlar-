package day28abstraction;

public abstract class Animal {

    //abstraction-soyutlama , concreat-somut demektir.Abstract soyut demek olduğu için vücudu yoktur yani methodun budy'si yoksa abstract olur
    //parent'a konulan methodun budy'si hiçbir Child tarafından kullanılmazsa bu "kullanılmayan code"dur,yazılmamalıdır.Bu code budy'siz hale gelir
    //budy'si olmayan method'lar(method var budy'si yok) "abstract method" olarak adlandırılır."budy" varsa "concreate method"dur

    //NOTE: Bir methodu "abstract" yapmak için i)method budy'i sil ii)access modifier ile return type arasına "abstract" keyword kullan
    //abstract methodlar "abstract class" içinde olmalıdır.access modifier ile class arasına "abstract" keyword yazılır.
    //"abstract method"ların kullanılması Child'lar için zorunludur.Bütün çocuklara methodun kullanılması mecbur kılınır

    public abstract void eat();  //budy'si yok abstract method'dur

    //"abstract class"larda hem "abstract" hem de "concrete" method(somut-non-abstract) kullanılabilir
    public void drink(){
        System.out.println("Animals drink..");
    }

    //abstract "move" method oluşturunuz.
    public abstract void move();  //budy yok
}
