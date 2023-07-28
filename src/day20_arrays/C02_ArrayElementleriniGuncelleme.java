package day20_arrays;

import java.util.Arrays;

public class C02_ArrayElementleriniGuncelleme {
    public static void main(String[] args) {

        int[] sayilar=new int[6];
        System.out.println(Arrays.toString(sayilar));//[0, 0, 0, 0, 0, 0]

        //2. index deki elementi 5 yapin
        sayilar[2]=5;
        System.out.println(Arrays.toString(sayilar));//[0, 0, 5, 0, 0, 0]

        //2. indexdeki sayiyi 7 yapin
        sayilar[2]=7;
        System.out.println(Arrays.toString(sayilar));//[0, 0, 7, 0, 0, 0]

        //index kullanmadan bir elemente atama yapmak mumkun DEGILDIR.

        //5. Iindex deki elementi 8 yapin
        sayilar[5]=8;
        System.out.println(Arrays.toString(sayilar));//[0, 0, 7, 0, 0, 8]

        //6. index de yeni bir element ekleyelim
        sayilar[6]=20;
        System.out.println(Arrays.toString(sayilar));//ArrayIndexOutOfBoundsException
        //run dedikten sonra bu hata olustugu icin buna Run Time Error denilir

        /*
        uzunlugu verilen bir arrayde var olan elementler index
        ile update edilebilir ANCAK
        yeni element ekleyip uzunlugunu degistirmek isterseniz
        Run Time Error olusur
         */









    }
}
