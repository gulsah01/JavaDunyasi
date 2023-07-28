package day05_Matematikselislemler_Increment;

import java.util.Scanner;

public class c02_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //kullanicidan 3 basamakli bir sayi alip
        //sayinin rakamlarini toplayip yazdiirn

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz ");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami =0;

        //ilk sayi icin birler basamagini bulalim
        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        girilenSayi = girilenSayi /10;
        //bu satira geldigimizde girilen sayiyi iki basamakli hale donusturduk

        birlerBasamagi= girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        girilenSayi = girilenSayi /10;

        // bu satirda tek basamakli

        birlerBasamagi= girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        girilenSayi = girilenSayi /10;

        System.out.println("Rakamlar toplami : "+ rakamlarToplami);









    }
}
