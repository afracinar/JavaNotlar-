package day21accessmodifiersinheritance;

public class Q3Animal {

    /*
    class'ların içinde variable ve methodlar vardır.method action demektir yani harekettir.
    kod dünyasında atomic stractior tercih edilir.çok kalabalık uzun kodlar tercih edilmez.çalışan kod yeterli değildir.
    hem çalışmalı hem standartlara uygun olmalı.tekrar olmamalı,okunur olması gerekir.uzun kodlar için parçalar halinde method oluşturulur

    Java bu karmaşıklığı çözmek için bir yol oluşturmuştur:
      --Inheritance(miras)--çocukların ihtiyacı olan şeylerin aileden kullanabilmesine inheritance denir.
      Inheritance demek child class'ın parent class'taki method ve variable'ları kullanabilmesi demektir
      inheritance'i hayata geçirebilmek için class'lar arasındaa "parents-child" ilişkisinin kurulabilmesi gerekir



     */

    public void eat(){  //method oluşturduk

        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }

}
