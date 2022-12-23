package day28abstraction;

public class Dog extends Mammal {


    //animal parent class'ında 2 tane abstract method olduğu için ikisini de override ettik

    @Override
    public void eat() {
        System.out.println("Dogs eat..");
    }

    @Override
    public void move() {
        System.out.println("Dogs move..");
    }
}
