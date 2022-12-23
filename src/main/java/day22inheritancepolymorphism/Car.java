package day22inheritancepolymorphism;

public class Car extends Vehicle{


    public String color;
    public int km;
        public Car(){

        }

        public Car(String color,int km){
            super("Car"); //bu bizi bir üst parentta parametresi string olan constructor'a götürür
            this.color=color;  //verilen rengi variable'daki renge ata
            this.km=km;
            System.out.println("Car constructor");


        }

}
