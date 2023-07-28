package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C05_varOlanArrayeYeniDegerAatama {
    public static void main(String[] args) {

        /*
        var olan bir array e lenght olarak belirlenenden
        daha fazla element ATANAMAZ

        Ancak var olan bir arraye baska bir arrayi deger olarak atayabiliriz.
        */

        int[] arr={3,4,5,6,8,1};
        System.out.println(arr.length);//6

        //arr[6]=13;//ArrayIndexOutOfBoundsException
        arr=new int[8];//artik yeni arr var
        System.out.println(Arrays.toString(arr));

        String[] harfler={"a","n","y"};
        String[] yeniHarfler={"k","l","m","n"};
        harfler=yeniHarfler;        // yepyeni bir array degeri atayabiliriz

        System.out.println(Arrays.toString(harfler));//[k, l, m, n]

        System.out.println(Arrays.toString(yeniHarfler));//[k, l, m, n]

        harfler=new String[]{"x"};//eger var olan bir arraye yeni deger atamasi icin
                                 //liste yazmak istiyorsak asagidaki gibi atama yapabiliriz

        System.out.println(Arrays.toString(harfler));//[x]




    }
}
