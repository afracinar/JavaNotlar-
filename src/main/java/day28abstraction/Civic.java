package day28abstraction;

public class Civic implements Engine,Ac,Hood{  //Bir class'ı bir interface'in child'ı yapmak için "implements" kullanırız.İstediğimiz kadar parent ekleriz
    //Interface'ler için "Multiple Inheritance" mümkündür.

    //NOTE:Class'ı abstract yaparsak methodları override etmemize gerek kalmaz


    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gus");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi technology");
    }

    //"Ac interface"indeki methodları da kullandık.çünkü abstract methodlar olduğu için child class'lar tarafından kullanılmak zorundadır
    @Override
    public void digital() {
        System.out.println("Uses digital AC");
    }

    @Override
    public void climate() {
        System.out.println("Uses climate technology");
    }

    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }
}
