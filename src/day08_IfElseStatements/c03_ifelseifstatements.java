package day08_IfElseStatements;

import java.util.Scanner;

public class c03_ifelseifstatements {
    public static void main(String[] args) {
       // Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu degilse) 65 ve ustu ise BB,
        //(65 ve ustu de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD

        //Bir if - else if -else ... statements else ile bitmek zorunda degildir
        // else ile biten kodlar , her durum icin mutlaka bir sonuc uretirler.
        // else ile bitmezse tum durumlari kapsamaz yani bai degerler icin sonuc uretmeyebilir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not = scanner.nextDouble();
        if (not >= 85 ) System.out.println("AA");
        else if (not >= 65 ) System.out.println("BB");
        else if (not >= 50) System.out.println("CC");
        else System.out.println("DD");


    }
}
