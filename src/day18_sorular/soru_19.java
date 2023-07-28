package day18_sorular;

import java.util.Scanner;

public class soru_19 {
    public static void main(String[] args) {

        /*Soru 19-)  Method Sorusu
        Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
                ipucu:
        Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dogum tarihinizdeki gun numarasini giriniz : ");
        int gun =scanner.nextInt();
        System.out.println();
        System.out.print("Doğum tarihinizdeki ay numaranızı giriniz : ");
        int ay = scanner.nextInt();

        String burc = burcHesapla(gun, ay);
        System.out.println("Burcunuz: " + burc);

    }

public static String burcHesapla(int gun , int ay){
      if ((ay==12 && gun >=22) ||(ay==1 && gun<20)) {
          return "Oglak";
      } else if ((ay == 1 && gun >= 21) || (ay == 2 && gun <= 19)) {
          return "Kova";
      } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
          return "Balik";
      } else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
          return "Koc";
      } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 20)) {
          return "Boga";
      } else if ((ay == 5 && gun >= 21) || (ay == 6 && gun <= 21)) {
          return "Ikizler";
      } else if ((ay == 6 && gun >= 22) || (ay == 7 && gun <= 22)) {
          return "Yengec";
      } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 23)) {
          return  "Aslan";
      } else if ((ay == 8 && gun >= 24) || (ay == 9 && gun <= 23)) {
          return "Basak";
      } else if ((ay == 9 && gun >= 24) || (ay == 10 && gun <= 23)) {
          return "Terazi";
      } else if ((ay == 10 && gun >= 24) || (ay == 11 && gun <= 22)) {
          return "Akrep";
      }else if ((ay == 11 && gun >= 23) || (ay == 12 && gun <= 2)){
          return "Yay";
      }else {
          return "Yanlis tarih girdiniz";
      }
}
}
