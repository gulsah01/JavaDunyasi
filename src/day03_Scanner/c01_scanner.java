package day03_Scanner;

import java.util.Scanner;

public class c01_scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String girilenIsim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String girilenSoyisim = scanner.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int girilenYas = scanner.nextInt();

       /* System.out.println("Isminiz :"+ girilenIsim);
        System.out.println("Soyisminiz :"+ girilenSoyisim);
        System.out.println("Yasiniz :"+ girilenYas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");*/

        System.out.println("Isminiz :"+ girilenIsim + "\nSoyisminiz :"+ girilenSoyisim + "\nYasiniz :"+ girilenYas +"\nKaydiniz basariyla tamamlanmistir.");


    }
}
