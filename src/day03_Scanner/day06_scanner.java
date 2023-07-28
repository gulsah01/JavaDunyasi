package day03_Scanner;

import java.util.Scanner;

public class day06_scanner {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int ilkSayi =scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int ikinciSayi = scanner.nextInt();

        int temp = ilkSayi;

        ilkSayi=ikinciSayi;
        ikinciSayi= temp;
        temp = 0;
        System.out.println("ilk sayinin degeri: "+ ilkSayi);
        System.out.println("ikinci sayinin degeri :"+ ikinciSayi);



    }
}
