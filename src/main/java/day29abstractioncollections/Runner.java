package day29abstractioncollections;

public class Runner {

    public static void main(String[] args) {

        //variable'ları interface isimleri ile çağırdığımız için aynı variable ismi olsa dahi Java karıştırmaz

        System.out.println(Engine.price); //2000

        System.out.println(Ac.price); //3000

        //variable'larda "aynı isim" ister "aynı data type" ile ister "farklı data type" ile kullanılsın farketmez,hata vermez
        // ancak methodlar da isim aynı ise farklı data type kullanılamaz


        System.out.println(Engine.weight); //23.5

        System.out.println(Ac.weight); //20

    }

}
