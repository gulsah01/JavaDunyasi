package day03_Scanner;

import java.util.Scanner;

public class c05_scanner {
    public static void main(String[] args) {
        //Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz.");
        double yaricap = scanner.nextDouble();
        System.out.println("Cemberin cevresi:"+ 2*3.14*yaricap);
        System.out.println("Dairenin alani: "+2*3.14*yaricap);
    }
}
