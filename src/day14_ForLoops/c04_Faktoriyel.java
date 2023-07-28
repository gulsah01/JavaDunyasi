package day14_ForLoops;

import java.util.Scanner;

public class c04_Faktoriyel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // or : 6!= 6*5*4*3*2*1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 20 den kucuk bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        int carpim = 1;
        for (int i = 1; i <=sayi ; i++) {
            carpim *= i ;
        }
        System.out.println("girilen sayi olan " + sayi+"! = " + carpim);










    }
}
