package day24statickeywordencapsulation;

            //Encapsulation: "Data Hiding" (data gizlemek) demektir.
            //Data'yı Niçin Gizlersin? -Data'yı dış etkenlerden korumak için
            //Data'tı Nasıl Gizlersin? -Access modifier'ı "private" yaparak gizleriz


            //Data'yı gizledikten sonra başka class'lardan okumak istersen ne yaparsın?
            //        -"get method"lar (getter) oluşturarak gizlediğimiz data'ları okunur hale getirebiliriz.getter gizlenmiş methodları okumaya yarar

            //Data'yı gizledikten sonra başka class'lardan değiştirmek istersen ne yaparsın?
           //           -"set method"lar (setter) oluşturarak gizlediğimiz data'ları değiştirebiliriz

public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

     //get methodu oluşturduk.get methodlar public olurlar.variable'ın "data type"ı ile getter'ın return type'ı aynı olmalıdır.
     // get method'ları isimlendirilirken "get+variable ismi", ancak variable'ın data type'ı boolean ise "is+variable ismi" yazılır.
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    //data type boolean olduğunda get methodu "is" ile başlar,diğerlerinde hep "get" ile başlar
    public boolean isRetired() {
        return retired;
    }

    //return type'ı hepsinin "void"dir.setter'lar bize data vermez sadece değişimi yapar.set method parametre ile çalışır.
    // parametre variable data type'ında ve variable isminde olur.
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
