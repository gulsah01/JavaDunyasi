package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_TumElementleriToplama {
    public static void main(String[] args) {
        int[] arrTek={3,7,1,9};
        //Bu arrayin tum elementlerini toplayin

        int toplam =0;
        for (int i = 0; i <arrTek.length ; i++) {
            toplam +=arrTek[i];

        //arrTek[i] index degistikce bize arraydeki tum elementleri sirasiyla getirir


        }
        System.out.println("arrTek in elementleri toplami :"+ toplam);

        int [][] sayilar ={{1,2,5},{7,4},{9},{3,0,1,6,8}};
        //arr [i] inner arrayleri getirir
        //arr[i][j] bize int elementleri getirir
        //yani kat sayisi kadar index e yani forloop a ihtiyacimiz var

        toplam =0;
        for (int i = 0; i <sayilar.length ; i++) {// disardaki for loop outer arrayi kontrol eder

            for (int j = 0; j <sayilar[i].length ; j++) {// icerdeki for loop inner arrayleri kontrol eder.
                //sayilar[i][j] sirasiyla her bir int elementi getirir

                toplam+=sayilar[i][j];
            }
        }

        System.out.println("sayilar elementlerinin toplami :"+ toplam);
    }
}
