package day10_SwitchCase_stringManipulations;

import java.util.Scanner;

public class ornek {

    //kullanicidan alinan ders ismine gore sinav sonucu yazan bir kod yazin
    // M= matematik T=turkce D=din bilgisi B=beden

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ders adini giriniz: ");
        char ders=scanner.next().toUpperCase().charAt(0);

        switch (ders){
            case 'M':
                System.out.println("75");
                break;
            case 'T':
                System.out.println("90");
                break;
            case 'D':
                System.out.println("70");
                break;
            case 'B':
                System.out.println("100");
                break;
            default:
                System.out.println("gecersiz ders girildi");
        }



    }

}
