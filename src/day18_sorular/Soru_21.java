package day18_sorular;

import java.util.Scanner;

public class Soru_21 {
    public static void main(String[] args) {
      /*  Soru 21-)  ---> Mülakat Sorusu / Interview Sorusu / Leak Year

        Bir aydaki gün sayısını bulmak için bir Java programı yazın
          Örnek:
        Bir ay numarası girin: 2
        Bir yıl girin: 2016
        Şubat 2016'da 29 gün vardır
        ipucu:
        Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir.
         Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
                Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
                ipucu2:
        ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
                Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
                Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.

       */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen ay numarasi girin :");
        int ayNumarasi=scanner.nextInt();
        System.out.print("Lutfen yil girin :");
        int yil=scanner.nextInt();


        switch (ayNumarasi) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Gun sayisi 31 ");
            case 4, 6, 9, 11 -> System.out.println("Gun sayisi 30 ");
            case 2 -> {
                if ((yil % 4 == 0) && (yil % 100 != 0) || (yil % 100 == 0 && yil % 400 == 0)) {
                    System.out.println(yil + " yili artik yildir." + " Subat " + yil + " yilinda 29 gun vardir.");

                } else {
                    System.out.println( yil + " yili subat ayinda 28 gun vardir.");
                }
            }
        }


    }
}
