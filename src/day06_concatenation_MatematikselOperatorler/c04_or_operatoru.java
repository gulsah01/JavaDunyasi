package day06_concatenation_MatematikselOperatorler;

public class c04_or_operatoru {
    public static void main(String[] args) {
        // or operatoru iyimsrdir
        //yani tek bir true bile yeterli olur
        // or operatorunde tum mantiksal ifadeler false ise sonuc falsedir,
        // degil ise TRUE dir
        // matematikteki toplama islemine benzer
        System.out.println( 3 > 5 || 6>4 );// true
        System.out.println(3 < 5 || 6>4 ); // true
        System.out.println( 3 < 5 || 6< 4 ); // true
        System.out.println( 3 > 5 || 6 < 4 ); // false
        // sayi 3 e veya 5 e bolunmelidir
        int sayi = 24;
        System.out.println( sayi % 3 == 0 || sayi %5 ==0 ); //true ||false == true
        // sayi 0 dan buyuk veya 100 den kucuk olmalidir
        System.out.println( sayi >0 || sayi < 100 );// true || true == true
        



    }
}
