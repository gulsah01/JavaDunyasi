package day05_Matematikselislemler_Increment;

public class c01_MatematikselIslemler {
    public static void main(String[] args) {
        int a =27;
        int b = 4;
        //iki tam sayiyi yani int bolersen tam sayi verir
        System.out.println(a/b);
        System.out.println(32/5); //6

        //eger double varsa sonucu double yani virgullu verir.
        double c = 27;
        System.out.println(c/b); //27/4=6.75

        //a yi b ye bolup sonucu ondalikli olarak yazdirin
        double sonuc1  = a/b ;
        System.out.println("Sonuc1 :"+ sonuc1);// 6
        double sonuc2 = (double)(a/b);
        System.out.println("Sonuc2 :"+ sonuc2); //6
        double sonuc3 = (double) a/b;
        System.out.println("Sonuc3 :"+sonuc3); //6.75


        System.out.println(2567 / 10);//256
        System.out.println(2567 %10);//7

        System.out.println(256 / 10 ); // 25.6 ==> 25
        System.out.println(256 % 10 ); // 6

        System.out.println(25 / 10 ); // 2.5 ==> 2
        System.out.println(25 % 10 ); // 5

        System.out.println(2 / 10 ); // 0.2 ==> 0
        System.out.println(2 % 10 ); // 2





    }
}
