package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class c03_ternary {
    public static void main(String[] args) {
        //kullanicidan pozifit bir tamsayi alin
        //sayinin tek micift mi oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen pozifit bir tamsayi giriniz");
        int sayi = scanner.nextInt();
        if(sayi % 2== 0){
            System.out.println("cift sayi");
        }else{
            System.out.println("tek sayi");
        }
        // if else ile yapabilecegoimiz basit islemleri
        //daha kisa olarak yazabilmak icin ternary kullanilir

        System.out.println(sayi%2 == 00? "cift sayi" : "tek sayi");




    }
}
