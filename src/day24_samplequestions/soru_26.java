package day24_samplequestions;

import java.util.Scanner;

public class soru_26 {
    public static void main(String[] args) {

        /*Soru 26-)
        Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
                NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
                Örnek:
        Giriş :6
        Çıkış: 6 Mükemmel Sayıdır
        Giriş :7
        Çıkış:7 Mükemmel Sayı Değildir
        ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz
         */

        Scanner scanner =new Scanner(System.in);
        System.out.print("Please write a number :");
        int number =scanner.nextInt();

            int total=0;
            for (int i = 1; i < number; i++) {
                if (number%i==0){
                    total+=i;
                }

            }
           if (total==number){
               System.out.println("Mukemmel sayi :"+ number);
           }else {
               System.out.println("Mukemmel sayi degildir :"+ number);
           }

        }
    }

