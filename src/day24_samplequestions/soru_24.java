package day24_samplequestions;

public class soru_24 {
    public static void main(String[] args) {
       /* Soru 24-)
        20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
                Örnek:
        100'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
        */

        System.out.println("=============================1. cozum ======================================");
        System.out.print("20 den 0 a kadar citf sayilar :" + " ");
        for (int i = 20; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("==============================2. cozum ====================================");

        System.out.print("20 den 0 a kadar citf sayilar :" + " ");
        int sayi = 20;
        while (sayi >= 0) {
            System.out.print(sayi+" ");
            sayi -= 2;

        }

}
}
