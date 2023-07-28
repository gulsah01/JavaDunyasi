package day05_Matematikselislemler_Increment;

public class c03_increment_decrement {
    public static void main(String[] args) {
        int sayi = 10;
        // sayi variablenin degerini 2 katinin 5 fazlasini yapin

        sayi =2*sayi+5;
        System.out.println(sayi);

        //2. yontemle yaparsak
        sayi = 10;
        sayi *= 2;
        sayi+= 5;
        System.out.println(sayi);

        int a = 10;
        // a nin degerini yeni olusturdugumuz b ye atayip sonra anin degerini bir artirin
        // a ve b yi yazdirin

        int b = a;
        a++;
        System.out.println("a:"+a+"b:"+b);// a:11 b:10

        a= 10;
        //a nin degerini bir artirin sonra anin degerini b ye atayin
        a++;
        b=a;
        System.out.println("a:"+a+"b:"+b); // a:11 b:11







    }
}
