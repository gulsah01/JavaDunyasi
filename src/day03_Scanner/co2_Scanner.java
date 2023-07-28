package day03_Scanner;

import java.util.Scanner;

public class co2_Scanner {
    public static void main(String[] args) {
        // kullanicidan bir tamsayi alip, karesini yazdirin.//
        //Scannerla bigiyi 3 adimda aliriz//
        Scanner scanner = new Scanner(System.in); //1. adim//
        System.out.println("Lutfen bir tamsayi giriniz"); //2. adim//
        int girilenSayi = scanner.nextInt(); //3.adim//
        System.out.println("Girilen sayinin karesi : "+ girilenSayi*2);






    }
}
