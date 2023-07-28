package day03_Scanner;

import java.util.Scanner;

public class c04_scanner {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki kenarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        System.out.println("Dikdortgenin alani : " + kenar2*kenar1);

    }
}
