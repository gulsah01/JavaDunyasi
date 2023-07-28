package day18_sorular;

import java.util.Scanner;

public class soru_12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz: ");
        String ad= scan.nextLine();
        ad=(ad.substring(0,1).toUpperCase())+(ad.substring(1).replaceAll("\\w", "*"));

        System.out.println("lütfen soyadınızı giriniz: ");
        String soyad= scan.nextLine();
        soyad=(soyad.substring(0,1).toUpperCase())+(soyad.substring(1).replaceAll("\\w", "*"));

        System.out.println("lütfen kredi kartı numarınızı giriniz: ");
        String kartNo= scan.nextLine();


        if (kartNo.length()<16){
            System.out.println("geçersiz kart numarası!");
        }else {
            kartNo=kartNo.substring(0,kartNo.length()-4).replaceAll("\\w", "*") +kartNo.substring(15);
            System.out.println("İsim soyisim: " + ad+soyad);
            System.out.println("CCN: " + kartNo) ;
        }
    }
}
