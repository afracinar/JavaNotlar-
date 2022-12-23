package day22inheritancepolymorphism;

public class Honda extends Car {

       public String color;


       public Honda(){
              super("White",54000); //bu bizi bir üst parentta parametresi string ve int olan constructor'a götürür
              System.out.println("Honda constructor");
       }

       public Honda(String color){
            this.color=color;
       }


}
