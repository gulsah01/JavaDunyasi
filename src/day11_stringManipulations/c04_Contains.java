package day11_stringManipulations;

public class c04_Contains {
    public static void main(String[] args) {

         String str = "Java gun gectikce guzellesiyor";
         // str Java iceriyor mu ?
        System.out.println(str.contains("Java"));

        //str java icerir mi ?
        System.out.println(str.contains("java"));

        //str a icerir mi ?
        System.out.println(str.contains("a")); // true

        // *** contains metodu arana metnion sayisiyle ilgilenmez
        // sadece var veye yok sonucu dondurur.




    }
}
