package day32maps;

public class Students {

    public String name ;
    public String email;  //String'e değer ataması yapmazsak değeri "null" olur.
    public int age;
    public boolean success;

    public Students(String name, String email, int age, boolean success) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;
    }

    @Override
    public String toString() {  //toString methodu bu class'tan oluşturduğumuz object'lerin detaylarını yazdırır
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                '}';
    }
}
