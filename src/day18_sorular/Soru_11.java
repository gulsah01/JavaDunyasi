package day18_sorular;

import java.util.Scanner;

public class Soru_11 {
    public static void main(String[] args) {
        /*Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz.
                Giriş :
                 > Gandalf Grey 563245879632
                Çıktı :
		        > İsim : G****** G***
		         > CCN : **** **** 9632             */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim = scanner.nextLine();
        System.out.println(isim.toUpperCase().charAt(0) +isim.substring(1));
              isim=(isim.substring(0,1).toUpperCase())+
                      (isim.substring(1).replaceAll("\\w", "*"));

        System.out.println("Lutfen soyisminizi giriniz : ");
        String soyisim = scanner.nextLine();
        System.out.println(soyisim.toUpperCase().charAt(0) +soyisim.substring(1));
              soyisim=(soyisim.substring(0,1).toUpperCase())+
                      (soyisim.substring(1).replaceAll("\\w", "*"));

        System.out.println("Lutfen kart no giriniz :");
        String kartno = scanner.nextLine();

            if (kartno.length()<16){
                        System.out.println("Geçersiz kredi kart numarası girdiniz");
                    }else {
                        kartno=kartno.substring(0,kartno.length()-4).replaceAll("\\w", "*")
                                +kartno.substring(15);
                        System.out.println("İsim Soyisim: " +isim+" " +soyisim);
                        System.out.println("CCN: " + kartno) ;
                    }



    }
}