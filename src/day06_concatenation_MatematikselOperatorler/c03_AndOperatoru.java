package day06_concatenation_MatematikselOperatorler;

public class c03_AndOperatoru {
    public static void main(String[] args) {
        System.out.println(5 > 3 && 6 > 4 ); //true
        System.out.println( 5 < 3 && 6> 4 );//false
        System.out.println( 5 > 3 && 6 <= 4 );// true and false ==false
        System.out.println(5<=3 && 6 <=4 ); // false false ===false
        // && operatoru ile baglanan boolean ifadeler kac tane olursa olsun
        //hepsi true ise sonuc TRUE bunun disindaki tum durumlarda false dir.
        //bu yonuyle matematikteki carpmaya benzer
        //1*1*1*1*=1
        // 1*0*0 =0
        // bir sayinin hem 2 hem 3 hem de 5 ile bolunebilmesi lazim

        // and operatoru mukemmeliyetcidir

        int sayi =24;
        System.out.println(sayi %2 ==0 && sayi % 3 == 0 && sayi % 5 ==0); //

        // sayi 0 veya daha buyuk ve 100 veya daha kucuk olmalidir
        //sayi 0 ile 100 arasinda olmalidir(0 ve 100 dahil )

        System.out.println(sayi >= 0 && sayi <=100); //true






    }
}
