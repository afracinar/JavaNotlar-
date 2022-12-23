package day28abstraction;

public class Cat extends Mammal{


    //burda da Mammal Class'ta bahsedilen ii) ihtimalini yaptık yani override ettik

    /*
       Bir method "parent class"ta "abstact method" ise;
       ==Child class o methodu "override" edip kullanmak zorundadır
       ==Bu yüzden herhangi bir fonksiyonu "Child Class" için mecburi yapmak isterseniz o methodu "abstract" yapmalısınız.
       Yani bir methodun kullanılmasını zorunlu kılmak istiyorsak "abstarct" yapmalıyız.abstract,child'lar için kullanılması zorunludur

     */
    @Override
    public void eat() {
        System.out.println("Cats eat..");
    }

    @Override
    public void move() {
        System.out.println("Cats move..");
    }
}
