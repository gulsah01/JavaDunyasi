package day03_Scanner;

import java.util.Scanner;

public class c07_scannerodev {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin degerlerini degistirin(swap).//

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int ilkSayi =scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int ikinciSayi = scanner.nextInt();


        System.out.println("ilk sayinin degeri: "+ (ilkSayi+ikinciSayi-ilkSayi));
        System.out.println("ikinci sayinin degeri :"+ (ikinciSayi+ilkSayi-ikinciSayi));


    }
}
