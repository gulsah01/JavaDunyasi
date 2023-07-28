package day07_ifStatements;

import java.util.Scanner;

public class c06_BagimsizIfCumleleri {
    public static void main(String[] args) {
// kullanicidan pozitif bir tamsayi iste
        //sayi 3 veya 5 ile bolunebiliyorsa
        //"guzel sayi " yazdirin

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilensayi= scanner.nextInt();

        if (girilensayi %3 ==0  ||girilensayi%5 ==0){
            System.out.println("Guzel sayi");
        }


    }
}
