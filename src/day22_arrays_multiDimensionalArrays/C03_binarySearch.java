package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C03_binarySearch {//binary - ikili cift
    public static void main(String[] args) {
        int[] arr={0,13,4,7,10,2,1,23};
        System.out.println(Arrays.binarySearch(arr, 13)); // -8 arrayde 13 var mi buldu
        System.out.println(Arrays.binarySearch(arr,7)); //3
        System.out.println(Arrays.binarySearch(arr,10)); //-8
        System.out.println(Arrays.binarySearch(arr, 4)); //-2

        //index dondurasi gerekiyor bazen yanlis - dondurdu
        //binary yapisi cok buyuk datalari kolayca depolayabilmek icin
        //javanin kullandigi yontemdir.
        /* binary mantigi aranan sayinin kolayca bulunmasina dayanir
        ortadan baslar binarySearch in saglikli islemesi icin
         oncelikle arrayi kucukten buyuge dogru siralamasiniz
         siralama yapmadan binarySearch kullanilirsa sonuc icin hicbirsey diyemeyiz.
         */

        Arrays.sort(arr);// ONEMLI KISIM siralama yapip binary kullanmak
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 4, 7, 10, 13, 23]
        System.out.println(Arrays.binarySearch(arr, 13)); // 6
        System.out.println(Arrays.binarySearch(arr,7)); //4
        System.out.println(Arrays.binarySearch(arr,10)); //5
        System.out.println(Arrays.binarySearch(arr, 4)); //3

        //olmayan bir elementi aratirsak

        System.out.println(Arrays.binarySearch(arr, -5)); // -1
        System.out.println(Arrays.binarySearch(arr,5)); //-5
        System.out.println(Arrays.binarySearch(arr,25)); //-9
        System.out.println(Arrays.binarySearch(arr, 44)); //-9 yok ama olsaydi sagdan index 9 da olurdu demek



    }
}
