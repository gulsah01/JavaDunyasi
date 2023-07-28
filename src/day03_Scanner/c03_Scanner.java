package day03_Scanner;

import java.util.Scanner;

public class c03_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir double sayi giriniz.");
        double girilenDouble = scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz.");
        int girilenInt =scanner.nextInt();
        System.out.println("iki sayinin tolami" + (girilenInt+girilenDouble));
        System.out.println("iki sayinin carpimi"  + girilenInt*girilenDouble);
        }
    }

