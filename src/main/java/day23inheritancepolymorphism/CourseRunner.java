package day23inheritancepolymorphism;

public class CourseRunner {

    public static void main(String[] args) {

        Math math = new Math(); //obje .obje ismini class'ın ismi ile aynı yapmak çok sık karşılaşacağımız bir şeydir.obje ismi küçük harfle başlıyor

        math.liveSessions(); //Courses are live
        math.practise(); //Solve questions

        Math math1 = new Math(6);   //math class'ından obje oluşturduk.Java math class'ının constructorunı kullanacağını anlıyor.parametre de int olduğu
       //math class'ında par. int olan   //için parametresi int olan constructor'ı seçer
                                        //kullanmak istediğimiz diğer constructor aynı class'ta ise "this()" kullanılır."this()" parantez içi boş olursa aynı
                                        //class'taki parametresi boş olan constructor'ı kullanır.String yazılırsa string parametresi olan kullanılır
                                       //parantez içine string yazarsak string olan cons kullanılır
                                     //Constructor B
                                     //Constructor 1
                                     //Constructor 2 ekranda yazar.constructor'lardayaratılış yukarıdan aşağıya doğrudur.


    }
}
