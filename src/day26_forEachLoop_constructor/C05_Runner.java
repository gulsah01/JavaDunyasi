package day26_forEachLoop_constructor;

import java.util.*;

public class C05_Runner {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        Set<Integer> ogrenciListesi = new HashSet<>();
        String str =new String("Java Candir");

            C04                  obje      =            new     C04();
       // class adi/ data turu....isim..atama isreti..keyword   constructor
        System.out.println(obje.hiz);// o
        System.out.println(obje.kapasite);//0
        System.out.println(obje.ogrenciIsmi);//null
        System.out.println(obje.sayi);//10
        obje.method1();// method1 calisti

    }
    /*
    herhangi bir classin icinden baska bir classdaki
    class uyelerine(variable,method..) ulasmak isterseniz
    hedef classdan bir obje olusturabilirisiniz

    java da bir classdan obje olusturmak istediginizde
    MUTLAKA bir constructor calisir.

    Java da objeler classlardan uretilir
    classlarda obje uretilebilmesi icin constructor olmalidir
    Java bunu bildigi icin olusturulan her classa obje olusturulmasini saglayan DEFAULT
    CONTRUCTOR yerlestirilir

    default constructor GORUNMEZ
    parametresizdir ve body sinde kod yoktur.

    ONEMLI:
    Bir classda gorunur bir constructor yoksa o classda
    default constructor vardir.
    Gorunur bir constructor varsa java default constructoru siler.




    default kelimesi birlikte kullanildigi kelime ile anlam kazanir
     default deger : class level da olusturulan variable lara biz deger atamazsak
                    Java default degerler atar
    default case : switch statement da hicbir caseile uyumlu olmayan degerler
                    icin tanimlanan kodlardir.
    default access modifier: icinde bulunulan class ve icinde bulunulan
                     package da erisilebilen class uyelerini belirler.




     */
}
