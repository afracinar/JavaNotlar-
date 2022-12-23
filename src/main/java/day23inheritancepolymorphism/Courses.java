package day23inheritancepolymorphism;

public class Courses {

    public void liveSessions(){               //methodu oluşturduk

        System.out.println("Courses are live");
    }

    public Courses(){                               //Constructor oluşturduk.access modifier+class ismi+parantez+süslü parantez
        System.out.println("Constructor A");
    }

    public Courses(String s){
        System.out.println("Constructor B");
    }

}
