package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class c04_charCasting {
    public static void main(String[] args) {
        //kullanicidan bir char isteyin
        //girilen chardan sonraki 3 karakteri yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lufen ascii tablosundan bir karakter giriniz.");
        char girilenkrk = scanner.next().charAt(0);
        System.out.println("Girilen karakter : "+ girilenkrk);
        System.out.println("Girilen karakterden sonrski 3 karakter:"+
                (char) (girilenkrk+1)+"," +
                (char)(girilenkrk+2)+","+
                (char)(girilenkrk+3));

    }
}
