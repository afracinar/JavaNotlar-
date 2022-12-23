package day23inheritancepolymorphism;

public class Bird extends Animal{

    /*  INTERWİEV SORUSU*****
        "final" keyword nedir?

        "final" keyword  i)Variable'larda kullanılabilir.
                               public final int age =12;
                             **  a)Bir değer atandıktan sonra atanan değer değiştirilemez
                             **  b)mutlaka değer ataması yapmak zorundasınız.

                         ii)Method'larda kullanılabilir.
                               public final int aa(){
                                      return a+b
                                      }
                               a)bir method oluşturulurken "final" olarak oluşturulmuş ise o methodun buddy'si asla değiştirilemez
                               b)dolayısıyla "final"methodlar override edilemezler.çünkü override da method  buddy'si değiştirilir

                         iii)Class'larda kullanılabilir
                               Bir class'ı "final" yaparsanız o class'ı kısırlaştırmış olursunuz.
                               yani bir class final ise onun child'ı olamaz,o class'a extend edilemez
                               "final" class child olabilir.

     */

}
