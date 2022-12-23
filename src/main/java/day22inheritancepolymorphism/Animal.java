package day22inheritancepolymorphism;

public class Animal {

    public int a = 12;

    public int c =45;

    public void eat(){
        System.out.println("Animal eat..");
    }

    //Constroctor oluşturduk.
    // Constructor oluşturulurken: "Access modifier+class ismi+parantez+süslü parantez" yazılır
    // (constructor isimleri class ismi ile aynı olmak zorundadır).
    // methodların return type'ı olur,constructor'da return type yoktur
    //methodlara istediğimiz ismi verebiliriz,Constructor'ın ismi class ismi ile aynı olmak zorundadır
    //method isimleri küçük harfle başlar,Constructor isimleri class ismi olacağından büyük harf ile başlar
    public Animal(){
        System.out.println("Animal");
    }
}
