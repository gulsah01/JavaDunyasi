package day08_IfElseStatements;

import java.util.Scanner;

public class c04_ifElseIfStatements {
    public static void main(String[] args) {

        //Kullanicidan bir tamsayi isteyin
        //  sayi 3 e bolunuyorsa 3 un
        //  sayi 5 e bolunuyorsa 5 in kati
        //  ikisine birden bolunuyorsa super sayi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();
        if (sayi %3== 0 && sayi %5== 0 ) {System.out.println("Super Sayi");}
        else if (sayi % 3 ==0 ) {System.out.println("3 un kati");}
        else if (sayi % 5 == 0) {System.out.println("5 in kati ");}


    }
}
