package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practise(){

        System.out.println("Solve questions");
    }

    public Math(){                //parent class içinden bir cons kullanmak istiyorsak "super();" kullanılır
            super("x");          //içine String ifade yazıp courses parent'taki içinde parametresi string olan constructor kullanılır
        System.out.println("Constructor 1");
    }

    public Math(int a){     //aynı class içinde bir constructor'ı kullandıktan sonra aynı class'tan başka constructoru kullanmak istiyorsak "this()" yazarız.
        this();                //bu class taki parametresiz cons kullan diyoruz.parantez içine string yazsaydık parametresi string olan cons kullanılırdı
        System.out.println("Constructor 2");
    }
}
