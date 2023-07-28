package day05_Matematikselislemler_Increment;

public class c05_KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //karsilastirma operatorleri
        // istenen sart saplaniyorsa true, saglanmiyorsa false dir
         /* a b ye esit mi */
        System.out.println(a==b);//false
        System.out.println(2*a == b);//true

        // == olursa sagini hesaplayip soluna esit mi diye bakicaz
        System.out.println( a== b/2);//true
        // a b nin esit olmadigini != ile gosteririz.
        System.out.println(a!= b);
        System.out.println(a!= b/2);

        //a b den kucuk mu
        System.out.println(a<b);// true
        System.out.println(a<b/2);
        // a b den kucuk degil sarti
        System.out.println(!(a<b));
        //a b den kucuk vete esit mi
        System.out.println(a<=b);
        System.out.println(2*a<=b); // ikisinden birini saglamasi yeterli
        //a b den buyuk mu
        System.out.println(a>b);// false
        System.out.println(5*a>2*b);// true
        boolean c =2 *a >= b;
        //a nin 3 katinin b den buyuk olmadigi sartini kontrol edin
        System.out.println(!(a*3>b));


    }
}
