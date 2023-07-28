package day04_dataCasting_wrapperClass;

public class c03_CharDataCasting {
    public static void main(String[] args) {
        char ch1 = 'a';
        int sayi1 = ch1;

        System.out.println("ch1 :"+ ch1);
        System.out.println("sayi1 : "+ sayi1);
        //char data turu ozeldir
        //ascii tablosundaki sayisal degerleri de kullanabilir.
        // ayni sekilde char data turundeki bir variabli matematiksel bir islemde
        // kullanirsaniz o zaman aski tablosundaki degeri ile matematiksel isleme girer.

        int karakter = 120;
        char asciDegeri =(char)karakter;
        System.out.println("Verilen sayinin ascii tablosundaki karsiligu:" + asciDegeri);




    }
}
