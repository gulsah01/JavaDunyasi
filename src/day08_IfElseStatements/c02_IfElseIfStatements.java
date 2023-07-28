package day08_IfElseStatements;

import java.util.Scanner;

public class c02_IfElseIfStatements {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi isteyin
        //sayi 3 e bolunuyorsa 3 un
        // sayi 5 e bolunuyorsa 5 in kati
        // ikisine birden bolunuyorsa super sayoi
        //ikisine de bolunmuyorsa yaramaz sayi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int girilensayi = scanner.nextInt();

        if (girilensayi % 3 == 0 && girilensayi% 5 == 0 ) System.out.println("super sayi");
        else if (girilensayi% 3 == 0 ) System.out.println("3 un kati");
        else if (girilensayi % 5 == 0 ) System.out.println("5 in kati");
        else System.out.println("Yaramaz sayi");

    }
}
