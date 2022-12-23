package day25exception;

public class E03 {

    public static void main(String[] args) {

        String str ="Ali";
        getNumOfChars(str); //3

        String s = "";
        getNumOfChars(s); //0

        String t =  null;
        getNumOfChars(t); //NullPointerException
        //eğer length() methodunda null kullanırsanız bu exception'u alırsınız


    }
    //Bir String'de bulunan karakterlerin sayısına bulabilmek için bir methı ıluşturun
    public  static void getNumOfChars(String str){

        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("lengt() methodunda bir problem oluştu.");

            e.printStackTrace(); //teknik olarak hatayı görüyoruz
        }

    }


}
