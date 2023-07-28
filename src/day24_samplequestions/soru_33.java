package day24_samplequestions;

import java.util.Scanner;

public class soru_33 {
    public static void main(String[] args) {
        /*Soru 33-)
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın
        (boşluklar ve özel karakterler dahil).
        Örnek:
        String str=''Kodlama harika.''
        String arr[]: ".etaerg si gnidoC"
        İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text");
        String str = scanner.nextLine();
        String tersCumle=reverseText(str);
        System.out.println("Ters Cevrilmis Cumle :"+ tersCumle);
    }

    public static String reverseText(String text) {
        char[] cumle = text.toCharArray();
    int start =0;
    int finish =cumle.length -1;

    while(start<finish){
        if (!Character.isLetter((cumle[start]))){
            start++;
        } else if (Character.isLetter(cumle[finish])) {
            finish--;
        }else {
            char yeni=cumle[start];
            cumle[start]=cumle[finish];
            cumle[finish]=yeni;
            start++;
            finish--;
        }
    }
return new String(cumle);

    }
}
