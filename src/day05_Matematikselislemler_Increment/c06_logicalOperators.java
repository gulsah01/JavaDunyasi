package day05_Matematikselislemler_Increment;

public class c06_logicalOperators {
    public static void main(String[] args) {
        //Java da karsilastirma SADECE iki variabei karsilastirir
        int a =10;
        int b =20;
        int c =15;
        //ucunun birbirine esit oldugunu kontrol eder.
        System.out.println(a== b && b == c);
        // a sayisinin pozitif ve 2 ile tam bolunebilir oldugunu kontrol edin
        System.out.println(a>0 && a%2==0);
        //b sayisinin 10 ile 50 arasinda oldugunu kontrol edin
        System.out.println(b<10 && b<50);
        //b sayisinin 10 ile 50 arasinda olmadigini kontrol edin
        System.out.println(b<10 || 50<b);


    }
}
