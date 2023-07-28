package day07_ifStatements;

import java.util.Scanner;

public class c09_odev {
    public static void main(String[] args) {
      //  Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        //  yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.







        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");

        char karakter = scanner.next().charAt(0);
        if ('A'<= karakter && karakter <='Z'){
            System.out.println("Girilen karakter buyuk harf:");}else {
            System.out.println("Girilen karakter buyuk harf degil");
        }









        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

      // Scanner scanner= new Scanner(System.in);
       // System.out.println("lutfen bir harf giriniz");

       // char karakter = scanner.next().charAt(0);

       // if ('a'<= karakter && karakter <='z' ){
         //   System.out.println("Girilen karakter:"+karakter);
        }






    }



