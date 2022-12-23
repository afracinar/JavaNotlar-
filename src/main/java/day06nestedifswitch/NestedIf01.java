package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
        Password'un ilk harfi büyük harf ise
          'A' olursa geçerli password aksi halde geçersiz password
        Password'un ilk harfi küçük harf ise
           'z' olurs geçerli password aksi halde geçersiz password
        */
        //'nested' iç içe geçmiş demektir(sehpa örneği gibi)
        //nestedif mecbur kalınmadıkça kullanılmamalıdır

        String pwd ="xy12!";

        if(pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){   //

            if (pwd.charAt(0)=='A'){
                System.out.println("Geçerli password..");
            }else{
                System.out.println("Geçersiz password..");
            }

        }else if(pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){

            if(pwd.charAt(0)=='z'){
                System.out.println("Geçerli password");
            }else{
                System.out.println("Geçersiz password");
            }

        }else{
            System.out.println("İlk karakter harf olmalıdır"); //kullanıcı harf değil rakam verirse uyarı mesajı koymalıyız.
        }

        //2.yol

        String pwd1 ="xy12!";

        char ilkHarf = pwd1.charAt(0);  //en baştan bunu koyarsak her defasında pwd.charAt(0) ifadesini kullanmamış oluruz,sadeleşir

        if(ilkHarf>='A' && ilkHarf<='Z'){   //nestedif tavsiye edilmez çünkü java nested kodları incelerken çok zaman harcar.buna time complexity denir
                                            //bu yüzden mümkünse nested kod yazmamaya çalışınız.bazen zorunda kalabiliriz
            if (ilkHarf=='A'){
                System.out.println("Geçerli password..");
            }else{
                System.out.println("Geçersiz password..");
            }

        }else if(ilkHarf>='a' && ilkHarf<='z'){

            if(ilkHarf=='z'){
                System.out.println("Geçerli password");
            }else{
                System.out.println("Geçersiz password");
            }

        }else{
            System.out.println("İlk karakter harf olmalıdır"); //kullanıcı harf değil rakam verirse uyarı mesajı koymalıyız.
        }




    }

}
