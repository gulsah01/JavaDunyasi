package day13_odevler;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /*Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sifrenizi giriniz");
        String sifre = scan.nextLine();
        if (    (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') &&
                (sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9') &&
                !sifre.contains(" ") &&
                sifre.length()>=10   )
        {
            System.out.println("sifre basariyla kaydedildi");
        }else
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z'))
            System.out.println("ilk harf kucuk harf olmali");
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9'))
            System.out.println("son karakter rakam olmali");
        if (sifre.contains(" "))
            System.out.println("sifre bosluk icermemeli");
        if (sifre.length()<10)
            System.out.println("uzunlugu en az 10 karakter olmali");

    }
}
