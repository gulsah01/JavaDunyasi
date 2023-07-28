package day07_ifStatements;

import java.util.Scanner;

public class c10_odev {
    public static void main(String[] args) {

        //  Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        //  yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");

        int girilenyas = scanner.nextInt();
        int calisilacakyil = 65-girilenyas;

        if (65 <= girilenyas){
            System.out.println("Emekli olabilirsin");}else {
            System.out.println("Emeki olmak icin calisilmasi gereken yil sayisi :" + calisilacakyil);
        }



    }
}
