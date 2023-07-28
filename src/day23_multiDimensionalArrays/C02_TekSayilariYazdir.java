package day23_multiDimensionalArrays;

public class C02_TekSayilariYazdir {
    public static void main(String[] args) {

        int [][] arr={{3,6,8},{2,5,9},{1,3},{12,23,34}};
        //verilen arraydeki tek sayilari yazdirin
        //aralarinda bir bosluk birkarak yanyana yazdirin
        //en sona da "toplam ..... sayi yazdirildi" seklinde aciklama yazdirin

        int sayac =0;
        for (int i = 0; i < arr.length ; i++) {//outer array kontrol eder
            for (int j = 0; j <arr[i].length ; j++) {// inner arrayi kontrol eder
                // arr[i][j] tum elementleri bana sirasiyla getirir
                if (arr[i][j] % 2 == 1){
                    System.out.println(arr[i][j]+ " ");
                    sayac ++;
                }
            }
        }

        System.out.println("\nToplam "+ sayac+ " adet sayi yazdirildi");
    }
}
