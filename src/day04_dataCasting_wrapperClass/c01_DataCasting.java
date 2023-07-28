package day04_dataCasting_wrapperClass;

public class c01_DataCasting {
    public static void main(String[] args) {

        String str ="Java Candir";
       // int sayi1 = str;
        // char chr =str;
        //boolean bl1 = str;
        String s1 = str;

       // boolean bl2= 10;
        //boolean bl2 = 's';
        int sayi2 = 'k';
        double dnl1 = sayi2;

        int sayi3 = 10;
        double dbl2 = 4.5;
        short sh1 = 3;
        byte by1 = 7;

       // sayi3 = dbl2;
       // daha genis olanlar atamayi kabul ediyor ama kucukler buyukleri kabul etmiyor.

        by1 = (byte)dbl2;
        by1 = (byte)sh1;





    }
}
