package day06_concatenation_MatematikselOperatorler;

public class c02_KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b =20;
        //java da = isareti atama isaretidir.asignment
        b=2*a;
        //java da esitligi kontrol etmek istersek == kullaniriz
        System.out.println(b == 2*a);

        System.out.println(3*b > 5*a);
        System.out.println(b>=b-a);// true
        System.out.println(a<=b-a);
        //java da karsilastirma operatorlerinde kullanilan unlem isareti boolean degeri
        //tersine ceviri
        System.out.println(a < b);// true
        System.out.println(!(a< b));
        System.out.println(a != b);//true


        ;
    }
}
