package day14_ForLoops;

import java.util.Scanner;

public class c01_sifreKontrolu {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali
        // flag yontemini kullanalim
        // flag'i basta true yapalim, her uygun olmayan durumda false degeri atayalim

        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz ");
        String sifre =scanner.nextLine();

        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf >= 'a' && ilkHarf <='z' )){
            System.out.println("Sifre kucuk harfle baslamali");
            flag = false;
        }
        char sonKarakter =sifre.charAt(sifre.length()-1);

        if (!(sonKarakter>'0' && sonKarakter<='9')){
            System.out.println("son karakter rakam olmali");
            flag =false;
        }
        if(sifre.contains(" ")){
            System.out.println("sifre space icermemeli");
            flag= false;
        }
        if (!(sifre.length()>=10)){
            System.out.println("Uzunlugu en az 10 karakter olmali");
            flag = false;
        }
if (flag){
    System.out.println("sifre basariyla kaydedildi" );
}
    }
}
