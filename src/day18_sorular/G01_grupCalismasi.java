  package day18_sorular;

   public class G01_grupCalismasi {
       public static void main(String[] args) {


       /* Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
                - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
                - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin.
        */
        girilenString("Neyi konusursan o cogalir",5,24);

              }
    public static void girilenString(String metin,int firstIndex,int lastIndex){
           if (firstIndex>lastIndex){
               System.out.println("First index, last indexden buyuk olamaz");
           } else if (lastIndex>(metin.length()-1)) {
               System.out.println("Girilen index metnin disinda");
           }else {
               for (int i = firstIndex; i <lastIndex ; i++) {
                   System.out.print(metin.charAt(i));
               }
           }
    }




        }
