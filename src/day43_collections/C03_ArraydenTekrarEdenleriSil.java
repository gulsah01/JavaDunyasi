package day43_collections;

import java.util.*;

public class C03_ArraydenTekrarEdenleriSil {
    public static void main(String[] args) {
        int [] arr={2,4,5,3,4,5,2,8,0,2,5,0,14,3,2,1};

        // verilen arraydeki tekrar eden elementleri silip
        // arrayi her elementin sadece 1 kere bulundugu bir hale donusturun

        // bos bir liste olusturup, arraydeki elementleri tek tek ele aldik
        // ele aldigimiz element list de yoksa list e ekledik

        List<Integer> tekrarsizList =new ArrayList<>();

        for (int each:arr
             ) {
            if (!tekrarsizList.contains(each)){
                tekrarsizList.add(each);
            }
        }
        System.out.println(tekrarsizList);

        // Ayni islemi set ile daha kolay yapariz

        Set<Integer> tekrarsizSet=new TreeSet<>(); // unige(tekrarsiz) ve sirali(treeset) verir
        for (int each:arr
             ) {
            tekrarsizSet.add(each);

        }
        System.out.println(tekrarsizSet);//[0, 1, 2, 3, 4, 5, 8, 14]

        System.out.println(Arrays.toString(arr));//[2, 4, 5, 3, 4, 5, 2, 8, 0, 2, 5, 0, 14, 3, 2, 1]
// tekrarsiz elementleri Set olarak elde ettik
        // array i set deki elementlerden olusan hale donusturelim

        arr= new int[tekrarsizList.size()];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0, 0, 0]

        int index=0;
        for (Integer each:tekrarsizSet
             ) {
            arr[index]=each;
            index++;

        }
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5, 8, 14]

    }
}
