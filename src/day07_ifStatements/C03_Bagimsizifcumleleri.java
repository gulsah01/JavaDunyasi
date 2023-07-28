package day07_ifStatements;

import java.util.Scanner;

public class C03_Bagimsizifcumleleri {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilensayi= scanner.nextInt();

        if (girilensayi % 5 == 0) System.out.println("Sayi 5’in tam kati");


    }
}
