package day18arraylistspassbyvalue;

public class Q4Varargs01 {
    /*
    Varargs ==> Variable Argumans demek.(int...a)-bu yapı varargs'dır.Varargs dipsiz kuyu gibidir herşeyi kabul eder.Varargs'ın arkasında Array çalışır

    1)Farklı sayılardaki parametrelerle çalışabilen bir method oluşturmak isterseniz "varargs" kullanmalısınız
    2)"Varargs" arka tarafta "Array" kullanır,bu yüzden "Varargs"larla çalışırken "Array" lerle çalışıyormuş gibi davranabilirsiniz
    3)"Varargs" oluşturmak için "<data type>... <varargs ismi>" veya "<data type> ...<varargs ismi>"şeklinde yazılır
        yani ya "..." ya isme ya da data type'a yaslanır.
    4)Bir methodda "varargs"ın yanında başka bir parametre kullanılabilir mi?
        ==>Evet. "varargs" en sonda olmak şartı ile kullanılabilir.Çünkü "varargs"lar dipsiz kuyu olduğu için ilk kullanılırsa her şeyi içine alır
        (String a,int... b) -->kullanılabilir. (int... b,String a) -->kullanılamaz
    5)Bir method'da birden fazla "varargs" kullanılabilir mi?
       ==>Hayır."varargs" en sonda olmak zorunda olduğundan,birden fazla kullanırsak en az biri en sonda olmayacaktır.Bu da 4.kural ile çelişir.
     */

    public static void main(String[] args) {

        int r1 =add(2,3);
        System.out.println(r1); //5

        int r2 = add(2,3,4);
        System.out.println(r2); //9

        int r3 = add(2,3,4,5,6,7,8,9);
        System.out.println(r3); //44

    }
 /*          //İki sayının toplamını return eden method oluşturun.

            public static int add(int a,int b) {  //2 sayı topladığımız için methoda iki tane sayı koymalıyız
                return a + b;
            }
             //Üç sayının toplamını return eden method oluşturun.

            public static int add ( int a, int b, int c){
                return a + b + c;
                }

            //İstediğimiz kadar sayıyı toplayacağımız bir method oluşturalım(tek methodla istediğimiz kadar sayı toplayabiliyoruz)
 */         public static int add(int... a){ //varargs'ın arkasında Array çalışır.Bu yüzden Array içindeki sayıları toplarken loops kullandığımız
                                                      //için burda da loops kullanırız

               int sum = 0;

               for(int w : a){
                    sum=sum+w;
                 }
                 return sum;
    }
}



