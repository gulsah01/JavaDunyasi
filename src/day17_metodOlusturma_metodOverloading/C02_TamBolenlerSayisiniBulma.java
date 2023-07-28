package day17_metodOlusturma_metodOverloading;

import java.util.Scanner;

public class C02_TamBolenlerSayisiniBulma {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup
        // bize donduren bir method olusturun.
        // ornek: 20 pozitif tam bolenleri : 1,2,4,5,10,20 ptms;6

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif tam bolenleri sayisini bulmak istediginiz sayiyi giriniz");
        int sayi = scanner.nextInt();
        System.out.println("Pozitif tam bolenleri sayisi : "+tamBolenlerSayisi(sayi));
    }

    public static int tamBolenlerSayisi(int sayi) {
        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0){

                sayac++;
        }
    }
    return sayac;
}
        }

