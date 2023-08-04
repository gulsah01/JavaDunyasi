package day31_DateTime;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); //2023-08-04T19:10:38.380526

        System.out.println(tarihSaat.getDayOfWeek()); //FRIDAY


        // bir for llop olusturup 1 den 10 000 e kadar olan sayilari toplayin
        // islem suresini nano saniye olarak yazdirin

        LocalDateTime baslamaZamani=LocalDateTime.now();
        int baslangicZamani =baslamaZamani.getNano();

        int toplam =0;

        for (int i = 1; i <10 ; i++) {
            toplam+=i;

        }
        LocalDateTime bitirmeZamani=LocalDateTime.now();
        int bitisZamani =tarihSaat.getNano();
        System.out.println("islem suresi : "+(bitisZamani-baslangicZamani));



    }
}
