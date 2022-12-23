package day22inheritancepolymorphism;

public class VehicleRunner {

    /*
     Bir obje oluşturmak için farklı constructor'ların kombinasyonuna ihtiyaç vardır.birkaç constructor'a ihtiyaç vardır
     Constructor çağırırken herhangi bir parent es geçilemez,yani her parent'a uğramak zorundayız
     */

    public static void main(String[] args) {

        //Example 1: Car türünde rengi beyaz  olan,54000 km'de, 250.000 tl fiyatı olan 2020 model bir HondaAccord arıyorum.

        HondaAccord hacc=new HondaAccord(250000,2020); //Vehicle constructor
                                                                 //Car constructor
                                                                 //Honda constructor
                                                                 //Honda Accord Constructor




    }

}
