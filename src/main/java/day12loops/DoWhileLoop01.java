package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        int i = 1;

        while(i<1){
            System.out.println("While loop");  //while loop bazı durumlarda hiç çalışmayabilir,yani zero execution mümkündür.önce düşün sonra hareket et
            i++;
        }

        //Do while loop kullandığımızda loop body si içindeki kod en az 1 kere çalışır.zero execution mümkün değildir.önce hareket et sonra düşün
        int k = 1;
        do{
            System.out.println("do while loop" );
            k++;
        }while(k<1);


        // Example 1: bir ondalık sayının ondalık kısmındaki rakamların toplamını bulunuz.
        //           24,5673 ==>5+6+7+3=21

        double num = 24.5673; //. dan itibaren kesmemiz lazım.split keser ama split string i keser bu yüzden double ı stringe çeviririz
        System.out.println(num);

        //String.valueOf(num); methodu parantezin içine konulan data type'ı String'e çevirir.
        String str = String.valueOf(num);  //valueOf() methodu ne koyarsan koy stringe çeviri
        System.out.println(str);

        //regex için nokta kullanndığınızda önüne "\\" koyunuz.yani "\\." şeklinde kullanılır
       String decimalPart =  str.split("\\.")[1];
        System.out.println(decimalPart); //5673

       int decimalInt = Integer.valueOf(decimalPart); //valueOf Integer ile kullanılırsa int e çevirir.stribg ile kullanılırsa string e çevirir
        System.out.println(decimalInt); //5673

        int sum = 0;
        do{
            sum = sum + decimalInt%10;

            decimalInt = decimalInt/10;

        }while(decimalInt>0);
    }

}
