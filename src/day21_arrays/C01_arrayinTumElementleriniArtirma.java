package day21_arrays;

import java.util.Arrays;

public class C01_arrayinTumElementleriniArtirma {
    public static void main(String[] args) {

        //bir arrrayin tum elementlerini 2 artirin //FOR LOOOOOOOOOP!

        int[] arr={3,4,6,8,1};

        //Soru 1- Verilen bir int array’in tum elemanlarini
        // 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.
       arr=arrayElementlerini2Artir(arr);
        System.out.println(Arrays.toString(arr));
    }
      public static int[] arrayElementlerini2Artir(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            //arr[i]=arr[i]=+2;
            arr[i]+=2;

        }

        return arr;
    }




}
