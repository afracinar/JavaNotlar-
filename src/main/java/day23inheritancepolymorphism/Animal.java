package day23inheritancepolymorphism;

public class Animal {

    public void eat(){
        System.out.println("Animals eat..");
    }

    public int add(int a,int b){   //return type'ı primitive ise; overriding methodun return type'ı da aynı olur,değiştirilemez
        return a+b;
    }

    public Integer multiply(int a,int b){ //return type'ı wrapper class ise overriding methodun return type'ı da aynı olur,değiştirilemez
        return a+b;
    }

    //aşağıdaki method "Overriden" method olarak adlandırılır
    public Animal create(){  //parent class'taki methodun return type'ı Parent Class ise return type child'lardan biri olabilir.
        return new Animal();
    }



}




