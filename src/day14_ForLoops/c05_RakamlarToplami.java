package day14_ForLoops;

import java.util.Scanner;

public class c05_RakamlarToplami {

    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip,
        // rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlarini toplamak uzere pozitif bir tamsayi giriniz ");
        int girilenSayi = scanner.nextInt();
        int sayi = girilenSayi;   //1453
        int birlerBasamagi =0;
        int rakamlarToplami = 0;

        int basamakSayisi = (sayi+ "").length(); //4

        for (int i = 1; i <= basamakSayisi; i++) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi/=10;
        }
        { System.out.println("Girilen "+ girilenSayi +" sayisinin rakamlar toplami : "+ rakamlarToplami);

        }
    }
}
