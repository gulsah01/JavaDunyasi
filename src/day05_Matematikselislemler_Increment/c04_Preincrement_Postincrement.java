package day05_Matematikselislemler_Increment;

public class c04_Preincrement_Postincrement {
    public static void main(String[] args) {
        //javada bir onceki classda yaptigimiz gibi artirma ve atama veya
        //artirma ve yazdirma beraber olabilir.
        int a = 20;
        int b= 10;
        System.out.println(b= 2* a);
        System.out.println(a= b-5);

        a=10;
        // once a nin degerini b ye atayin sonra ayi artirin
        b = a++;
        System.out.println("a:"+a+"b:"+b); //a:11 b:10

        a=10;

        // once a nin degerini bir artirip sonra a nin degerini b ye ata
        b=++a;
        System.out.println("a:"+a+"b:"+b); //a;11 b:11

        

    }
}
