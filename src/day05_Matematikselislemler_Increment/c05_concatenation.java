package day05_Matematikselislemler_Increment;

public class c05_concatenation {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Candir";
        String s3 =" ";
        String s4 ="";

        int i1 = 3;
        int i2 = 4;
        //sadece bu variBLELARI KULLANARAK ASAGIDA VERILEN METINLERI YAZDIRIN
        //Java 7
        System.out.println(s1+s3+(i1+i2));
        //Java Candir
        System.out.println(s1+s3+s2);

        // 34 Candir
        System.out.println(s4+i1+i2+s3+s2);//s4 yani sonsuzluk ekleyerek i1 stringlesti

        // Java 34
        System.out.println(s1+s3+i1+i2);

        // 12 Java
        System.out.println(i1*i2+s3+s1);



    }
}
